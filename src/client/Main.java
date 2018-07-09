package client;

import java.util.*;

import operations.Account;
import operations.User;

public class Main {
	public static void main(String[] args) {
		
		Scanner mainInput = new Scanner(System.in);
		
		System.out.println("Welcome would you like to continue(y/n)");
		boolean isYes = false;
		String response = mainInput.nextLine();
		
		if (response == "y") {
			isYes = true;
			
		}
		
		while(!isYes) {
			BankApp bankApp = new BankApp();
			bankApp.addMoney(4546);
			System.out.println(bankApp);
		}
//		Scanner input = new Scanner(System.in);
//		Account account = new Account(input.nextLine());
//		BankApp app = new BankApp(account);
		mainInput.close();
		
		
	}
	
	static void welcomeDisplay(boolean bool) {
		if(!bool) System.out.print("Have a nice day!");
		System.out.println("Welcome to Revature Bank");
		
	}
}
