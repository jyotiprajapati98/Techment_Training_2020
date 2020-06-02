package com.tech.problemStatements;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		System.out.println(" Enter Birth Month -->");
		
		//scanning user input by Scanner  class scan object
		Scanner scan =new Scanner(System.in);
		int month = scan.nextInt();
		
		//switch cases start from here
		switch(month) {
			case 1:
				System.out.println(" Your birth month is January ");
				break;
			case 2:
				System.out.println(" Your birth month is Febuary ");
				break;
			case 3:
				System.out.println(" Your birth month is March ");
				break;
			case 4:
				System.out.println(" Your birth month is April ");
				break;
			case 5:
				System.out.println(" Your birth month is May ");
				break;
			case 6:
				System.out.println(" Your birth month is June ");
				break;
			
			case 7:
				System.out.println(" Your birth month is July ");
				break;
			case 8:
				System.out.println(" Your birth month is August ");
				break;
			case 9:
				System.out.println(" Your birth month is September ");
				break;
			case 10:
				System.out.println(" Your birth month is October ");
				break;
			case 11:
				System.out.println("  Your birth month is November ");
				break;
			case 12:
				System.out.println(" Your birth month is December ");
				break;
		}
		
	}

}
