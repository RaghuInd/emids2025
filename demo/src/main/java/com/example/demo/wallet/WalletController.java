package com.example.demo.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FundTransferDto;

@RestController
@RequestMapping("api/wallet")
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping("/user/{id}/account/{accountId}")
	public String DemoPathVariable(@PathVariable("id") Integer id,@PathVariable("accountId") Integer accountId) {
		return "get User id:"+id+"Account:"+accountId;
	}

	@GetMapping("/{id}")
	public Wallet getWalletById(@PathVariable("id") Integer walletId) {
		return this.walletService.getWalletById(walletId);
	}
	@PostMapping("/")
	public Wallet registerWallet(@RequestBody Wallet wallet ) {
		// validation logic here @Valid
		return this.walletService.register(wallet);
	}
	
	@PatchMapping("/deposit")
	public Double addFunds(@RequestBody FundTransferDto fundTransferDto) throws WalletException {
		return this.walletService.depositFunds(fundTransferDto.getId(), fundTransferDto.getFund());
	}
	
	
}
