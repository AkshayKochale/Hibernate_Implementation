package com.test.pdf;



import java.io.File;
import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class testApp {

	public static void main(String[] args) throws Exception {

		
	SessionFactory	sf = new Configuration().configure("com/test/pdf/hibernate.cfg.xml").buildSessionFactory();
	Session s= sf.openSession();

	Transaction tx= s.beginTransaction();
	
	File f= new File("C:\\Users\\Akshya kochale\\Desktop\\April jio 2020.pdf");
	
	FileInputStream fi= new FileInputStream(f);
	byte[] pfile= new byte[(int)f.length()];
	
	fi.read(pfile);
	empInfo e= new empInfo();
	
	e.setId(01);
	e.setPdf(pfile);
	
	s.save(e);
	tx.commit();
	s.close();
	sf.close();
	}

}
