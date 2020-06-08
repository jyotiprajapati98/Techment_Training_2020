package com.tech.problemStatements;

import java.util.*;
public class PermutationString_Ex_42 {
	
	public static Set<String> permutationFind(String str){
		
		Set<String> permutaion =new HashSet<String>();
		
		//when throws error
		if(str==null) {
			return null;
		}
		else if(str.length()==0) {
			
			permutaion.add("");
			return permutaion;
		}
		
		
		char initial =str.charAt(0);
		
		String remain= str.substring(1);
		Set<String> words=permutationFind(remain);
		
		for(String strNew:words) {
			
			for(int i=0;i<=strNew.length();i++) {
				
				permutaion.add(charInsert(strNew,initial,i));
			}
		}
		return permutaion;
	}
	
	public static String charInsert(String str,char c,int j) {
		String begin = str.substring(0,j);
		String end =str.substring(j);
		
		return begin +c+end;
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string --");
		String str=scan.next();
		
		Set <String> result = permutationFind(str);
		
		for(String s:result) {
			
			System.out.println(s);
		}
		
		
	

	}

}
