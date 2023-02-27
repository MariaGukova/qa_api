package com.qa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("ADMIN")
        ;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                .antMatchers("/bug/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/scenario/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/doc/{id}").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/doc/add").hasRole("USER")
                .antMatchers(HttpMethod.POST,"/scenario/add").hasRole("USER")
                .and()
                .csrf().disable()
                .formLogin().disable()
        ;
    }

}
