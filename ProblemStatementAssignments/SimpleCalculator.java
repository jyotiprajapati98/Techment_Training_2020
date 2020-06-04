package com.tech.problemStatements;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//variables
		int num1,num2,operator;
		//operators
		int add=0, minus=0, multiply,divid ,mod;
		
		//scanning user input by Scanner  class scan object
		Scanner scan =new Scanner(System.in);
		
		System.out.println(" Enter first number");
		num1 = scan.nextInt();
		
		System.out.println(" Enter Second  number");
		num2 = scan.nextInt();
		
		System.out.println(" select operator -->");
		
		System.out.println(" Enter Operator");
		System.out.println("1 --> ADD");
		System.out.println("2 --> MINUS");
		System.out.println("3 --> MULTIPLY");
		System.out.println("4 --> DIVID");
		System.out.println("5 --> MOD");
		System.out.println("0 --> Exit");
		
		operator = scan.nextInt();
		
		switch(operator) {
			case 1:
				
				System.out.print(num1+"+"+num2 +"="+(num1+num2));
				break;
			
			case 2:
				System.out.println( num1+"-"+num2 +"="+(num1-num2) );
				break;
				
			case 3:
				System.out.println( num1+"*"+num2 +"="+(num1*num2) );
				break;
			
			case 4:
				System.out.println( num1+"/"+num2 +"="+(num1/num2) );
				break;
				
			case 5:
				System.out.println( num1+"-"+num2 +"="+(num1%num2) );
				break;
			
			case 0:
				System.out.println(" Exit from calculator --" );
				break;
				
			default:
				System.out.println(" enter correct operator");
		}
	}

}
