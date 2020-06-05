package com.tech.problemStatements;

import java.util.Scanner;

public class MultiplicationTableEx31 {

	public static void main(String[] args) {
		int number;
		
		System.out.println("enter number for printing table");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		
		//print the table
		System.out.println("Table of "+number);
		for(int i=1;i<=10;i++) {
			
			System.out.println(" "+number+" * "+i + "  =  "+number*i);
		}
	}

}
