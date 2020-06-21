package com.rest.assignment;

public class Employee {
	
	/*private variables decalre here */
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	
	
	/*constructor with parameter*/	
	public Employee() {
		super();
	}
	
	
	/* parameterized constructor  */
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	
	/*for the all elements like id,name,dept,salary making get and set functions*/
	//for id 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	//for name
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	//for department
	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	//for salary 
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/*making method for converting the object to String*/
	@Override
	public String toString() {
		
		return "Employee id -->"+id+ " name is --> "+name+" dept is -->"+dept +"salary is "+salary;
	}

}
