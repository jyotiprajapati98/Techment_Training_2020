package com.tech.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/student")
public class StudentApi {
	
	@GET
	@Path("/sdetails")
	public String getStudentDetails() {
		
		return "hello this is student details";
	}
	
	@GET
	@Path("/byname/{name}")
	public String getStudentName(@PathParam("name") String name){
		
		return "hello this is name  "+name;
		
	}
	
	/*
	 * getting the user details, here first setting the id 
	 * name , dept then display them */
	@GET 
	@Path("/getStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentDetails2() {
		
		/*creating object of the student class*/
		Student student=new Student();
		
		student.setId(1);
		student.setName("Jyoti");
		student.setDept("CSE");
		
		//return Response.ok(student).build();
		return student;
		
	}
		
	
	
	

}

