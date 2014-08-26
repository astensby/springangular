package io.monokkel.springangular.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("io.monokkel.springangular")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	
}
