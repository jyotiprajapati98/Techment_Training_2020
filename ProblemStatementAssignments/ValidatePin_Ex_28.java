package com.tech.problemStatements;

import java.util.Scanner;

public class ValidatePin_Ex_28 {

	public static void main(String[] args) {
		
		//variables
		int atmPin=12345;
		
		System.out.println("Enter you pin -- ");
		Scanner scan=new Scanner(System.in);
		
		int enteredPin=scan.nextInt();
		
		//now logic to check continue
		int keyEntry;
		while(enteredPin != atmPin) {
			
			System.out.println("Your ATM pin is not matching");
			System.out.println("Try Again");
			keyEntry=scan.nextInt();
		}
		System.out.println("Pin is accepted");
		System.out.println("Enter for next");
		
	}

}
