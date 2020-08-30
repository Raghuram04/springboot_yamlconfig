package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootYamlconfigApplication implements CommandLineRunner {

	@Autowired
	private YamlConfigLoader yamlConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootYamlconfigApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// single variable and value
		System.out.println("Email From Yaml Config file" + yamlConfig.getEmail());

		// List of element from arrayList
		yamlConfig.getUser().forEach(s -> {
			System.out.println("User ->" + s);
		});

		// Map

		yamlConfig.getRole().keySet().forEach(s -> {
			System.out.println("Key from Map  " + s);
			System.out.println("value from Map  " + yamlConfig.getRole().get(s));
		});

	}

}
