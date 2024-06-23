package br.com.jeffersontdm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/environments.yml")
public class EnvironmentProperties { }