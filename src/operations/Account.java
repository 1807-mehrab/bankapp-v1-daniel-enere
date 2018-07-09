package operations;

import java.util.*;
import operations.User;

public class Account implements WithdrawalInterface, DepositInterface {
	private String accountHolder;
	private double balance;
	private static int numOfAccounts;
	
	public Account(String name) {
		this.accountHolder = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	@Override
	public void accountWithdrawal(double amountToWithdraw) {
		this.balance =- amountToWithdraw;
		
	}

	@Override
	public void accountDeposit(double amountToDeposit) {
		this.balance =+ amountToDeposit;
		
	}
	
	
	
	
}
