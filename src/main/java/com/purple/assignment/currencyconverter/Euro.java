package com.purple.assignment.currencyconverter;

import java.text.DecimalFormat;

public class Euro { 
	//Value of the currency
	private double value;
	
	//Conversion values
	static final double TO_SWISS_FRANC = 1.08;
	static final double TO_RUPEE = 86.30;
	static final double TO_POUND_STERLING = 0.91;
	static final double TO_MOROCCAN_DHIRAM = 10.90;
	static final double TO_DOLLAR = 1.18;
	
	//Format to two digits after the decimal (Most currencies are allowed two decimal places only).
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public Euro(double value) {
		this.value = value;
	}
	
	//Getter method
	public double getValue() {
		return value;
	}
	
	//Convert to Dollar: 1 EUR = 1.18 USD
	public String convertToDollar() {
		return decimalFormat.format(TO_DOLLAR * value);
	}
	
	//Convert to Rupee: 1 EUR = 86.30 INR
	public String convertToRupee() {
		return decimalFormat.format(TO_RUPEE * value);
	}
	
	//Convert to Moroccan Dhiram: 1 EUR = 10.90 MAD 
	public String convertToMoroccanDhiram() {
		return decimalFormat.format(TO_MOROCCAN_DHIRAM * value);
	}
	
	//Convert to Pound Sterling: 1 EUR = 0.91 GBP
	public String convertToPoundSterling() {
		return decimalFormat.format(TO_POUND_STERLING * value);
	}
	
	//Convert to Euro: 1 EUR = 1.08 CHF
	public String convertToSwissFranc() {
		return decimalFormat.format(TO_SWISS_FRANC * value);
	}
}
