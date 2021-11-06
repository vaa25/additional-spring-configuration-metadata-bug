package com.example.additionalspringconfigurationmetadatabug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${some.property}")
    private String someProperty;

}
