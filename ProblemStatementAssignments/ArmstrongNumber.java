package com.tech.problemStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number,reminder,sum=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number to check it armstrong or not");
		number=scan.nextInt();
		
		int temp = number;
		//logic here 
		while(number>0) {
			//for reminder mod operation 
			
			reminder = number % 10;//return last digit 
			sum=sum+(reminder * reminder * reminder);
			number = number /10;
			
		}
		
		if(temp == sum)
		{
			System.out.println(temp + " is armstrong number");
		}
		else {
			System.out.println(temp + " is not armstrong number");
		}
		
		
	}

}
