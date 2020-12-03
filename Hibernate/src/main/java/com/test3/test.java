package com.test3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("com/test3/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();

		Session s = sf.openSession();


		engine e= new engine();
		e.setId(02);
		e.setName("engine01");
		e.setType("car");
		car c= new car();
		
		c.setId(01);
		c.setEid(e.getId());
		c.setEname(e.getName());
		e.setC(c);;
		
		
		Transaction tx=s.beginTransaction();
		s.save(c);
		s.save(e);
		tx.commit();
		s.close();
		sf.close();
	}

}
