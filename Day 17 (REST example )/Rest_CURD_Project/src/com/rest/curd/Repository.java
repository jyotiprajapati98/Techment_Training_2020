package com.rest.curd;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	/*making static 
	 * ArrayList object  */
	
	static ArrayList<Student> stdlist =new ArrayList<Student>();

	/* creating the static block for initializing data */
	static {
		stdlist.add(new Student(1,"Jyoti","CSE"));
		stdlist.add(new Student(2,"Siya","CSE"));
		stdlist.add(new Student(3,"Shreyansh","CSE"));
		
	}
	
	
	/* made a method for return the list */
	public List<Student> getAll(){
		
		return stdlist;
	}
	
	
	public String addStudent(Student stu) {
		stdlist.add(stu);
		return "student added";
	}
	
	public String deleteStudent(int id) {
		stdlist.remove(id);
		return "student deleted";
	}
	
	public String updateStudent(Student stu) {
		
		System.out.println("before update "+stdlist);
		stdlist.get(stu.getId()).setName(stu.getName());
		System.out.println("afterupdate "+stdlist);
		return "student Updated";
	}
}
