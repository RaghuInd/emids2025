package com.example.demo.wallet;

public interface WalletService {

	Wallet register(Wallet wallet);
	Double depositFunds(Integer walletId, Double funds) throws WalletException;
	Double withdrawFunds(Integer walletId, Double funds);
	Boolean fundTransfer(Integer fromId, Integer toId, Double amount);
	Wallet deregister(Integer walletId);
	Wallet getWalletById(Integer walletId);
}
