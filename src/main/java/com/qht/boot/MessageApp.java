package com.qht.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qht.boot.configuration.Message;

@Component
public class MessageApp {
	
	private int messageId;
	
	@Autowired // DI technique - setter injections
	private Message message;

//	@Autowired // example Contructor injection
//	public MessageApp(Message msg) {
//		this.message = msg;
//	}
	
	/**
	 * @return the messageId
	 */
	public int getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	
}
