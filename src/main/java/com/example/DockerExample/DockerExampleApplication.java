package com.example.DockerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.example")
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

}
