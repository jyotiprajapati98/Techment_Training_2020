package com.tech.problemStatements;
//import 
import java.util.Random;

public class CompareRandomNumbersEx26 {

	public static void main(String[] args) {
		//variables
		int num1,num2;
		
		
		//create object of random class
		Random randomNumber=new Random();
		
		//now generating random numbers
		//for range 0 to 10 write 10
		num1=randomNumber.nextInt(10);
		num2=randomNumber.nextInt(10);
		
		//now compare 
		if(num1==num2) {
			
			System.out.println(num1+","+num2+"  random number are eqal");
		}
		else {
			System.out.println(num1+","+num2+ "  random number are not eqal");
		}
		
		
	}

}
