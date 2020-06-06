package com.tech.problemStatements;

import java.util.ArrayList;
import java.util.Collections;  

public class CommandLine {

	public static void main(String[] args) {
		  
		//making arraylist collection for taking input
		ArrayList <String> name=new ArrayList<String>();
		
		for(int i=0;i<args.length;i++) {
			
			name.add(args[i]);
			
		}
		//sorting names by sort method
		Collections.sort(name);
	 
		//System.out.println(args[0]); 
		
		//print the names
		System.out.println("name in sorted order");
		
		for(String s:name) {
			System.out.println(s);
		}
	}

}
