package com.fang.lincensingservicemysql.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.fang.lincensingservicemysql.dao")
public class MyBatisConfig {
}
