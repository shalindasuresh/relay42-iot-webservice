package com.relay42.iot.device_analyser.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Relay42 IOT Rest API")
                        .description("Open API Documentation IOT Device query")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Shalinda Suresh")
                                .email("shalindask@gmail.com"))
                );
    }
}