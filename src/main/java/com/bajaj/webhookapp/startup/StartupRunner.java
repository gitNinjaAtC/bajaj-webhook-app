package com.bajaj.webhookapp.startup;

import com.bajaj.webhookapp.service.SQLService;
import com.bajaj.webhookapp.model.WebhookRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

	private final SQLService sqlService;

	public StartupRunner(SQLService sqlService) {
		this.sqlService = sqlService;
	}

	@Override
	public void run(String... args) {
		sqlService.initialize();

		// Update registration details before building
		WebhookRequest request = new WebhookRequest(
			"Your Name",
			"Your Registration Number",
			"your.email@example.com"
		);
		// Use request if needed: send to webhook/registration endpoint, etc.
		// For now, this demonstrates where to update details.
	}
}


