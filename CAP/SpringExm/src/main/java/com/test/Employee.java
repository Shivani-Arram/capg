package com.test;

public class Employee {
	private String name;
	private String cmp;
	private String Loc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	public void disp() {
		System.out.println("Name: "+name+" Company: "+cmp+" Location: "+Loc);
	}
}
