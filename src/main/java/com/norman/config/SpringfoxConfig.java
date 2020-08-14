package com.norman.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //必须存在
@EnableSwagger2 //必须存在
@EnableWebMvc //必须存在
@ComponentScan(basePackages = {"com.norman"}) //必须存在 扫描的API Controller package name 也可以直接扫描class (basePackageClasses)
public class SpringfoxConfig {
    @Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("马小布", "https://www.taobao.com", "maqinglong1999@163.com");
        return new ApiInfo("MaLong项目的API接口",//大标题 title
                "小标题：不知道写啥",//小标题
                "0.0.1",//版本
                "www.fangshuoit.com",//termsOfServiceUrl
                contact,//作者
                "Blog",//链接显示文字
                "https://www.taobao.com"//网站链接
        );
    }
}
