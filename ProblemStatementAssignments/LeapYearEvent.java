package com.tech.problemStatements;

import java.util.Scanner;

public class LeapYearEvent {

	public static void main(String[] args) {
		
		System.out.println(" Enter Year -->");
		
		//scanning user input by Scanner  class scan object
		Scanner scan =new Scanner(System.in);
		int year = scan.nextInt();
		
		System.out.println("entered year is -->"+year);
		
		
		//now calculating leap year 
		if(year % 4 ==0) {
			
			//nested if else used here 
			if(year%100==0) {
				
				if(year % 400==0) {
					System.out.print(year +" is leap year ");
				}
				else {
					System.out.print(year +" not leap year ");
				}
			}
			else {
				System.out.print(year +"  leap year ");
				
			}

		}// first if is closed 
		
		else {
			System.out.print(year +" not leap year ");
			
		}//else is closed
	}
}
