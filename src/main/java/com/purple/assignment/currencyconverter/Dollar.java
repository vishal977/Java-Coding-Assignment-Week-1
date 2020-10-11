package com.purple.assignment.currencyconverter;

import java.text.DecimalFormat;

class Dollar {
	//Value of the currency
	private double value;
	
	//Conversion values
	static final double TO_SWISS_FRANC = 0.92;
	static final double TO_RUPEE = 73.32;
	static final double TO_EURO = 0.85;
	static final double TO_MOROCCAN_DHIRAM = 9.26;
	static final double TO_POUND_STERLING = 0.77;
	
	//Format to two digits after the decimal (Most currencies are allowed two decimal places only).
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public Dollar(double value) {
		this.value = value;
	}
	
	//Getter method
	public double getValue() {
		return value;
	}
	
	//Conversion to Rupee
	public String convertToRupees() {
		return decimalFormat.format(TO_RUPEE * value);
	}
	
	//Conversion to Euro
	public String convertToEuros() {
		return decimalFormat.format(TO_EURO * value);
	}
	
	//Conversion to Moroccal Dhiram
	public String convertToMoroccanDhiram() {
		return decimalFormat.format(TO_MOROCCAN_DHIRAM * value);
	}
	
	//Conversion to Pound Sterling
	public String convertToPoundSterling() {
		return decimalFormat.format(TO_POUND_STERLING * value);
	}
	
	//Conversion to Swiss Franc
	public String convertToSwissFranc() {
		return decimalFormat.format(TO_SWISS_FRANC * value);
	}
}