package br.com.jeffersontdm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/environments.properties")
public class EnvironmentConfig { }