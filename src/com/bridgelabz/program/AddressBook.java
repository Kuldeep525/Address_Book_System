package com.bridgelabz.program;

import java.util.Scanner;

public class AddressBook {

	private  String FirstName;
	private String LastName;
	private String Address;
	private	String city;
	private String state;
	private int zip ;
	private String PhoneNumber;
		
	void addressData(){
		System.out.println("Enter the Data of Address Book ") ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name ");
		FirstName = sc.next();
		System.out.println("Enter last name ");
		LastName =  sc.next();
		System.out.println("Enter Address  ");
		Address = sc.next();
		System.out.println("Enter your city ");
		city = sc.next();
		System.out.println("Enter your state ");
		state = sc.next();
		System.out.println("Enter zip ");
		zip = sc.nextInt();
		System.out.println("Enter phone number ");
		PhoneNumber = sc.next();
	}
	void display() {
		System.out.println(FirstName + " " + LastName + " " + Address + " , " + city + " , " + state + " , " + zip + "  " + PhoneNumber);
	}
		
	public static void main(String[] args ){
		System.out.println("Welcome to the Address book ");
		AddressBook addressbook = new AddressBook();
		addressbook.addressData();		 
		addressbook.display();		
	}
		
}	
		
