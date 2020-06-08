package com.tech.problemStatements;

import java.util.Scanner;

public class AccountLocked_Ex_45 {

	public static void main(String[] args) {
		
		
		int atmPin=12345;
		int userEntry;
		int limit =0;
		Scanner scan=new Scanner(System.in);
		System.out.println("welcome to the bank of Manipal");
		System.out.print("Enter your pin ");
		
		userEntry=scan.nextInt();
		limit++;
		
		while(userEntry!=atmPin && limit <3) {
			
			System.out.println("Incorrect Pin Try Again");
			System.out.print("Enter your pin");
			userEntry=scan.nextInt();
			limit++;
			
		}
		if(userEntry==atmPin) {
			
			System.out.print("Pin Accepted");
		}
		else if(limit>=3) {
			System.out.print("limit is exceeds Your Account is lock");
		}
	}

}
