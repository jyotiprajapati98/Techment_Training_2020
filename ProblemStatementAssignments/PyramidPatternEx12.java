
/*
 * print pattern
 
    	  5 
        4 5 4 
      3 4 5 4 3 
    2 3 4 5 4 3 2 
  1 2 3 4 5 4 3 2 1 

 * */
package com.tech.problemStatements;

import java.util.Scanner;

public class PyramidPatternEx12 {

	public static void main(String[] args) {
		
		//variables are here 
		int patternRows;
		
		//print messagae
		System.out.println(" how many rows you want ot print ");
		Scanner scan=new Scanner(System.in);
		
		patternRows=scan.nextInt();
		
		
		//outer loop for print spaces for line 
		for(int i=patternRows;i>=1;i-- ) {
			 
			for(int j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			
			//print the values from j to number of rows 
			
			for (int j = i; j <= patternRows; j++) 
			{
			System.out.print(j+" ");
			}

			//Printing j values where j print number of rows to i 

			for (int j = patternRows-1; j >= i; j--)
			{ 
			System.out.print(j+" "); 
			}

			System.out.println();

		}
	}

}
