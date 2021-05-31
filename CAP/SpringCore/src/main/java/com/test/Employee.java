package com.test;

public class Employee {
	private String name;
	private String cmp;
	private String Loc;
	public Employee() {
		
	}
	public Employee(String name,String cmp,String Loc) {
		this.name=name;
		this.cmp=cmp;
		this.Loc=Loc;
	}
	public void disp() {
		System.out.println("Name: "+name+" Company: "+cmp+" Location: "+Loc);
	}
}
