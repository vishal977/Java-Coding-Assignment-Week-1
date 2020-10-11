package com.purple.assignment.payment;


public class PaymentDemo {
	
	public static void main(String[] args) {
		Account sender = new Account("Jake", 1547898, 54426.32, "2045654", "ABCD00112", 7854);
		Account receiver = new Account("Harry", 4577888, 10054.32, "6457541", "WXYZ00113", 5645);
		
		System.out.println("Initiating credit card payment... ");
		CreditCardPayment ccp = new CreditCardPayment(sender, receiver, 2000, "2045654", "6457541");
		ccp.pay();
		
		System.out.println("Initiating net banking payment... ");
		NetBanking netBanking = new NetBanking(sender, receiver, 2000);
		netBanking.pay();
		
		System.out.println("Initiating UPI payment...");
		UPIPayment upiPayment = new UPIPayment(sender, receiver, 2000, "ABCD00112", "WXYZ00113", 7854);
		upiPayment.pay();
	}

}
