package com.norman.config;

import com.norman.config.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** 静态资源配置 同时解决跨域问题 */
@Configuration
@EnableWebMvc
@EnableSwagger2 // 书写API
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("(?!/static/**)|/**")// SpringMVC拦截，url不包含/static/**并且任何路径
                .allowedOrigins("*","null")
                .allowedMethods("*");// 允许所有请求
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加token拦截器
        registry.addInterceptor(new TokenInterceptor())
                .excludePathPatterns("/static/**")// 排除静态资源路径
                .excludePathPatterns("/swagger**/**")// 排除拦截路径
                .excludePathPatterns("/v2/api-docs");// 排除拦截路径
        super.addInterceptors(registry);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/static/**")
                .addResourceLocations("file:/Users/v_maqinglong/Desktop/mini")

                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/news_image")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/news_html")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/mini_author")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/mini_video")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/mini_image")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/tik_video")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/tik_image")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/comment")
                .addResourceLocations("file:/Users/v_maqinglong/Documents/oss/image")
                .addResourceLocations("classpath:/static/")// 指定resources/static目录为静态资源目录
                .setCachePeriod(1);

        // umi的资源文件uri写的 /xxx
        registry.addResourceHandler("/*")
                .addResourceLocations("classpath:/static/");


    }

}
