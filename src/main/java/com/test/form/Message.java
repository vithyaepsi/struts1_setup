package com.test.form;

import org.apache.struts.action.ActionForm;

public class Message extends ActionForm {
	String message;
	
	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
