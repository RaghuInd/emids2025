package com.client.democlient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/greet")
	public String greet() {
		return "Bajaj Pune";
	}
}
