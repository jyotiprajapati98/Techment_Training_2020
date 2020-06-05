/*
 * print this pattern 
 * 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
package com.tech.problemStatements;

public class PrintPatternEx11 {

	public static void main(String[] args) {
		int rows=5;
		
		//outer loop for rows 
		for(int i=1;i<=rows;i++ ) {
			
			
			//inner loop for printing 
			//column print is less by 1 every time 
			for(int j=1;j<=rows-i+1;j++) {
				
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}

	}

}