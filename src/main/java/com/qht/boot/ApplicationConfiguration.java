package com.qht.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//opinated approach to load the necessary beans
@EnableAutoConfiguration
@Controller
public class ApplicationConfiguration {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
