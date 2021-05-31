package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.test.CollectionEx;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("apllicationContext.xml");
        
		CollectionEx  c = ctx.getBean("coll", CollectionEx.class);
		CollectionEx  c2 = ctx.getBean("colle", CollectionEx.class);
		
		c.disp();
		c2.disp();
	}

}
