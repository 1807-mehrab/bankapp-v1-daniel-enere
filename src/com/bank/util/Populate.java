package com.bank.util;

import java.util.Scanner;

import client.Main;
import operations.Account;
import operations.User;

public class Populate {
	
	public Populate() {
		
	}
	
	private static User populateUser() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		
		System.out.println("How old are you: ");
		int age = scan.nextInt();
		
		System.out.println("Social Security Number: ");
		int ssn = scan.nextInt();
		
		System.out.println();
		
		System.out.println("Address(Street number and name): ");
		scan.next();
		String addy = scan.nextLine();
		System.out.println();
		
		System.out.println("City: ");
		String city = scan.nextLine();
		
		System.out.println("State: ");
		String state = scan.nextLine();
		
		
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setSocialSecurityNumber(ssn);
		user.setStreetAddress(addy);
		user.setCity(city);
		user.setState(state);
		
		return user;
	}
	
	public static User populateUser(User user) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		
		System.out.println("How old are you: ");
		int age = scan.nextInt();
		
		System.out.println("Social Security Number: ");
		int ssn = scan.nextInt();
		
		System.out.println("Address(Street number and name): ");
		String addy = scan.nextLine();
		
		System.out.println("City: ");
		String city = scan.nextLine();
		
		System.out.println("State: ");
		String state = scan.nextLine();
		
		user.setName(name);
		user.setAge(age);
		user.setSocialSecurityNumber(ssn);
		user.setStreetAddress(addy);
		user.setCity(city);
		user.setState(state);
		
		return user;
	}
	
	public static Account populateAccount(Account account) {
		account.setAccountNum();
		account.setBalance(1000.45);
		account.setUser(populateUser());
		
		return account;
	}

}
