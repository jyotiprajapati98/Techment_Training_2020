
/*
 * print this 
7654321
765432
76543
7654
765
76
7

 * 
 * 
 * 
 * */
package com.tech.problemStatements;

import java.util.Scanner;

public class PatternEx34 {

	public static void main(String[] args) {
		int rows;
	
		System.out.println("number of rows you want to print");
		Scanner scan=new Scanner(System.in);
		rows=scan.nextInt();
		
		//logic here 
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=rows;j>=i;j--) {
				
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
