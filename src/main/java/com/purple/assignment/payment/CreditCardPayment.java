package com.purple.assignment.payment;

public class CreditCardPayment extends Payment {
	String payerCard;
	String payeeCard;
	
	public CreditCardPayment(Account payer, Account payee, double amount, String payerCard, String payeeCard) {
		super(payer, payee, amount);
		this.payerCard = payerCard;
		this.payeeCard = payeeCard;
	}
	
	@Override
	public void pay() {
		//Check if card details are right.
		if(payerCard.equals(payer.getCardNumber()) && payeeCard.equals(payee.getCardNumber())) {
				AccountService accountService = new AccountService();
				if(accountService.transferFunds(payer, payee, amount)) {
					System.out.println("Credit card payment successful!");
				}
				else {
					System.out.println("Insufficient balance!");
				}
		}
		else {
			System.out.println("Card number invalid. Please try again");
		}
	}

}
