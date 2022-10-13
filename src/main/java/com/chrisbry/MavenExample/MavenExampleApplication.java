package com.chrisbry.MavenExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(MavenExampleApplication.class, args);
		System.out.println("Maven Project Running");
	}

}
