package com.banking.client;

import com.bank.util.Populate;
import com.banking.beans.Account;

public class BankApp {
	private double checkBalance;
	private Account account;

	
	public BankApp() {
		Account account = new Account();
		this.account = Populate.populateAccount(account);
	}
	
	public double checkBalance() {
		return this.account.getBalance();
	}
	
	public void deposit (double depositAmount) {
		account.setBalance(account.getBalance() + depositAmount); 
	}
	
	public void withdraw (double withdrawalAmount) {
		account.setBalance(account.getBalance() - withdrawalAmount);
	}
	
	public String getUserName() {
		return account.getUser().getName();
	}
	
	public int getAllAccounts() {
		return Account.getNumOfAccounts();
	}
	
	public Account createAnAccount() {
		return new Account(account.getUser());
	}
	

	
	
	@Override
	public String toString() {
		return this.account.getUser().getName() + " has $" + this.checkBalance + " in his account " ;
		
	}
	
	

}
