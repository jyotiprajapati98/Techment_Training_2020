package com.tech.problemStatements;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		float weight,height,bmi;
		
		//scaning inputs
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your weight in kg  ");
		weight=scan.nextFloat();
		
		System.out.println("enter your height in meter");
		height=scan.nextFloat();
		
		//convert weight in to cm because height in meter
		bmi=(100*100 * weight)/(height*height);
		System.out.print("Your BMI is "+bmi);
		
		if(bmi<18.5) {
			
			System.out.print("Underweight");
		}
		else if(bmi<25) {
			System.out.print("Normal");
		}
		else if(bmi<30) {
			System.out.print("Overweight");
		}
		else {
			System.out.print(" Obese");
		}

	}

}
