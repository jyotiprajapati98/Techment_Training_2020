
package com.rest.assignment;

import java.util.ArrayList;
import java.util.List;

/*That class is contain method for show all employee, add new employee 
 * Delete the employee details , edit and update the employee details that why this is called the Employee Repository*/

public class EmpRepo {
	
	//make ArrayList static object 
	static ArrayList<Employee> emplist =new ArrayList<Employee>();
	
	/* creating the static block for initializing data */
	static {
		emplist.add(new Employee(1,"Jyoti","devlopment",50000));
		emplist.add(new Employee(2,"Siya","HR",30000));
		emplist.add(new Employee(3,"Shreyansh","Manager",35000));
		
	}
	
	/*  method for return the list of all employees  */
	public List<Employee> getAll(){
		
		return emplist;
	}
	
	
	/*
	 * this method is used to add new employee in emp list */
	
	public String addEmployee(Employee emp) {
		emplist.add(emp);
		return "New employee is registered";
	}
	
	
	/*
	 * This method is for deleting the employee details from list*/
	public String deleteEmployee(int id) {
		emplist.remove(id);
		return id+"number of  employee  is removed";
	}
	
	/*This method is for updating the employee details means we can perform the edit and update operation here  */
	
	public String updateEmployee(Employee emp) {
			
			System.out.println("before updation the list "+emplist);
			emplist.get(emp.getId()).setName(emp.getName());
			System.out.println("after updation the list  "+emplist);
			return "Employee details are updated ";
	}

}
