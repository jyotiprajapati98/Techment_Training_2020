package com.tech.problemStatements;

import java.util.Scanner;

public class StackImplementation_Ex_41 {
	
	private static final  int capacity=5;
	int stackArray[]=new int[capacity];
	int top=-1;
	
	//push function
	public void push(int pushElement) {
		
		if(top<capacity-1) {
			top++;
			stackArray[top]=pushElement;
		}
		else {
			System.out.println("Stack if full , stack overflow");
		}
	}
	
	//pop  function here 
	public void pop() {
		if(top>=0) {
			System.out.println("Item pop is :- "+stackArray[top]);
			top--;
		}
		else {
			System.out.println("no elemets , stack underflow");
			}
		}
	//print stack
		public void printElements() {  
		
		  if (top >= 0) {   
		   System.out.println("Elements in stack :");  
		   
		   	for (int i = 0; i <= top; i++) {   
		   		System.out.println(stackArray[i]);   
		   	}   
		  }   
		}   

	public static void main(String[] args) {
		
		StackImplementation_Ex_41 stack = new StackImplementation_Ex_41();
		//System.out.println("enter capacity of stack");
		
		Scanner scan =new Scanner(System.in);
		
		int stackSize=5;
		
		System.out.println("enter elements to push");
		
		//loop
		for(int i=0;i<stackSize;i++) {
			
			int item=scan.nextInt();
			stack.push(item);
		}
		stack.printElements();
		
		for(int i=0;i<stackSize;i++) {
			
			stack.pop();
		}
		
		
		

	}

}
