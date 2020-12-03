package com.test2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test2 {

	public static void main(String[] args) {

		
		Configuration con= new Configuration();
		con.configure("com/test2/hibernate.cfg.xml");
		 SessionFactory fac=con.buildSessionFactory();
	
		 Session s= fac.openSession();
	
		 classroom c1= new classroom();
		 c1.setN(01);
		 c1.setClassName("A");
		 c1.setClassTeacher("akshay");
		 classroom c2= new classroom();
		 c1.setN(02);
		 c1.setClassName("A");
		 c1.setClassTeacher("Kochale");
		 
		 Student s1= new Student();
		 s1.setId(1101);
		 s1.setName("Ajinkya");
		 s1.setRank(3);
		 List<classroom> croom= new ArrayList<classroom>();
		 croom.add(c1);croom.add(c1);
		 s1.setCroom(croom);
		 Transaction t= s.beginTransaction();
		 
//		 Query q= s.createQuery("from Student");		 
//		 
//		 List<Student> list = q.list();
//		 
//		 System.out.println(list);
//		 O
		 
		 s.save(c1);
		 s.save(c2);
		 s.save(s1);
		 
		 t.commit();
		 s.close();
		 fac.close();
		 
		 
	}

}
