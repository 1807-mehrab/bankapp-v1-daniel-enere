package operations;

import java.util.Scanner;

public class UserInfoParser {
	Scanner input = new Scanner(System.in);
	private String nameInput;
	private String cityInput;
	private String streetAddress;
	private String stateInput;
	private int socialSecurityNumber;
	private int ageInput;
	
	public String getNameInput() {
		return this.nameInput;
	}
	
	public void setNameInput() {
		System.out.println("Name: ");
		this.nameInput = input.nextLine();
	}

	public int getSocialSecurityNumberInput() {
		
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumberInput() throws NumberFormatException {
		System.out.println("SSN: ");
		this.socialSecurityNumber =  input.nextInt();
	}

	public String getCityInput() {
		return cityInput;
	}

	public void setCityInput() {
		System.out.println("City: ");
		this.cityInput = input.nextLine();
	}

	public String getStreetAddressInput() {
		return streetAddress;
	}

	public void setStreetAddressInput() {
		System.out.println("Street Address: ");
		this.streetAddress = input.nextLine();
	}

	public String getStateInput() {
		return stateInput;
	}

	public void setStateInput() {
		System.out.println("State: ");
		this.stateInput = input.nextLine();
	}

	public int getAgeInput() {
		return ageInput;
	}

	public void setAgeInput() {
		System.out.println("Age: ");
		int age = input.nextInt();
		while(age<18) {
			System.out.println("Must be 18 and up to use account");
			age = input.nextInt();
		}
		
		this.ageInput = age ;
	}
	
//		System.out.println("SSN: ");
//		System.out.println("Age: ");
//		System.out.println("Street Address: ");
//		System.out.println("City: ");
//		System.out.println("Texas: ");
}
