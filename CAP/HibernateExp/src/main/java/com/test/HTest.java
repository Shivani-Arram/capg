package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates data of the 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t= session.beginTransaction();
		Train tr=new Train();
		tr.setTname("ChennaiExpress");
		tr.setTsloc("Delhi");
		tr.setTdloc("Goa");
		session.persist(tr);
		t.commit();
		session.close();
		System.out.println("Done");
	}

}
