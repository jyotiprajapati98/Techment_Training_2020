package com.tech.problemStatements;

import java.util.Random;

public class DiceGameEx_27 {

	public static void main(String[] args) {
		//variables
		int num1,num2;
		
		//create object of random class
		Random randomNumber=new Random();
				
		//now generating random numbers
		//for range 0 to 6 write 6
		System.out.println("Roll Your Dice");
		num1=randomNumber.nextInt(6);
		System.out.println("Fisrt number is "+num1);
		
		System.out.println("Roll Your Dice Again");
		num2=randomNumber.nextInt(6);
		System.out.println("Second number is "+num2);
		
		//now condtions 
		if(num1/2==0 && num2/2==0) {
			System.out.println("Your are getting "+(num1+num2));
		}
		else {
			if(num1>num2)
			{
			System.out.println("You are getting "+(num1-num2));
			}
			else {
				System.out.println("You are getting "+(num2-num1));
			}
		}

	}

}
