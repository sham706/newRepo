package com.shamanth.LearnExceptionHandling.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shamanth.LearnExceptionHandling.model.Account;

@RestController
public class ControllerClass {
	@RequestMapping("/api/accounts/{accountId}")
	public ResponseEntity<Account> getAccounts(@PathVariable("accountId") String accountId){
		
		Account account = new Account();
		account.setAccountId(accountId);
		account.setName("ram");
		if(accountId.equals("1")) {
		throw new IllegalArgumentException();
		}
		return new ResponseEntity<Account>(account, HttpStatus.OK);
		
	}
}
