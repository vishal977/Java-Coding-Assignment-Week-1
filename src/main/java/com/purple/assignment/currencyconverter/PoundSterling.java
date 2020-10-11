package com.purple.assignment.currencyconverter;

import java.text.DecimalFormat;

public class PoundSterling {
	
	//Value of the currency
	private double value;
	
	//Conversion values
	static final double TO_SWISS_FRANC = 1.19;
	static final double TO_RUPEE = 94.89;
	static final double TO_EURO = 1.10;
	static final double TO_MOROCCAN_DHIRAM = 11.98;
	static final double TO_DOLLAR = 1.29;
	
	//Format to two digits after the decimal (Most currencies are allowed two decimal places only).
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public PoundSterling(double value) {
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
	
	//Convert to Rupee
	public String convertToRupee() {
		return decimalFormat.format(TO_RUPEE * value);
	}
	
	//Convert to Euro
	public String convertToEuro() {
		return decimalFormat.format(TO_EURO * value);
	}
	
	//Convert to Moroccan Dhiram
	public String convertToMoroccanDhiram() {
		return decimalFormat.format(TO_MOROCCAN_DHIRAM * value);
	}
	
	//Convert to Swiss Franc
	public String convertToSwissFranc() {
		return decimalFormat.format(TO_SWISS_FRANC * value);
	}

}
