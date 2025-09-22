package com.bajaj.webhookapp.model;

public class WebhookRequest {

	private String name;
	private String registrationNumber;
	private String email;

	public WebhookRequest() {
	}

	public WebhookRequest(String name, String registrationNumber, String email) {
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}


