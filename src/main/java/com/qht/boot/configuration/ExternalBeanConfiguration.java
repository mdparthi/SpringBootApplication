package com.qht.boot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//pure java configs

@Configuration
public class ExternalBeanConfiguration {
	
	@Value("${msg.text}")
	private String msgTxt;
	
	@Bean
	public Message createMsg() {
		Message msg = new Message();
		msg.setText(msgTxt);
		
		return msg;
	}
}
