package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e= (Employee)ctx.getBean("emp");
	e.disp();
	}
}
