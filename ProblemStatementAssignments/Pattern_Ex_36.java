/*
 * print pattern
 * 
1234554321
1234 4321
123 321
12 21
1 1


 * 
 * */

package com.tech.problemStatements;
import java.util.*;
public class Pattern_Ex_36 {

	public static void main(String[] args) {
		
		int rows;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the numbr of rows-");
		rows=scan.nextInt();
		
		//print pattern logic
		for(int i=0,n=rows;i<=rows;i++,n--) {
			
			for(int j=1;j<=n;j++) {
				
				System.out.print(j);
			}
			
			if(n!=rows) {
				System.out.print(" ");
			}
			for(int k=n;k>=1;k--) {
				
				System.out.print(k);
			}
			System.out.println();
		}
		
		
	}

}