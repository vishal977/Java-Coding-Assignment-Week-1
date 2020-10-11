package com.purple.assignment;

public class DynamicPolymorphismExample {
	
	public static void main(String[] args) {
		
		//Up-casting from Payment to CreditCardPayment
		Payment ccPayment = new CreditCardPayment();
		
		//The method call is resolved at runtime to the CreditCardPayment class' processPayment() method.
		ccPayment.processPayment();
		
		Payment neftPayment = new NEFTPayment();
		neftPayment.processPayment(); //Resolves to NEFTPayment's processPayment() method.
	}

}

class Payment {
	void processPayment() {
		System.out.println("Processing payment... Please wait");
	}
}

class CreditCardPayment extends Payment {
	@Override
	void processPayment() {
		System.out.println("Processing credit card payment... Please wait");
	}
}

class NEFTPayment extends Payment {
	@Override
	void processPayment() {
		System.out.println("Processint NEFT payment... Please wait");
	}
}
