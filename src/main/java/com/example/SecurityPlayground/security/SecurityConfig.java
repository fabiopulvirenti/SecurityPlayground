package com.example.SecurityPlayground.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->{

            auth.requestMatchers("/api/v1/open/greeting").permitAll();
            auth.requestMatchers("/api/v1/protected/greeting").authenticated();
        })
                .oauth2Login(Customizer.withDefaults());
        return http.build();






    }
}
