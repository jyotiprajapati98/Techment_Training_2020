package com.tech.problemStatements;
//import
import java.util.*;

public class LetterAtTime_Ex_30 {

	public static void main(String[] args) {
	
			//taking message form user 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Write your message here-->");
		//message is string so using the string 
		String message=scan.nextLine();
		
		//print the length of whole message
		System.out.println("length of your message "+message.length());
		
		System.out.println("First charecter of your message is  "+message.charAt(0));
		
		//now for last charecter 
		int lastchar =message.length()-1;
		
		System.out.println("last charecter of message - "+message.charAt(lastchar));
		
		//all char positions
		System.out.println("position of all charecters-");
		
		for(int i=0;i<message.length();i++) {
			
			System.out.println(message.charAt(i)+" at "+i);
			
		}
		int count_a=0;
		char letter;
		for(int i=0;i<message.length();i++) {
			
			letter=message.charAt(i);
			if(letter == 'a' || letter =='A') {
				 count_a++;
			}
		}
		System.out.println("Message contains "+count_a+" time a.");
		
		
		
	}

}
