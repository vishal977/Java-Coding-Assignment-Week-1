package com.purple.assignment.payment;

public class UPIPayment extends Payment {
	
	String payerUPI;
	String payeeUPI;
	int payerPIN;

	public UPIPayment(Account payer, Account payee, double amount, String payerUPI, String payeeUPI, int payerPIN) {
		super(payer, payee, amount);
		this.payerUPI = payerUPI;
		this.payeeUPI = payeeUPI;
		this.payerPIN = payerPIN;
	}

	@Override
	public void pay() {
		
		//Check if UPI IDs match.
		if(payer.getUpiID().equals(payerUPI) && payee.getUpiID().equals(payeeUPI)) {
			if(payer.getUpiPIN() == payerPIN) {
				AccountService accountService = new AccountService();
				if(accountService.transferFunds(payer, payee, amount)) {
					System.out.println("UPI Transfer successful");
				}
				else {
					System.out.println("Insufficient balance!");
				}
			}
			else {
				System.out.println("Invalid UPI PINs");
			}
		}
		else {
			System.out.println("Invalid UPI IDs!");
		}
	}

}
