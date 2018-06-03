package com.artolia.web.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.artolia.web.filter.TimeFilter;
import com.artolia.web.interceptor.TimeInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private TimeInterceptor timeInterceptor;

	@Bean
	public FilterRegistrationBean<TimeFilter> timeFilter() {
		FilterRegistrationBean<TimeFilter> registrationBean = new FilterRegistrationBean<TimeFilter>();
		
		TimeFilter timeFilter = new TimeFilter();
		registrationBean.setFilter(timeFilter);
		
		List<String> urls = new ArrayList<>();
		urls.add("/*");
		registrationBean.setUrlPatterns(urls);
		
		return registrationBean;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(timeInterceptor);
	}
	
	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		
	}
}
