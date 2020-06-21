package com.rest.assignment;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/EmpList")
public class EmployeeRestApi {
	
	
	@GET
	@Path("/allEmp")
	/*  it will give a .json file with the empl data  data */
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getStudent(){
		
		//creating the repository the object 
		EmpRepo emprepo=new EmpRepo();
		return emprepo.getAll();
	}
	
	/* 
	 * API for adding new employee */
	@POST
	@Path("/addEmp")
	//@Consumes(MediaType.APPLICATION_JSON)
	public String  newEmployee(Employee emp){
		
		//creating the repository the object 
		EmpRepo emprepo=new EmpRepo();
		return emprepo.addEmployee(emp);
	}
	
	
	/*This API is used to delete the employee details by given index value mean id.
	  */
		@DELETE
		@Path("/deleteEmp/{id}")
		
		public String delStudent(@QueryParam ("id") int id) {
			
			EmpRepo emprepo=new EmpRepo();
			return emprepo.deleteEmployee(id);
			
		}
		
		/*This API is used to delete the employee details by given index value mean id.
		  */
		@PUT
		@Path("/updateEmp/")
		
		public String updateStd(Employee emp) {
			
			EmpRepo emprepo=new EmpRepo();
			return emprepo.updateEmployee(emp);
			
		}

	
	
}
