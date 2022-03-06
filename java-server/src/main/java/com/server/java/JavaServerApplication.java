package com.server.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JavaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaServerApplication.class, args);
    }
}