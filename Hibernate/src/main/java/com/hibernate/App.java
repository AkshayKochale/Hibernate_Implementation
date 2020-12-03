package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class App {

	public static void main(String[] args) throws Exception {

		Configuration cg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cg.buildSessionFactory();
		System.out.println("Session factory created");
		Session s = sf.openSession();
		System.out.println(" Current Sesion ");
		org.hibernate.Transaction t = s.beginTransaction();
		System.out.println("transation begin");

//		Student stu1 = new Student();
//		stu1.setId(01);
//		stu1.setName("Akshay");
//		stu1.setCourse("java");
//
//		Address ad = new Address();
//		ad.setPcode(70);
//		ad.setArea("kurla");
//		ad.setCity("mumbai");
//		ad.setStu(stu1);
//
//		Address ad1 = new Address();
//		ad1.setPcode(69);
//		ad1.setArea("bkc");
//		ad1.setCity("nashik");
//		ad1.setStu(stu1);
//
//		Address ad2 = new Address();
//		ad2.setPcode(71);
//		ad2.setArea("sion");
//		ad2.setCity("panvel");
//		ad2.setStu(stu1);
//
//		List<Address> address = new ArrayList<Address>();
//		address.add(ad);
//		address.add(ad1);
//		address.add(ad2);
//
//		stu1.setAd(address);
//
//		s.save(ad);
//		s.save(ad1);
//		s.save(ad2);
//		s.save(stu1);
//

//		//Creating employees
//		emp e1= new emp();
//		e1.setEid(10);
//		e1.setName("Akshay");
//		
//		emp e2= new emp();
//		e2.setEid(11);
//		e2.setName("Ajinkya");
//		
//		emp e3= new emp();
//		e3.setEid(12);
//		e3.setName("Supriya");
//		
//		
//		//Creating projects
//		project p1= new project();
//		p1.setPid(01);
//		p1.setPname("java Project");
//
//		project p2= new project();
//		p2.setPid(02);
//		p2.setPname("sql project");
//
//		project p3= new project();
//		p3.setPid(03);
//		p3.setPname("Maven Project");
//
//		
//		// creating List of emps and projects
//		
//		List<project> projects = new ArrayList<project>();
//		List<emp> emps= new ArrayList<emp>();
//		List<project> selectPro = new ArrayList<project>();
//		List<emp> selectEmp= new ArrayList<emp>();
//		
//		
//		emps.add(e1);emps.add(e2);emps.add(e3);
//		projects.add(p1);projects.add(p2);projects.add(p3);
//		selectPro.add(p1);selectPro.add(p2);
//		selectEmp.add(e1);selectEmp.add(e3);
//		
//		// adding list to the each object
//		
//		// adding projects to the emp
//		
//			e1.setProject(projects);
//			e2.setProject(selectPro);
//			e3.setProject(projects);
//		
//			
//		// adding emps to projects
//			
//			p1.setEmp(emps);
//			p2.setEmp(selectEmp);
//			p3.setEmp(emps);
//			
//		s.save(e1);s.save(e2);s.save(e3);
//		s.save(p1);s.save(p2);s.save(p3);
//			

		System.out.println("========================");
		String q = "from emp where eid=:x";
		String d = "delete from project where pid=:p";

		// for fetching/selecting result from database

//			qu.setParameter("x",10);
//			
//			List<emp> l= qu.getResultList();
//		
//			
//			for(emp e:l){
//				
//			System.out.println(e.getEid() +" "+ e.getName());
//			
//			}

		// for deleting record from database

//			Query qu=s.createQuery(d);

//			 qu.setParameter("p", 2);
//				int r=qu.executeUpdate();
//				
//			 System.out.println("result is processed" +r);

		System.out.println("============================");

		// for updating record in the table

//			 String u="update emp set name=:n where eid=12";
//			Query qu= s.createQuery(u);
//			qu.setParameter("n", "Tejal");
//			 
//			int r=qu.executeUpdate();
//			System.out.println("updated!!!! "+r);

		System.out.println("===================");

		// joining tables

//			String jq= ;
			System.out.println("Working till herer");
			NativeQuery nativeQuery = s.createSQLQuery("select emp.eid,emp.name,project.pname from emp inner join project");
 			//Query l=s.createQuery("select emp.eid,emp.name,project.pname from emp inner join project"); 	
			System.out.println("query created" +nativeQuery);
			
			List ll=nativeQuery.getResultList();
			System.out.println("list added");
			System.out.println(ll);
//			
		t.commit();
		sf.close();

		System.out.println("Task completed");

	}
}
