package br.com.techjambo.springbootstudy.springboothelloworld.bean;

public class HelloWorldBean {

	private String message;
	
	
	public HelloWorldBean(String message) {
		this.message = message;
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
