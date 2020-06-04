/*
 * java code is for displaying  n prime number */
package com.tech.problemStatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int  primeflag;  
		int number; 
		 
		
		System.out.println(" enter a number to print prime numbers ");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
	    // Print display message  
	    System.out.println("Prime numbers between 1 and "+number + " are:");  
	  
	    // Traverse each number from starting to number   
	    // with the help of for loop  
	    for (int i = 1; i <= number; i++)  
	    {  
	  
	        // Skip 0 and 1 they are not prime number  
	       
	        if (i == 1 || i == 0)  
	            continue;  
	  
	        // flag variable to tell  if i is prime or not 
	        primeflag = 1;  
	  
	        for (int j = 2; j <= i / 2; ++j)  
	        {  
	            if (i % j == 0) 
	            {  
	                primeflag = 0;  //updating the flag
	                break;  
	            }  
	        }  
	  
	        // flag = 1 means i is prime  
	        // flag = 0 means i is not prime  
	        if (primeflag == 1)  
	            System.out.println(i + " ");  
	    }  
		
	}

}
