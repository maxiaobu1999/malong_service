package com.norman.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.*;

@SuppressWarnings("Duplicates")
public class DownloadUtil {


    /** 字符串保存成html */
    public static void saveHtml(String html, final String saveDir, String fileName) throws IOException {
        InputStream is = null;
        byte[] buf = new byte[2048];
        int len;
        FileOutputStream fos = null;
        // 储存下载文件的目录
        String savePath = isExistDir(saveDir);
        is =  new ByteArrayInputStream(html.getBytes());
        File file = new File(savePath, fileName);
        fos = new FileOutputStream(file);
        while ((len = is.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.flush();
    }

    /**
     * @param url     下载连接
     * @param saveDir 储存下载文件的SDCard目录
     */
    public static void download(final String url, final String saveDir, String fileName) {
        new File(saveDir).mkdirs();

        Request request = new Request.Builder().url(url).build();
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        });
        OkHttpClient okHttpClient = builder.build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            InputStream is = null;
            byte[] buf = new byte[2048];
            int len;
            FileOutputStream fos = null;
            // 储存下载文件的目录
            String savePath = isExistDir(saveDir);
            try {
                is = response.body().byteStream();
//                long total = response.body().contentLength();
                File file = new File(savePath, fileName);
                fos = new FileOutputStream(file);
//                long sum = 0;
                while ((len = is.read(buf)) != -1) {
                    fos.write(buf, 0, len);
//                    sum += len;
                }
                fos.flush();
                // 下载完成
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (is != null)
                        is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (fos != null)
                        fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param saveDir
     * @return
     * @throws IOException 判断下载目录是否存在
     */
    private static String isExistDir(String saveDir) throws IOException {
        // 下载位置
        File downloadFile = new File(saveDir);
        if (!downloadFile.mkdirs()) {
            downloadFile.createNewFile();
        }
        String savePath = downloadFile.getAbsolutePath();
        return savePath;
    }

    public static String getImageName(String url) {
        String fileName = null;
        if (url == null) return fileName;
        int i = url.lastIndexOf("%");
        String substring = url.substring(i + 1);
//        System.out.println(substring);
        if (!substring.contains(".jpg")) {
            System.out.println(substring + "+++++");
            substring = substring + ".jpg";
        }
        return substring;

    }

    public static String getVideoName(String url) {
        String fileName = null;
        if (url == null) return fileName;
        int i = url.indexOf(".mp4");
        String substring = url.substring(i - 20, i + 4);
//        System.out.println(substring);
        return substring;

    }
}
