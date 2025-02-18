package com.sambathreasmey.user_auth_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigs {
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
