package com.tech.problemStatements;

import java.util.Scanner;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		
		int size;
		
		System.out.println("enter size of array");
		Scanner scan=new Scanner(System.in);
		size=scan.nextInt();
		
		int[]array=new int[size];
		
		
		System.out.println("enter elements in array");
		
		for(int i=0;i<size;i++) {
			
			array[i]=scan.nextInt();
		}
		
		//checking the index out of  bound condition
		System.out.println("enter index which you want to print");
		
		try {
			int find=scan.nextInt();
			System.out.println("Given value is "+array[find]);
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("The index you have entered is invalid");
	        System.out.println("Please enter an index number between your given range");
		}
		
		
	}

}