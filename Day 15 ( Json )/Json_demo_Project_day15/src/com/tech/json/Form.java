package com.tech.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Form
 */
@WebServlet("/myjavafile1")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    Gson gson=new Gson();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Employee emp=new Employee();
		
		emp.setId(Integer.parseInt(request.getParameter("user_id")));
		//emp.setId(1);
		//emp.setName("Jyoti");
		emp.setName(request.getParameter("user_name"));
		emp.setId(Integer.parseInt(request.getParameter("user_age")));
		
		String empString =gson.toJson(emp);
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		out.print(empString);
	
	
	}

	

}
