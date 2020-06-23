package com.cg;

import javax.persistence.Column; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import javax.persistence.Entity; 


@Entity @Table(name="emp60") 
public class Employee { 	 	
	
	@Id 	private int id; 	 	
	@Column(name="empname") 	
	private String name; 	
	private String dept; 	
	
	public int getId() 
	{ 		
		return id; 	
	} 	
	
	public void setId(int id) 
	{ 		
		this.id = id; 	
	} 	
	
	public String getName() 
	{ 		
		
		return name; 	
	} 	
	
	public void setName(String name) 
	{ 		
		this.name = name; 	
	} 	
	
	public String getDept() 
	{ 		
		return dept; 	
	} 	
	
	public void setDept(String dept) 
	{ 		
		
		this.dept = dept; 	
		
	} 	
	
	@Override 	
	
	public String toString() { 		
		
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]"; 	
		
	} 	  
	
}