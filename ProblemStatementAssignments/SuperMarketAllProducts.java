package com.tech.problemStatements;

import java.util.Scanner;

public class SuperMarketAllProducts {

	public static void main(String[] args) {
		//variables initialize here 
				int  noOfProducts,totalProducts=0;
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println(" Number of products you have");
				noOfProducts =scan.nextInt();
				
				int productArray[]=new int[noOfProducts];
				
				//taking quantity of each product 
				System.out.println(" Quantity of each products you have");
				for(int i=0;i<productArray.length;i++) {
					
					productArray[i]=scan.nextInt();
					totalProducts =totalProducts + productArray[i];
				}
				System.out.println("Total Number Of Products is"+totalProducts);
				
	}

}
