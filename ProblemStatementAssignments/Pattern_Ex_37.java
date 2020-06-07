/*
 *  1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

 * 
 * 
 * */
package com.tech.problemStatements;

import java.util.Scanner;

public class Pattern_Ex_37 {

	public static void main(String[] args) {
		
		int rows;
		System.out.println("Enter number of rows you want to print -");
		Scanner scan=new Scanner(System.in);
		rows=scan.nextInt();
		
		//print pattern
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<rows-(i-1);j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int l=2;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
			
		}//uppper side finish
		
		for(int i=1;i<=rows-1;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=rows-i;k>=1;k--) {
				System.out.print(k);
			}
			for(int l=2;l<=rows-i;l++) {
				System.out.print(l);
			}
			System.out.println();
			
		}
		
	}

}