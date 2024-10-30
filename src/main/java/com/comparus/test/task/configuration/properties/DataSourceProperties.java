package com.comparus.test.task.configuration.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "data-sources")
public class DataSourceProperties {

    private List<DataSourceConfig> sources;

    @Data
    public static class DataSourceConfig {
        @NotBlank
        private String name;
        @NotBlank
        private String strategy;
        @NotBlank
        private String url;
        @NotBlank
        private String table;
        @NotBlank
        private String user;
        @NotBlank
        private String password;
    }
}