package com.wizlive.wizserve;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfiguration
{
    public static PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder(15);
    }

    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.authorizeHttpRequests((auth) -> 
            auth.requestMatchers("/signin/", "/signup/", "/css/**", "/images/**", "/js/**").permitAll().anyRequest()
            .requestMatchers("/admin/").hasRole("admin")
            .requestMatchers("/question/").hasRole("member"));
        
    }
}
