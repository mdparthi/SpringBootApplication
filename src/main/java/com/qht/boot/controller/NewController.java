package com.qht.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qht.boot.model.Person;

//@RestController = @Controller + @ResponseBody
@RestController
public class NewController {
	
	
	@RequestMapping("/person")
	public String getPersonDetails() {
		Person person = new Person();
		person.setFirstName("Rock");
		person.setId(1L);
		person.setLastName("Star");
		person.setMoney(4000D);
		
		return person.getFirstName() + " " + person.getLastName();
	}
	
	@RequestMapping("/xml/person")
	public Person getPersonDetailsinXml() {
		Person person = new Person();
		person.setFirstName("Rock");
		person.setId(1L);
		person.setLastName("Star");
		person.setMoney(4000D);
		
		return person;
	}
}
