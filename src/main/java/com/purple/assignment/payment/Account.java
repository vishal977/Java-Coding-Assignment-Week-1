package com.purple.assignment.payment;

public class Account {
	
	private String holderName;
	private int accountNumber;
	private double accountBalance;
	private String cardNumber;
	private String upiID;
	private int upiPIN;
	
	//Getters and Setters
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	
	public String getUpiID() {
		return upiID;
	}

	public int getUpiPIN() {
		return upiPIN;
	}

	
	public Account(String holderName, int accountNumber, double accountBalance, String cardNumber, String upiID,
			int upiPIN) {
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.cardNumber = cardNumber;
		this.upiID = upiID;
		this.upiPIN = upiPIN;
	}
	
}