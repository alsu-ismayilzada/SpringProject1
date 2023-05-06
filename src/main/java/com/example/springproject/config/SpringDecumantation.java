package com.example.springproject.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.awt.SystemColor.info;

@Configuration
@OpenAPIDefinition
public class SpringDecumantation {

    @Bean
    public OpenAPI openAPI(){
        return OpenAPI().info(
                new info()
                        .title("Alsu Ismayilzade terefinden yazilib")
                        .version()
        )
    }

}
