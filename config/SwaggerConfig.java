package com.example.msa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // Enables Swagger 2 for the Spring Boot application
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) // Specifies Swagger 2
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.msa.controller")) // Scan controllers
                .paths(PathSelectors.any()) // Include all API paths
                .build();
    }
}
