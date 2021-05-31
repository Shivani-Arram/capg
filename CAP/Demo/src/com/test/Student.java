package com.test;

public class Student {
	private String name;
	private int rollno;
	private long phone;
	private String gender;
	private String mail_id;
	public Student(int rollno,String name,String gender,long phone,String mail_id) {
		this.name=name;
		this.rollno=rollno;
		this.gender=gender;
		this.phone=phone;
		this.mail_id=mail_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public  long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
