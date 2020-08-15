package com.gsapi.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean1 {
	
	public String message;
	
	public HelloWorldBean1(String message)
	{
		this.message=message;
	}
	
//	@Override
//	public String toString() {
//		return "HelloWorldBean1 [message=" + message + "]";
//	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
