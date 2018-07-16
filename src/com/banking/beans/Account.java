package com.banking.beans;

import java.util.*;

import com.bank.util.Populate;
import com.bank.util.RandomNumGenerator;
import com.banking.beans.User;

public class Account {
	private int accountNum;
	private double balance;
	private static int numOfAccounts;
	private User user;
	
	public Account() {
		numOfAccounts++;
	}
	
	public Account(User user) {
		this();
		this.user = user;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum() {
		int num = RandomNumGenerator.generateSixDigitNum();
		this.accountNum = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return this.user.getName() + " has $" + this.getBalance() + " in account#: " + this.getAccountNum() + "." ;
		
	}

	
	
}
