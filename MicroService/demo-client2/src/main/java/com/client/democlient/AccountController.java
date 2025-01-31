package com.client.democlient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/")
	public String greet() {
		return "Welcome to Bajaj Accounting service";
	}
}
