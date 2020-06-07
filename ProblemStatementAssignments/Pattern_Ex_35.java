/*
 * 
1
12
123
1234
12345
123456
1234567
123456
12345
1234
123
12
1

 * 
 * 
 * */

package com.tech.problemStatements;

import java.util.*;

public class Pattern_Ex_35 {

	public static void main(String[] args) {
		int rows;
		
		System.out.println(" enter number of rows you want --");
		Scanner scan=new Scanner(System.in);
		rows=scan.nextInt();
		int count=0,num=2;
		
	//logic start form here
	while(num>0)
	{	
		if(count==0)
		{
				for(int i=1;i<=rows;i++) {
					
					for(int j=1;j<=i;j++) {
						System.out.print(j+" ");
					}
					System.out.println();
				}
				count++;
		}
		else {
				for(int i=1,r=rows-1;i<=rows-1;i++,r--) {
					
					for(int j=1;j<=r;++j) {
						System.out.print(j+" ");
					}
					System.out.println();
				}
			}
		num--;
		}
		
	}

}
