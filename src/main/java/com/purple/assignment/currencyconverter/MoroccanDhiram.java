package com.purple.assignment.currencyconverter;

import java.text.DecimalFormat;

public class MoroccanDhiram {
	
	//Value of the currency
	private double value;
	
	//Conversion values
	static final double TO_SWISS_FRANC = 0.099;
	static final double TO_RUPEE = 7.92;
	static final double TO_EURO = 0.092;
	static final double TO_POUND_STERLING = 0.083;
	static final double TO_DOLLAR = 0.11;
	
	//Format to two digits after the decimal (Most currencies are allowed two decimal places only).
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	//Constructor
	public MoroccanDhiram(double value) {
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
	
	//Convert to Pound Sterling
	public String convertToPoundSterling() {
		return decimalFormat.format(TO_POUND_STERLING * value);
	}
	
	//Convert to Swiss Franc
	public String convertToSwissFranc() {
		return decimalFormat.format(TO_SWISS_FRANC * value);
	}

}
