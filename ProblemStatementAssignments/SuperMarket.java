package com.tech.problemStatements;

import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		//variables initialize here 
		int maxProduct, noOfProducts;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Number of products you have");
		noOfProducts =scan.nextInt();
		
		int productArray[]=new int[noOfProducts];
		
		//taking quantity of each product 
		System.out.println(" Quantity of each products you have");
		for(int i=0;i<productArray.length;i++) {
			
			productArray[i]=scan.nextInt();
		}
		
		maxProduct = productArray[0];
		//logic for finding maximum 
		
		for(int i=0;i<productArray.length;i++) {
			
			if(productArray[i]>maxProduct)
			{
				maxProduct =productArray[i];
			}
		}
		System.out.println(" Maximum quantity is "+maxProduct);
		
	}

}