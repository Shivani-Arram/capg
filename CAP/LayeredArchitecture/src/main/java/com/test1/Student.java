package com.test1;

public class Student {
	private String name;
	private int rollno;
	private String phone;
	private String gender;
	private String mail_id;
	public Student(int rollno,String name,String gender,String phone,String mail_id) {
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
	public  String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
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
