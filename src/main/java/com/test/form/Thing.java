package com.test.form;

import org.apache.struts.action.ActionForm;

public class Thing extends ActionForm{
	private String name;
	
	public Thing() {
		name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
