package com.test1;

import java.util.List;

public class StudentDao {
	List<Student> studentlist;
	public List<Student> addStudent (List<Student> studentlist ){
		this.studentlist=studentlist;
		return studentlist;
	}
	public List<Student> listAll(){
		return studentlist;
	}
}
