package com.tech.problemStatements;

import java.util.Scanner;

public class CommArray {

	public static void main(String[] args) {

		//variables initialize here
		int numberOfElements;
		
		//scanning the user input
		System.out.println(" size of  array ");
		Scanner scan=new Scanner(System.in);
		numberOfElements=scan.nextInt();
		
		//initializing tow array with same size 
		//array 1
		int array1[]=new int[numberOfElements];
		
		//array2
		int array2[]=new int[numberOfElements];
		int i,j;
		
		System.out.println(" first array elements ");
		//for loop for inserting elements in first array 
		for( i=0;i<array1.length;i++) {
			
			array1[i]=scan.nextInt();
		}
	
		System.out.println(" second array elements ");
		//for loop for inserting elements in second array 
		for( i=0;i<array2.length;i++) {
			
			array2[i]=scan.nextInt();
		}
			
		//compare the both arrays
		
		for( j=0;j<numberOfElements;j++) {
			
			if(array1[j] != array2[j]) {
				System.out.print(" not same ");
				break;
			}
			
		}
		if(j==numberOfElements) {
			System.out.println(" array are same ");
		}
		
	

	}

}