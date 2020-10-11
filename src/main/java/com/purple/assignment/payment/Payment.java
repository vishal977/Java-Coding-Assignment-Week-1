package com.purple.assignment.payment;

abstract class Payment implements Payable {
	
	Account payer;
	Account payee;
	double amount;
	
	public Payment(Account payer, Account payee, double amount) {
		super();
		this.payer = payer;
		this.payee = payee;
		this.amount = amount;
	}
	
	
	
}
