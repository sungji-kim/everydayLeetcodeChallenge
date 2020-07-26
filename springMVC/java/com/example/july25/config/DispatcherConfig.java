package com.example.july25.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan({"com.example.july25.controller"})
public class DispatcherConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		//vr.setPrefix("WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
		
	}
}





