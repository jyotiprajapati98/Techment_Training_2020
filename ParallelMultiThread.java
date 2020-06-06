package com.tech.problemStatements;

import java.util.*;
import java.lang.*;

class ChildThread extends Thread{
	//variable initialize
	int dollers;
	
	//constructor
	ChildThread(int dollers){
		
		super();
		this.dollers=dollers;
	}
	
	//run method that is default in thread
	public void run() {
		for(int i=0;i<dollers;i++) {
			System.out.println("$");
			
			//try catch block
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
} 
public class ParallelMultiThread {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of $ want to print ");
		int dollers=scan.nextInt();
		
		System.out.println("Enter number of * want to print ");
		int stars=scan.nextInt();
		
		ChildThread t1=new ChildThread(dollers);
		t1.start();
		
		//print stars
		
		for(int i=0;i<stars;i++) {
			
			System.out.println("*");
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
	}

}
