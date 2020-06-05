package com.tech.problemStatements;

import java.util.Scanner;

//exception class is here 
class VotingException extends Exception{
		
	public VotingException(String str) {
		
		System.out.println(str);
	}
}//exception class close here


public class InvalidAgeException {
	public static void main(String[] args) {
		
		//variables declare here
		int age;
		
		//scanning user input 
		System.out.println(" enter your age");
		Scanner scan=new Scanner(System.in);
		
		age=scan.nextInt();
		
		//try catch block start here 
		try {
			if(age < 18) {
				throw new VotingException("you are under 18 can't give vote");
			}
			else {
				System.out.println(" welcome to for vote");
			}
		}//try block is closed 
		
		//catch block is start here 
		//e is exception message
		catch(VotingException e) {
			System.out.println(e);
		}

	}

}
