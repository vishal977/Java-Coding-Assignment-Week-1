package com.purple.assignment;

import java.util.Scanner;

public class ScientificCalculations {

	public static void main(String[] args) {
		System.out.println("Scientific Calculator \n Input format: operation(inputValue) \n Supported operations include: \n"
				+ " 1. sin \n 2. cos \n 3. tan \n 4. cosec \n 5. sec \n 6. cot \n 7. abs \n 8. asin \n 9. acos \n 10. atan\n"
				+ " 11. abs \n 12. exp \n 13. sinh \n 14. cosh \n 15. tanh \n 16. sqrt \n 17. cbrt \n Type in STOP to end." );
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String inputString = scanner.next();
			if(inputString.equalsIgnoreCase("stop")) {
				System.out.println("Stopped");
				break;
			}
			processInput(inputString);
		}
		scanner.close();
	}
	
	public static void processInput(String input) {
		//Extract operation user mentions
		String operation = input.substring(0, input.indexOf("(")).toLowerCase();
		
		String inputVal = input.substring( input.indexOf("(")+1, input.indexOf(")") );
		if(inputVal.isEmpty()) {
			System.out.println("No input given");
			return;
		}
		
		double inputValue = Double.parseDouble(inputVal);
		switch(operation) {
			case "sin":
				System.out.println(Math.sin(inputValue));
				break;
			case "cos":
				System.out.println(Math.cos(inputValue));
				break;
			case "tan":
				System.out.println(Math.tan(inputValue));
				break;
			case "cosec":
				System.out.println(1/Math.sin(inputValue));
				break;
			case "sec":
				System.out.println(1/Math.cos(inputValue));
				break;
			case "cot":
				System.out.println(1/Math.tan(inputValue));
				break;
			case "abs":
				System.out.println(Math.abs(inputValue));
				break;
			case "asin":
				System.out.println(Math.asin(inputValue));
				break;
			case "acos":
				System.out.println(Math.acos(inputValue)); 
				break;
			case "atan":
				System.out.println(Math.atan(inputValue));
				break;
			case "exp":
				System.out.println(Math.exp(inputValue));
				break;
			case "sinh": 
				System.out.println(Math.sinh(inputValue));
				break;
			case "coh":
				System.out.println(Math.cosh(inputValue));
				break;
			case "tanh": 
				System.out.println(Math.tanh(inputValue));
				break;
			case "sqrt": 
				System.out.println(Math.sqrt(inputValue));
				break;
			case "cbrt": 
				System.out.println(Math.cbrt(inputValue));
				break;
			default: 
				System.out.println("Invalid operation");
		}
		
	}

}
