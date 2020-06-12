package com.tech.problemStatements;

import java.util.*;

public class Anagram_Ex_50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first word");
		String first=scan.next();
		
		System.out.println("enter second word");
		String second=scan.next();
		
		boolean result=checkAnagram(first,second);
			if(result==true)
				System.out.println("Anagram");
	        else
	        System.out.println("Not Anagram");

	}
	public static boolean checkAnagram(String first,String second) {
		//remove whitespace
		
		first=first.replaceAll("\\s","").toLowerCase();
		
		second=second.replaceAll("\\s","").toLowerCase();
	
		//logic here 
		
		char[] firstArray=first.toCharArray();
		char[] secondArray=second.toCharArray();
		
		//now sort arrays
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		//equality checking 
		return Arrays.equals(firstArray, secondArray);
	}
			
		
}
