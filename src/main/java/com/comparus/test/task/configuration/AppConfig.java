package com.comparus.test.task.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.comparus.test.task.configuration.properties.DataSourceProperties;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class AppConfig {
}
