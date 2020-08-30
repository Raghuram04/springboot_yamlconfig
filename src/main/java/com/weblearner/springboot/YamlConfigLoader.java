package com.weblearner.springboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YamlConfigLoader {

	private String email;
	private List<String> user = new ArrayList<>();
	private Map<String, String> role = new HashMap();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getUser() {
		return user;
	}

	public void setUser(List<String> user) {
		this.user = user;
	}

	public Map<String, String> getRole() {
		return role;
	}

	public void setRole(Map<String, String> role) {
		this.role = role;
	}
	
	

}
