package com.purple.assignment.payment;

import java.util.Random;
import java.util.Scanner;

public class NetBanking extends Payment {
	

	public NetBanking(Account payer, Account payee, double amount) {
		super(payer, payee, amount);		
	}

	@Override
	public void pay() {
		//Generate OTP
		//Send OTP to user
		
		System.out.println("Enter OTP");
		Scanner scanner = new Scanner(System.in);
		int userOtp = scanner.nextInt();
		scanner.close();
		
		//OTP assumed to 10101.
		if(userOtp == 10101) {
			AccountService accountService = new AccountService();
			if(accountService.transferFunds(payer, payee, amount)) {
				System.out.println("Payment successful!");
			}
			else {
				System.out.println("Insufficient balance!");
			}
		}
		else {
			System.out.println("Invalid OTP");
		}
		
	}
	
	public int generateOtp() {
		Random r = new Random(System.currentTimeMillis());
		return 10000 + r.nextInt(20000);
	}

}
