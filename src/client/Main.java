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
		
		if (response.equals("y")) {
			isYes = true;
			
			while(isYes) {
				welcomeDisplay();
				BankApp bankApp = new BankApp();
				bankApp.addMoney(4546);
				System.out.println(bankApp);
			}
			
		} else {
			goodbyeDisplay();
		}
		
//		Scanner input = new Scanner(System.in);
//		Account account = new Account(input.nextLine());
//		BankApp app = new BankApp(account);
		mainInput.close();
		
		
	}
	
	static void welcomeDisplay() {
		System.out.println("Welcome to Revature Bank");	
	}
	
	static void goodbyeDisplay() {
		System.out.print("Have a nice day!");	
	}
}
