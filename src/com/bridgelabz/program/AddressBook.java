package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		  System.out.println(" Enter the Data of Address ") ;
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
	  void showUserOption() {
		  System.out.println(" Enter 1 for any update in existing contact");
		  int input = sc.nextInt();
		  switch (input ) {
		  case 1 : 
 
			  changeDetails();
			  break;
		  default : 
			  System.out.println(" enter correct input");
			  break;	  
		  }		 
	  }
  	  
	  void changeDetails() {
		  System.out.println(" Enter the location and updated detail.\n 0.FirstName \n 1.LastName \n 2.Address \n 3.city \n 4.state 5. zip \n 6.Phonenumber   ");
		  int position = sc.nextInt();
		  String data = sc.next();	  
		  information.set(position, data);
		  System.out.println("--Updated Address ----");
		  Iterator<String>  itr = information.iterator();
		  while (itr.hasNext()) {
			  Object obj = itr.next();
			  System.out.println(obj);
		  }		  
	  }		  

	  void display() {
		  
		  System.out.println(information);
		  
	  }
	  
	
	  public static void main(String[] args ){
		  System.out.println("---------------Welcome to the Address book----------------------- ");
		  AddressBook addressbook = new AddressBook();
		  addressbook.addressInput();		 
		  addressbook.display();
		  addressbook.showUserOption();
	    	  
	  }
}


	
