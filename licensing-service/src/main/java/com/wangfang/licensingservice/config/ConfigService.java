package com.wangfang.licensingservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigService {
    @Value("${example.property}")
    private String exampleProperty="";

    public String getExampleProperty(){
        return exampleProperty;
    }
}
