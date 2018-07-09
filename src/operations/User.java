package operations;

import java.util.Scanner;
import operations.UserInfoParser;

public class User {
	Scanner input = new Scanner(System.in);
	
	private String name;
	private int socialSecurityNumber;
	private int age;
	private String streetAddress;
	private String city;
	private String state;
	
	public User() {
		UserInfoParser userInfo = new UserInfoParser();
		userInfo.setNameInput();
		
		userInfo.setStreetAddressInput();
		userInfo.setCityInput();
		userInfo.setStateInput();
		
		userInfo.setSocialSecurityNumberInput();
		userInfo.setAgeInput();
		this.name = userInfo.getNameInput();
		this.socialSecurityNumber = userInfo.getSocialSecurityNumberInput();
		this.city = userInfo.getCityInput();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(int socialSecurityNumber) {
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
	
}
