package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Scanner;

import com.entity.Entity;

public class AddressBook {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Entity> list = new ArrayList<Entity>();

public static void main(String[] args ){
	AddressBook addressBook  = new AddressBook();
	System.out.println("Enter the data in book ");	
	addressBook.showUserOption();
		
	
	}

	public void addData() {
		Entity e = new Entity();
		System.out.println("Enter first name");
		e.setFirstName(sc.next());
		System.out.println("Enter last name");
		e.setLastName(sc.next());
		System.out.println("Enter the address");
		e.setAddress(sc.next());
		System.out.println("Enter the city");
		e.setCity(sc.next());
		System.out.println("Enter the state");
		e.setState(sc.next());
		System.out.println("Enter the zip");
		e.setZip(sc.next());
		System.out.println("Enter the phonenumber");
		e.setPhoneNumber(sc.next());
		list.add(e);
		System.out.println(e);	
	}
	public void print() {
		for (Entity element : list) {
			System.out.println(element);
		}
	}
	public void showUserOption() {
		int choice = 0;
		while (choice != 10) {
			System.out.println("1.Add contact details\n2. Show data in Book\n 10.Exit ");
			choice = sc.nextInt();
			switch (choice) {
			case 1 : 
				addData();
				break;
			case 2 : 
				print();
				break;
			case 10 : 
				break;
			default : 
				System.out.println("Please enter correct input ");
				break;
			}
	
		}
	}
}
