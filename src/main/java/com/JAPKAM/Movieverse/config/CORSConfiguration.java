package com.JAPKAM.Movieverse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfiguration {
    @Bean
    public WebMvcConfigurer webMVCConfig(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("http://localhost:3000");
                registry.addMapping("/**")
                        .allowedMethods("GET","POST","PUT","DELETE")
                        .allowedOrigins("http://localhost:3000","https://movieverse-frontend-staging.up.railway.app","https://movieverse-frontend-production.up.railway.app");
            }
        };
    }
}
