package com.qht.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qht.boot.MessageApp;
import com.qht.boot.model.Person;

//@RestController = @Controller + @ResponseBody
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private MessageApp messageApp; 	


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
	
	@RequestMapping("/message")
	public String getMessage() {
		int id = messageApp.getMessageId();
		String msg = messageApp.getMessage().getText();
		
		return "MSg id:" + id+  " Message: "+ msg ;
	}
	
	/**
	 * @param messageObj the messageObj to set
	 */
	public void setMessageObj(MessageApp messageApp) {
		System.out.println("msgapp obj setter");
		this.messageApp = messageApp;
	}
}
