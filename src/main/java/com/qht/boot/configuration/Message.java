package com.qht.boot.configuration;

import org.springframework.beans.factory.annotation.Value;

public class Message {

	public Message() {
		
		System.out.println("message invoked");
	}

	
	private String text;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}
