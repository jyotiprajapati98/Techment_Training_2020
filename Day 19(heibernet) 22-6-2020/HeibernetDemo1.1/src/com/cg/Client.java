package com.cg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("configuration.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		//insertion 
		Session session = factory.openSession();
		
		
		//retrive session1
		Session session1 = factory.openSession();
		
		Transaction t = session1.beginTransaction();
		
		Employee e = new Employee();
		e.setId(3);
		e.setName("Sriya");
		e.setDept("HR");
		
		session.persist(e);
		
		System.out.println("Inserted...!");
		
		//code for display data 
		/*
		Employee emp=session1.get(Employee.class,1);
		System.out.println(emp.getId()+""+emp.getName()+""+emp.getDept());
		*/
		
		
		//update
		
		//Employee emp=session1.get(Employee.class,1);
		
		/*emp.setName("King...");
		
		System.out.println(emp.getId()+""+emp.getName()+""+emp.getDept());
		System.out.println("updated..");
		*/
		
		//delete
		/*
		  session1.remove(emp);
		  System.out.println("deleted..");
		
		 */
		
		t.commit();
		session.close();
	}

}

