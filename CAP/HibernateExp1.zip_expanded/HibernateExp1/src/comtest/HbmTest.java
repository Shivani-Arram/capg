package comtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HbmTest {
	
	public static void main(String[] args) {
		//creating configuration object.
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates data of the 
		
		//creating session factory object  second level cache
		SessionFactory factory = cfg.buildSessionFactory();
		
		// creating session object first level cache
		Session session = factory.openSession();
		
		//creating transaction object
		Transaction t= session.beginTransaction();
		
		Employee e = new Employee();
		e.setId(208);
		e.setEmpname("alekya");
		e.setEmpsalary(74848);
		
		session.persist(e);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
		
		System.out.println("Successfully Saved Data");
	}

}
