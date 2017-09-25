package com.qht.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.qht.boot.restcontroller.MyController;

//opinated approach to load the necessary beans
//@ComponentScan("com.qht.boot")
@Import(MyController.class)
@EnableAutoConfiguration
public class ApplicationConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
