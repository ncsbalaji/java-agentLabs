package com.client;

import java.io.Serializable;

public class Data implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message = "";
	//header field to set agent header here and pass it over network
	public String header = "";
	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

