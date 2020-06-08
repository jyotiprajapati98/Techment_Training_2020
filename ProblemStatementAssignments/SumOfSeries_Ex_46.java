/*Write a Java program to find the sum of 
 * the series  1/1! + 2/2! + 3/3! + ……1/N! 
Enter the number of terms you want in 
the series as input. 
Use loops and factorials to calculate the 
sum and get the desired result.

 * */
package com.tech.problemStatements;

import java.util.Scanner;

public class SumOfSeries_Ex_46 {
	
	public static double sumOfSeries(double n) {
		
		double sum=0,factorial=1;
		
		for(int i=1;i<=n;i++) {
			
			factorial=factorial*i;
			
			sum=sum+(i/factorial);
		}
		
		return (sum);
		
	}

	public static void main(String[] args) {
		double number ;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of tim5 want ot add series");
		number =scan.nextInt();
		
		System.out.println("Sum of Series is -->"+sumOfSeries(number));
		
	}

}
