package com.example.demo.wallet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WalletRestControllerAdvice {

	@ExceptionHandler(exception = WalletException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String walletExceptionHandler(WalletException e) {
		
		return e.getMessage();
	}
}
