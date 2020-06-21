package com.rest.curd;

public class Student {

	private int id;
	private String name;
	private String dept;
	

	
	public Student() {
		super();
		
	}


	public Student(int id, String name, String dept) {
		
		super();
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		
		this.id=id;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getDept() {
		
		return dept;
	}
	public void setDept(String dept) {
		
		this.dept=dept;
	}

	@Override
	public String toString() {
		
		return " student id -->"+id+" name is --> "+name+" dept is -->"+dept;
	}

	
}
