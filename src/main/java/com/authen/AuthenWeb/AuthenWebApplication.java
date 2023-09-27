package com.authen.AuthenWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.authen.AuthenWeb")
public class AuthenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenWebApplication.class, args);
	}

}
