package com.cgmconsulting.jsonserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.modelmapper.*;

@ControllerAdvice
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    
    @Bean
    public ModelMapper ModelMapper() {
    	ModelMapper mapper = new ModelMapper();
    	mapper.getConfiguration()
    		.setPropertyCondition(Conditions.isNotNull());
    	return mapper;
    }
}
