package client;

import com.bank.util.Populate;

import operations.Account;
import operations.User;

public class BankApp {
	private int totalAccountsOpen;
	private String userName;
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
	
	

	
	
	@Override
	public String toString() {
		return this.account.getUser().getName() + " has $" + this.checkBalance + " in his account " ;
		
	}
	
	

}
