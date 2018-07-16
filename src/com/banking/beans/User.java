package com.banking.beans;

import java.util.Scanner;

public class User {
	
	private String name;
	private long socialSecurityNumber;
	private int age;
	private String streetAddress;
	private String city;
	private String state;
	private static int numOfUsers;
	
	public User() {
		numOfUsers++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "The user " + this.getName() + " lives in " + this.getCity();
		
	}

	public static int getNumOfUsers() {
		return numOfUsers;
	}
	
}
