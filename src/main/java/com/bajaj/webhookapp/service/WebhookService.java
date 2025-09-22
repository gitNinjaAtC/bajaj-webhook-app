package com.bajaj.webhookapp.service;

import com.bajaj.webhookapp.model.WebhookRequest;
import com.bajaj.webhookapp.model.WebhookResponse;
import org.springframework.stereotype.Service;

@Service
public class WebhookService {

	public WebhookResponse handle(WebhookRequest request) {
		WebhookResponse response = new WebhookResponse();
		response.setSuccess(true);
		response.setMessage("Received event: " + request.getEvent());
		return response;
	}
}


