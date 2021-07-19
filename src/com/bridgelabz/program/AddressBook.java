package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.address.AddressBookUC2;

public class AddressBook {


	private  String FirstName;
	private String LastName;
	private String Address;
	private	String city;
	private String state;
	private String zip ;
	private String PhoneNumber;
	ArrayList<String> information = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	  void addressInput(){
		  information = new ArrayList<String>();
		  System.out.println("Enter the Data of Address") ;
		  System.out.println("enter the FirstName");
		  FirstName = sc.next();
		  information.add(FirstName);
          System.out.println("enter the lastname");
		  LastName =  sc.next();
		  information.add(LastName);
		  System.out.println("enter the address"); 
		  Address = sc.next();
		  information.add(Address); 
		  System.out.println("enter the city");       
		  city = sc.next();                                          
		  information.add(city);
		  System.out.println("enter the state");
		  state = sc.next();
		  information.add(state);
		  System.out.println("enter your zip ");
		  zip = sc.next();
		  information.add(zip);
		  System.out.println("enter the phonenumber ");
		  PhoneNumber = sc.next();
		  information.add(PhoneNumber);
		
	   
	  }
	  void display() {
		  
		  System.out.println("Data is added in AddresBook " +" "+information);
	  }
	
	  public static void main(String[] args ){
		  System.out.println("Welcome to the Address book ");
		  AddressBook addressbook = new AddressBook();
		  addressbook.addressInput();		 
		  addressbook.display();
		  System.out.println("Add Another Contact details ");
		  addressbook.addressInput();
		  addressbook.display();
		  
	  }
}

