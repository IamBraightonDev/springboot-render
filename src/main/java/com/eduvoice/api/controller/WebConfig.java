package com.eduvoice.api.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // permite todos los endpoints
                        .allowedOrigins("https://eduvoicepro.vercel.app/", "http://localhost:3305/") // frontend
                        .allowedMethods("*") // GET, POST, PUT, DELETE...
                        .allowedHeaders("*")
                        .allowCredentials(true); // si usas cookies o auth
            }
        };
    }

}
