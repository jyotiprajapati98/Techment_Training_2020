/*
 * : Write a program to accept the day value as input 
 * and display appropriate message as
 *  output based on the day  
 * 
 * odd-even rule follow */

import java.util.*;
public class TrafficCongestion{
	public static void main(String[] args)
	{
		//two variables for car number and date
		int date,carNumber;
	
	//scanner class object s is used to taking input
		System.out.println("enter date between 1  to 31 :");
		Scanner d=new Scanner(System.in);
		date=d.nextInt();
		
		System.out.println("enter car number");
		Scanner c=new Scanner(System.in);
		carNumber=c.nextInt();
		
		//day is between 1 to 31 so wee check it
		if(date > 1 && date <31)
		{
			if(date % 2==0)
				System.out.println("Cars with Even registration numbers are permitted today  "+carNumber);
			else
				System.out.println("Cars with Odd registration numbers are permitted today " +carNumber);
	
		}
		else
			System.out.println("give correct date");
	}		
}
