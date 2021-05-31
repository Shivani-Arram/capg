package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test1 {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("applicationContext.xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		Employee e= (Employee)bn.getBean("emp");
		e.disp();
		}
}


