package com.shamanth.LearnExceptionHandling.model;

public class Account {

	private String accountId;
	private String name;
	
	public Account() {
		
	}
	public Account(String accountId, String name) {
		super();
		this.accountId = accountId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + "]";
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
