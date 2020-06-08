/*
 * Create a list of Product Objects with id,name and price 
 * as attributes  and store the objects into an array . 
 * Display the products in ascending order of their names.

Solution : Create a Product Class with with attributes pid, name and price.
Provide parameterized constructor to create product objects initializing
 with values entered from user.
Use a loop to create 5 product objects populated with 
values from user and sort the products using any sorting algorithm and display  
the list in sorted order of their name

 * */
package com.tech.problemStatements;
import java.io.*;
import java.util.*;
class Production{
	int pid;
	String name;
	double price;
	
	
	//getting id
	public int getPid() {
		return pid;
	}
	
	//setting id 
	public void setPid(int pid) {
		this.pid=pid;
	}
	
	//getting name
	public String getName() {
		return name;
	}
	
	//setting name
	public void setName(String name) {
		this.name=name;
	}
	
	public double getPrice() {
		return price;
	}
	
	//setting name
	public void setPrice(double price) {
		this.price=price;
	}
	
	//constructor
		public Production(int pid,String name,double price) {
			super();
			this.pid=pid;
			this.name=name;
			this.price=price;
		}
		
}

//sorting objects 
public class SortingObjectInArray_Ex_47 {

	public static void main(String[] args) {
		Production p[]=new Production[5];
		Scanner scan=new Scanner(System.in);
		
		//loop
		for(int i=0;i<p.length;i++) {
			
			System.out.println("enter product Id,Name,Price-->");
			
			int id=scan.nextInt();//id
			String name=scan.next();//name
			double price=scan.nextDouble();//PRICE
			
			p[i] =new Production(id,name,price);
		}
		
		for(int i=0;i<p.length;i++) {
			
			for(int j=0;j<p.length;j++) {
				
				if(p[i].getName().compareTo(p[j].getName())<0) {
					
					Production temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		
		for(Production product:p) {
			System.out.println(product.getPid()+" "+product.getName()+" "+product.getPrice());

		}
	}

}
