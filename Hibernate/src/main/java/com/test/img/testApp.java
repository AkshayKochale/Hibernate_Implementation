package com.test.img;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class testApp {

	public static void main(String[] args) throws Exception {
		
		
		SessionFactory sf = new Configuration().configure("com/test/img/hibernate.cfg.xml").buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx= s.beginTransaction();
//		
//		img i1= new img();
//		i1.setId(01);
		
		File f= new File("C:\\Users\\Akshya kochale\\Desktop\\testImg\\p1.jpg");
		byte[] bfile= new byte[(int) f.length()];
		
		
//		FileInputStream fi= new  FileInputStream(f);
//		fi.read(bfile);
//		fi.close();
//		
		FileOutputStream fo= new FileOutputStream(f);
		
		fo.write(bfile);
//		i1.setImage(bfile);
//	
//		s.save(i1);
		 
//		img img = s.get(img.class, 1);
		 
//		System.out.println(img);
		
		tx.commit();
		s.close();
		sf.close();
	}
}
