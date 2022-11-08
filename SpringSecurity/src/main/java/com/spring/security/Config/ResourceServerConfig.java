package com.spring.security.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@SuppressWarnings("deprecation")
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
  private static final String RESOURCE_ID = "springsecurity1";

  @Override
  public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    resources.resourceId(RESOURCE_ID);
  }

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().mvcMatchers(HttpMethod.GET, "/productapi/products")
        .hasAnyRole("USER", "ADMIN")
        .mvcMatchers(HttpMethod.POST, "/productapi/products").hasRole("ADMIN").and().csrf().disable();

  }
}