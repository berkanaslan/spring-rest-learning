package com.berkanaslan.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Berkan Aslan
 * 3.04.2021
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.berkanaslan.springdemo")
public class SpringDemoConfig {

}
