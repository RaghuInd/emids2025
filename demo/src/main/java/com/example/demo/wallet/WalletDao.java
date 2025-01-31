package com.example.demo.wallet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository // Data JPA 
public interface WalletDao extends JpaRepository<Wallet, Integer> {

	// custom queries  1: by method name 2: @Query () using JPQL [OO query Language]
	
	List<Wallet> findByName(String name); // SELECT * FROM Wallet
	
	
}
