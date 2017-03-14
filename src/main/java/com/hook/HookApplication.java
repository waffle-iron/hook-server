package com.hook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Order(Ordered.LOWEST_PRECEDENCE)
@EnableGlobalMethodSecurity(securedEnabled = true)
@EnableSwagger2
public class HookApplication {

    public static void main(String[] args) {
        SpringApplication.run(HookApplication.class, args);
    }

    @Bean
    public SwaggerConfig swagger() {
        return new SwaggerConfig();
    }
}
