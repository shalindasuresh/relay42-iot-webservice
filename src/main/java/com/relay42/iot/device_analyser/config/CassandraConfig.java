package com.relay42.iot.device_analyser.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfig {
    public @Bean
    CqlSession session() {
        return CqlSession.builder().withKeyspace("relay42").build();
    }
}
