package com.trafficsignrecognition.model.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ss on 2018/4/28.
 */

@Configuration
public class ImageConfiguration  extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment env;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String baseDir = "file:" + env.getProperty("upload.baseDir");

        registry.addResourceHandler("/**").addResourceLocations(baseDir);
    }

}
