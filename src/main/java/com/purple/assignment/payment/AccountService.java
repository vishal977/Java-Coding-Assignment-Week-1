package com.purple.assignment.payment;

public class AccountService {
	
	//Withdraw said amount from account.
	public boolean withdraw(Account account, double amount) {
		
		double availableBalance = account.getAccountBalance();
		
		if(availableBalance > amount) {
			account.setAccountBalance(availableBalance - amount); 
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Transfer amount from account A to account B.
	public boolean transferFunds(Account a, Account b, double amount) {
		
		double balanceA = a.getAccountBalance();
		double balanceB = b.getAccountBalance();
		
		if(balanceA > amount) {
			b.setAccountBalance(balanceB + amount);
			a.setAccountBalance(balanceA - amount);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	//Deposit amount in account.
	public boolean deposit(Account account, double amount) {
		
		double currentBalance = account.getAccountBalance();
		account.setAccountBalance(currentBalance + amount);
		return true;
		
	}
	
	//Check balance in account.
	public double checkBalance(Account account) {
		return account.getAccountBalance();
	}

}
