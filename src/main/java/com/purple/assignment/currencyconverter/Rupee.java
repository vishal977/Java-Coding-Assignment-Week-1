package com.purple.assignment.currencyconverter;

import java.text.DecimalFormat;

public class Rupee {
	//Value of the currency
	private double value;
	
	//Conversion values
	static final double TO_SWISS_FRANC = 0.013;
	static final double TO_DOLLAR = 0.014;
	static final double TO_EURO = 0.012;
	static final double TO_MOROCCAN_DHIRAM = 0.13;
	static final double TO_POUND_STERLING = 0.011;
	
	//Format to two digits after the decimal (Most currencies are allowed two decimal places only).
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public Rupee(double value) {
		this.value = value;
	}
	
	//Getter method
	public double getValue() {
		return value;
	}
	
	//Convert to Dollar
	public String convertToDollar() {
		return decimalFormat.format(TO_DOLLAR * value);
	}
	
	//Convert to Euro
	public String convertToEuro() {
		return decimalFormat.format(TO_EURO * value);
	}
	
	//Convert to Moroccan Dhiram
	public String convertToMoroccanDhiram() {
		return decimalFormat.format(TO_MOROCCAN_DHIRAM * value);
	}
	
	//Convert to Pound Sterling
	public String convertToPoundSterling() {
		return decimalFormat.format(TO_POUND_STERLING * value);
	}
	//Convert to Euro
	public String convertToSwissFranc() {
		return decimalFormat.format(TO_SWISS_FRANC * value);
	}
	
}
