package com.fang.lincensingservicemysql.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigService {
    @Value("${spring.datasource.url}")
    private String url;

    public void output(){
        System.out.println("-------------------url----"+url);
    }
}
