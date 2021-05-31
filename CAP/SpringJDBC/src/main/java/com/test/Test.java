package com.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpDao dao = (EmpDao)ctx.getBean("edao");
		EmpDao dao1 = (EmpDao)ctx.getBean("edao1");
		
		Employee e = new Employee();
		
		e.setName("Kate");
		e.setCmp("Accenture");
		e.setSalary("67890");
		
		dao.save(e);
		Employee e1 = new Employee();
		
		e1.setName("John");
		e1.setCmp("Capg");
		e1.setSalary("56400");
		
		dao1.save(e1);
		
		
		//dao.update(e);
		
		System.out.println("Done.");
	}

}
