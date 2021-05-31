package com.test1;

import com.test1.StudentDao;
import com.test1.Student;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
public class FinalTest {
	StudentDao stdao;
	@Before
	public void setUp(){
		stdao=new StudentDao();
		List <Student> st=new ArrayList<Student>();
		Student s1=new Student(11,"ABC","F","9790088500","Abc@gmail.com");
		Student s2=new Student(22,"DEF","M","7685800788","dfg@gmail.com");
		st.add(s1);
		st.add(s2);
		stdao.addStudent(st);
	}
	@After
	public void setDown() {
		stdao=null;
	}
	@Test
	public void testaddStu() {
		List<Student> st=stdao.listAll();
		assertEquals(2, st.size());
	}
}
