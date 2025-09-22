package com.bajaj.webhookapp.model;

public class WebhookResponse {

	private boolean success;
	private String message;

	public WebhookResponse() {
	}

	public WebhookResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}


