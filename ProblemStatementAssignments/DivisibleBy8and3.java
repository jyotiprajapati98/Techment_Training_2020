package com.tech.problemStatements;

import java.util.Scanner;

public class DivisibleBy8and3 {

	public static void main(String[] args) {
		
		//variable initialize here
		int price;
		
		//taking input by user
		System.out.println(" enter price of product to check divisible by 8 & 3 ");
		Scanner scan =new Scanner(System.in);
		
		price=scan.nextInt();
		
		//condition checking by if and else
		if(price % 8 == 0 && price % 3 == 0) {
			System.out.println(price+" is divisible by both 8 & 3");
		}
		else {
			System.out.println(price+" is not divisible by both 8 & 3 ");
		}
	}

}
