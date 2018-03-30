package com.trafficsignrecognition.model.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * Created by ss on 2018/3/30.
 */

@Configuration
public class FileUploadConfiguration {

    @Bean
    public MultipartConfigElement multipartConfigElement() {

        MultipartConfigFactory factory = new MultipartConfigFactory();

        factory.setMaxFileSize("256KB");
        factory.setMaxRequestSize("512KB");

        return factory.createMultipartConfig();
    }
}
