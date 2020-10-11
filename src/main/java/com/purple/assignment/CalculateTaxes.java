package com.purple.assignment;

import java.text.DecimalFormat;

public class CalculateTaxes {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee('m', 7777777);
		System.out.println(employee1.calculateTax());
		
		//Tax should be lesser by 2000 as employee is female. 
		Employee employee2 = new Employee('f', 7777777);
		System.out.println(employee2.calculateTax());
	}
}

class Employee {
	
	private char gender;
	private double annualSalary;
	
	//Formatting output tax to two decimal places.
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public Employee(char gender, double annualSalary) {
		super();
		this.gender = gender;
		this.annualSalary = annualSalary;
	}

	public double calculateTax() {
		double tax = 0;
		
		//No tax if salary is below 1.5 lakhs
		if(annualSalary < 1_50_000) {
			tax = 0;
		}
		//10% tax if sakary is between 1.5 lakhs and 10 lakhs
		else if(annualSalary >= 1_50_000 && annualSalary < 10_00_000) {
			tax = annualSalary * 0.1;
		}
		//20% tax if salary is between 10 lakhs and 15 lakhs
		else if(annualSalary >= 10_00_000 && annualSalary < 15_00_000) {
			tax = annualSalary * 0.2;
		}
		//35% tax if salary is between 15 lakhs and 30 lakhs
		else if(annualSalary >= 15_00_000 && annualSalary < 30_00_000) {
			tax = annualSalary * 0.35;
		}
		//40% tax if salary is greater than 40 lakhs
		else if(annualSalary > 40_00_000) {
			tax = annualSalary * 0.40;
		}
		// 2000 deduction on the tax if employee is female.
		if(gender == 'f' && tax > 0) {
			tax = tax - 2_000;
		}
		//Return calculated tax after rounding off to two decimal places.
		return Float.parseFloat(decimalFormat.format(tax));
	}
}
