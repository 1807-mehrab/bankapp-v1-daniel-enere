package client;

import operations.Account;

public class BankApp {
	private int totalAccountsOpen;
	private String user;
	private double checkBalance;
	private Account account;

	
	public BankApp(Account account) {
		this.totalAccountsOpen = Account.getNumOfAccounts();
		this.checkBalance = account.getBalance();
		setUser(account.getAccountHolder());
	}

	public int getTotalAccountsOpen() {
		
		return totalAccountsOpen;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public void addMoney(int money) {
		account.accountDeposit(money);
	}

	public double getCheckBalance() {
		return this.checkBalance;
	}
	
	@Override
	public String toString() {
		return this.user + " has $" + this.checkBalance + " in his account " ;
		
	}
	
	

}
