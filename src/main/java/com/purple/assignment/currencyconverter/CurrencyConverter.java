package com.purple.assignment.currencyconverter;

import java.util.Scanner;


public class CurrencyConverter {
	
	static final String INVALID_CHOICE = "Invalid choice";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select currency to convert: \n 1. Dollar \n 2. Euro \n 3. Moroccan Dhiram \n 4. Pound Sterling \n 5. Rupee \n 6. Swiss Franc \n");
		int fromCurrency = scanner.nextInt();
		
		System.out.println("Convert to: \n 1. \n Dollar \n 2. Euro \n 3. Moroccan Dhiram \n 4. Pound Sterling \n 5. Rupee \n 6. Swiss Franc \n");
		int toCurrency = scanner.nextInt();
		
		System.out.println("Enter value to convert: \n");
		float inputValue = scanner.nextFloat();
			
		if(fromCurrency == 1 ) {
			Dollar dollar = new Dollar(inputValue);
			switch(toCurrency) {
				case 1:
					System.out.println(dollar.getValue());
					break;
				case 2: 
					System.out.println(dollar.convertToEuros());
					break;
				case 3:
					System.out.println(dollar.convertToMoroccanDhiram());
					break;
				case 4:
					System.out.println(dollar.convertToPoundSterling());
					break;
				case 5: 
					System.out.println(dollar.convertToRupees());
					break;
				case 6: 
					System.out.println(dollar.convertToSwissFranc());
					break;
				default:
					System.out.println(INVALID_CHOICE);
					break;
			}
		}
		else if(fromCurrency == 2) {
			Euro euro = new Euro(inputValue);
			switch(toCurrency) {
			case 1:
				System.out.println(euro.convertToDollar());
				break;
			case 2: 
				System.out.println(euro.getValue());
				break;
			case 3:
				System.out.println(euro.convertToMoroccanDhiram());
				break;
			case 4:
				System.out.println(euro.convertToPoundSterling());
				break;
			case 5: 
				System.out.println(euro.convertToRupee());
				break;
			case 6: 
				System.out.println(euro.convertToSwissFranc());
				break;
			default:
				System.out.println(INVALID_CHOICE);
				break;
		}
			
		}
		else if(fromCurrency == 3) {
			MoroccanDhiram moroccanDhiram = new MoroccanDhiram(inputValue);
			switch(toCurrency) {
			case 1:
				System.out.println(moroccanDhiram.convertToDollar());
				break;
			case 2: 
				System.out.println(moroccanDhiram.convertToEuro());
				break;
			case 3:
				System.out.println(moroccanDhiram.getValue());
				break;
			case 4:
				System.out.println(moroccanDhiram.convertToPoundSterling());
				break;
			case 5: 
				System.out.println(moroccanDhiram.convertToRupee());
				break;
			case 6: 
				System.out.println(moroccanDhiram.convertToSwissFranc());
				break;
			default:
				System.out.println(INVALID_CHOICE);
				break;
		}
			
		}
		else if(fromCurrency == 4) {
			PoundSterling poundSterling = new PoundSterling(inputValue);
			switch(toCurrency) {
			case 1:
				System.out.println(poundSterling.convertToDollar());
				break;
			case 2: 
				System.out.println(poundSterling.convertToEuro());
				break;
			case 3:
				System.out.println(poundSterling.convertToMoroccanDhiram());
				break;
			case 4:
				System.out.println(poundSterling.getValue());
				break;
			case 5: 
				System.out.println(poundSterling.convertToRupee());
				break;
			case 6: 
				System.out.println(poundSterling.convertToSwissFranc());
				break;
			default:
				System.out.println(INVALID_CHOICE);
				break;
		}
			
		}
		else if(fromCurrency == 5) {
			Rupee rupee = new Rupee(inputValue);
			switch(toCurrency) {
			case 1:
				System.out.println(rupee.convertToDollar());
				break;
			case 2: 
				System.out.println(rupee.convertToEuro());
				break;
			case 3:
				System.out.println(rupee.convertToEuro());
				break;
			case 4:
				System.out.println(rupee.convertToMoroccanDhiram());
				break;
			case 5: 
				System.out.println(rupee.getValue());
				break;
			case 6: 
				System.out.println(rupee.convertToSwissFranc());
				break;
			default:
				System.out.println(INVALID_CHOICE);
				break;
		}
			
		}
		else if(fromCurrency == 6) {
			SwissFranc swissFranc = new SwissFranc(inputValue);
			switch(toCurrency) {
			case 1:
				System.out.println(swissFranc.convertToDollar());
				break;
			case 2: 
				System.out.println(swissFranc.convertToEuro());
				break;
			case 3:
				System.out.println(swissFranc.convertToEuro());
				break;
			case 4:
				System.out.println(swissFranc.convertToMoroccanDhiram());
				break;
			case 5: 
				System.out.println(swissFranc.convertToRupee());
				break;
			case 6: 
				System.out.println(swissFranc.getValue());
				break;
			default:
				System.out.println(INVALID_CHOICE);
				break;
		}
			
		}
		else {
			System.out.println(INVALID_CHOICE);
		}
		scanner.close();
	}
}


