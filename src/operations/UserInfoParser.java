package operations;

import java.util.Scanner;

public class UserInfoParser {
	Scanner input = new Scanner(System.in);
	private String nameInput;
	private int socialSecurityNumber;
	private String cityInput;
	
	public String getName() {
		return this.nameInput;
	}
	
	public void setName() {
		System.out.println("Name: ");
		this.nameInput = input.nextLine();
	}

	public int getSocialSecurityNumber() {
		
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber() {
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
	
		
		
		
//		System.out.println("SSN: ");
//		System.out.println("Age: ");
//		System.out.println("Street Address: ");
//		System.out.println("City: ");
//		System.out.println("Texas: ");
}
