/*this is main class fetch  the all data  here 
 * 
 * the Repository and Student class is supporting classes */
package com.rest.curd;

//all importing classes are here 
import java.util.List;

//import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/StudentList")
public class StudentRestApi {
	
	/*made a student list that is list type
	 * 
	 * getStudent() return the all student details */
	@GET
	@Path("/getall")
	/*
	 * 
	 * it will give a .json file with the student data */
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent(){
		
		//creating the repository the object 
		Repository repo=new Repository();
		return repo.getAll();
	}
	
	@POST
	@Path("/add")
	/*
	 * 
	 * it will give a .json file with the student data */
	//@Consumes(MediaType.APPLICATION_JSON)
	
	public String  addStudent(Student stu){
		
		//creating the repository the object 
		Repository repo=new Repository();
		return repo.addStudent(stu);
	}
	
	//based on index 
	@DELETE
	@Path("/delete/{id}")
	
	public String delStudent(@QueryParam ("id") int id) {
		
		Repository repo=new Repository();
		return repo.deleteStudent(id);
		
	}
	
	@PUT
	@Path("/update/")
	
	public String updateStd(Student stu) {
		
		Repository repo=new Repository();
		return repo.updateStudent(stu);
		
	}

}
