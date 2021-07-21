package com.bridgelabz.program;

import java.util.Comparator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.entity.Entity;

public class AddressBook {
	
	static Scanner sc = new Scanner(System.in);
	static Set<Entity> list = new HashSet<Entity>();

public static void main(String[] args ){
	AddressBook addressBook  = new AddressBook();
	System.out.println("First Add data in book ");	
	addressBook.showUserOption();
		
	
	}
	public void showUserOption() {
		int choice = 0;
		while (choice != 10) {
			System.out.println("1.Add contact details\n2. Show data in Book\n3.Edit existing contact\n4.Delete person\n5.Search\n6.sort by name \n7.sort by city\n 10.Exit ");
			choice = sc.nextInt();
			switch (choice) {
			case 1 : 
				addData();
				break;
			case 2 : 
				print();
				break;
			case 3 : 
				editPerson();
				break;	
			case 4 : 
				deletePerson();
				break;	
			case 5 : 
				search();
				break;		
			case 6 : 
				sortByName();
				break;	
			case 7 : 
				sortByCity();
				break;		
			case 10 : 
				search2();
				break;
			default : 
				System.out.println("Please enter correct input ");
			break;
			}

		}
}


	private void sortByCity() {
		List<Entity> sortedList = list.stream() .sorted(Comparator.comparing(Entity::
			getCity)) .collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		    }
	private void sortByName() {
		List<Entity> sortedList = list.stream() .sorted(Comparator.comparing(Entity::
			getFirstName)) .collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		 

		    }
	public void search2() {
		Entity searchName = list.stream().filter(list -> "kuldeep".equals
				(list.getFirstName())).findAny().orElse(null);	
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
	
	}
	public void print() {
		for (Entity element : list) {
			System.out.println(element);
		}
	}
	
	public void editPerson() {
		System.out.println("Enter the name to edit person detail");
		String person = sc.next();
		Entity entity = getEntity(person);
		System.out.println("Enter what to you want to edit\n1.first name\n2.last name\n3.address\n4.city\n5.state\n6.zip\n7.phone number");
		int option = sc.nextInt();
		switch (option) {
		case 1 : 
			editFirstName(entity);
			break;
		case 2 :
			editLastName(entity);
			break;
		case 3 : 
			editAddress(entity);
			break;
		case 4 : 
			editCity(entity);
			break;
		case 5 : 
			editState(entity);
			break;
		case 6 : 
			editZip(entity);
			break;
		case 7 :
			editPhoneNumber(entity);
			break;
		default : 
			System.out.println("Wrong selection");
		}
	}

	private void editPhoneNumber(Entity entity) {
		System.out.println("Enter new phone number");
		entity.setPhoneNumber(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editZip(Entity entity) {
		System.out.println("Enter new Zip");
		entity.setZip(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editState(Entity entity) {
		System.out.println("Enter new State");
		entity.setState(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editCity(Entity entity) {
		System.out.println("Enter new City");
		entity.setCity(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editAddress(Entity entity) {
		System.out.println("Enter new Address");
		entity.setAddress(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editLastName(Entity entity) {
		System.out.println("Enter the last name");
		entity.setLastName(sc.next());
		System.out.println("Succeessfully updated");
	}

	private void editFirstName(Entity entity) {
		System.out.println("Enter new first name");
		entity.setFirstName(sc.next());
		System.out.println("Succeessfully updated");
	}

	private Entity getEntity(String person) {
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				for (int i = 0 ; i < list.size();i++) {
					Entity entity = (Entity) itr.next();
					if(entity.getFirstName().equalsIgnoreCase(person));
						return entity;
					
				}
			}
		return null;
	}
	private void deletePerson() {
		System.out.println("Enter the person name to be delete");
		String personName = sc.next();
		Entity entity = getEntity(personName);
		if(personName == null) {
			System.out.println("No such person in book ");
		}
		else {	
			list.remove(personName);

		}
		
	}
	private void search() {
		int count = 0 ; 
		System.out.println("Enter the city");
		String city = sc.next() ;
		for (Entity entity : list) {
			if(entity.getCity().contains(city));{
				System.out.println(entity);
				count ++;
		}
	}
		System.out.println("Total number of person from this city ::" + count);
		
	}
}
