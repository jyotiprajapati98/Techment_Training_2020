package com.tech.rest;

import javax.ws.rs.Path;

public class Employee {
	
	@Path("empdetails")
	public String getStudentDetails() {
		
		return "hello this is employee details";
	}
	
}
