package com.purple.assignment;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class SortingCustomers {

	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Bob","H", 31));
		customerList.add(new Customer("Alan", "M", 40));
		customerList.add(new Customer("Zach", "S", 34));
		customerList.add(new Customer("Alan", "T", 34));
		
		System.out.println("List before sorting...");
		printList(customerList);
		
		
		Collections.sort(customerList, new SortCustomers());
		System.out.println("List after sorting...");
		printList(customerList);
	}
	
	static void printList(List<Customer> custList) {
		for(Customer c: custList) {
			System.out.print("[" + c.getFirstname() + " " +  c.getLastname() + " - " + "Age: " + c.getAge() + " ]");
		}
		System.out.println("");
	}

}

class SortCustomers implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		int comparison1 = c1.getFirstname().compareTo(c2.getFirstname());
		if(comparison1 == 0) {
			return c1.getAge() - c2.getAge();
		}
		else {
			return comparison1;
		}
	}
	
}


class Customer {
	String firstname;
	String lastname;
	int age;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Customer(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	
	
}
