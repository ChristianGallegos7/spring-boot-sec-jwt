package com.helios.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helios.security.services.models.validation.UserValidation;

@Configuration
public class ValidationConfig {

    @Bean
    public UserValidation userValidation() {
        return new UserValidation();
    }
}
