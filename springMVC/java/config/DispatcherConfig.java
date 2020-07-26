package com.example.july25.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/*
Pretty much you can copy and paste
1. add @Configuration annotation
2. add @ComponentScan() annotation
3. add viewResolver() method
4. add @Bean annotation to viewResolver() method
*/
@Configuration
@ComponentScan({"",""}) // put a package name that contains Controllers
public class DispatcherConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		//vr.setPrefix("WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
		
	}
}





