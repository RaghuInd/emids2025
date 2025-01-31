package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FundTransferDto;
import com.example.demo.wallet.Wallet;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String greeting() {
		return "Welcome to my App";
	}
//	@GetMapping("/")
//	public String greeting2() {
//		return "Welcome to my App";
//	}
	@PostMapping("/")
	public String demoPost() {
		return "POST";
	}
	@PutMapping("/")
	public String demoPut() {
		return "PUT";
	}
	@DeleteMapping("/")
	public String demoDelete() {
		return "DELETE";
	}
	@PatchMapping("/")
	public String demoPatch() {
		return "Patch";
	}

	
	
}
