package com.skslate.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.skslate"})
//@PropertySource("classpaath:validationMessages.properties")
public class LCAppConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	MessageSource messageSource() {
	
		ReloadableResourceBundleMessageSource rms = new ReloadableResourceBundleMessageSource();
		rms.setBasename("classpath:validationMessages");
		
		return rms;
	
	}
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean lv = new LocalValidatorFactoryBean();
		lv.setValidationMessageSource(messageSource());
		return lv;
	}
	
	@Override
	public Validator getValidator() {
		return validator();
	}
	
}
