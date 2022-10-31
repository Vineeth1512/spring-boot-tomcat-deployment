package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTomcatDeploymentApplication {

	/*
	 * protected SpringApplicationBuilder configure(SpringApplicationBuilder
	 * application) { return
	 * application.sources(SpringBootTomcatDeploymentApplication.class); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatDeploymentApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello from tomcat server...";
	}

}
