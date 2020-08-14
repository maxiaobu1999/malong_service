package com.norman.simple;

import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * 练习用的接口
 */
@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/sample")// 配置url映射,一级
public class SampleController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    /**
     * http://localhost:8088/sample/downloadFile?filePath=/Users/v_maqinglong/Downloads/f9a220cf5718c0b.jpg
     * 分片下载添加请求头： List<String> range = headers.get("Range");// range=bytes=0-100
     *
     * @param filePath 服务器主机上的绝对路径
     * @return ResponseEntity标识整个http相应：状态码、头部信息以及相应体内容。因此我们可以使用其对http响应实现完整配置。
     */
    @RequestMapping("/downloadFile")
    @SkipTokenValidate
    public ResponseEntity<FileSystemResource> downloadFile(@RequestHeader HttpHeaders headers, String filePath) {
        logger.info("downloadFile:filePath={}", filePath);
        File file = new File(filePath);
        if (!file.exists()) {
            return ResponseEntity.notFound().build();
        }
        String md5Hex = null;// 文件md5
        FileInputStream inputStream = null;
        try {
             inputStream = new FileInputStream(filePath);
            md5Hex = DigestUtils.md5Hex(inputStream);
            logger.info("downloadFile:md5Hex={}", md5Hex);
            md5Hex = computeContentMD5Header(inputStream);
            logger.info("downloadFile:md5Hex2={}", md5Hex);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Cache-Control", "no-cache, no-store, must-revalidate");
        responseHeaders.add("Content-Disposition", "attachment; filename=" + file.getName());
        responseHeaders.add("Pragma", "no-cache");
        responseHeaders.add("Expires", "0");
        responseHeaders.add("Last-Modified", new Date().toString());
        responseHeaders.add("ETag", md5Hex);// 做缓存校验的
        if (!StringUtils.isEmpty(md5Hex))
            responseHeaders.add("Content-MD5", md5Hex);// 做完整性校验的校验的

        return ResponseEntity.ok().headers(headers).contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new FileSystemResource(file));
    }


    /**
     * Consume the stream and return its Base-64 encoded MD5 checksum.
     */
    public static String computeContentMD5Header(InputStream inputStream) {
        // Consume the stream to compute the MD5 as a side effect.
        DigestInputStream s;
        try {
            s = new DigestInputStream(inputStream,
                    MessageDigest.getInstance("MD5"));
            // drain the buffer, as the digest is computed as a side-effect
            byte[] buffer = new byte[8192];
            while(s.read(buffer) > 0);
            return new String(
                    org.apache.commons.codec.binary.Base64.encodeBase64(
                            s.getMessageDigest().digest()),
                    "UTF-8");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
