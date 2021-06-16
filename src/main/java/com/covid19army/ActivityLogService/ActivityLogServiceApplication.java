package com.covid19army.ActivityLogService;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.covid19army.core.extensions.HttpServletRequestExtension;

@SpringBootApplication
@EnableDiscoveryClient
public class ActivityLogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityLogServiceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public HttpServletRequestExtension httpServletRequestExtension() {
		return new HttpServletRequestExtension();
	}
}
