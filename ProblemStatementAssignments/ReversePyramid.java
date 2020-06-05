/*
 * 
 * print pattern
 * 1 2 3 4 5 6 5 4 3 2 1 
     1 2 3 4 5 4 3 2 1 
       1 2 3 4 3 2 1 
         1 2 3 2 1 
           1 2 1 
             1 
  */


package com.tech.problemStatements;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		
		int rows;
		
		System.out.println(" Number of rows you want --");
		Scanner scan=new Scanner(System.in);
		rows=scan.nextInt();
		
		//print logic here 
		int count = rows;
	
		//logic for printing pyramid
		for (int i = 0; i < rows; i++) {
			
			//i*2 spaces every line
			for (int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			}
			
			//printing j, 1 to count
			for (int j = 1; j <= count; j++) {
				System.out.print(j+" ");
			}
			
			//printing j, count to 1
			
			for (int j = count-1; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
			
			//decrement count by 1
			count--;
		}
	}

}
