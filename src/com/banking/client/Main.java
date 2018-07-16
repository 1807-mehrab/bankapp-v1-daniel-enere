package com.banking.client;

public class Main {
	public static void main(String[] args) {
		BankApp bankApp = new BankApp();
		
		bankApp.deposit((int)(Math.random() * 1000));
		System.out.println(bankApp.checkBalance());
		bankApp.withdraw((int)(Math.random() * 1000));
		System.out.println(bankApp.checkBalance());
		
		System.out.println(bankApp.createAnAccount().getUser().getNumOfUsers());
		System.out.println(bankApp.getAllAccounts());
		
		
	}
	
}
