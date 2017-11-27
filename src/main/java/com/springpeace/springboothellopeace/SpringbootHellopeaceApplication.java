package com.springpeace.springboothellopeace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootHellopeaceApplication extends ServletInitializer{
	
	public SpringbootHellopeaceApplication() {
	    super();
	    setRegisterErrorPageFilter(false); 
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHellopeaceApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootHellopeaceApplication.class);
	}
}
