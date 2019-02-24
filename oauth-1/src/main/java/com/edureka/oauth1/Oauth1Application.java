package com.edureka.oauth1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class Oauth1Application {

	@GetMapping("/user")
	public Principal user(Principal user) {
		System.out.println("****** oAuth Server called ******");
		return user;
	}

	public static void main(String[] args) {
		SpringApplication.run(Oauth1Application.class, args);
	}

}
