package com.example.jenkins_test;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

	@PostConstruct
	void helloFun() {
		System.out.println("Hello World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
