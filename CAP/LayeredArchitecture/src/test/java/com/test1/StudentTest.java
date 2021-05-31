package com.test1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List <Student> st=new ArrayList<Student>();
		while(true) {
			System.out.println("Enter the Id of the Student: ");
			int rollno =sc.nextInt();
			System.out.println("Enter the name of the Student: ");
			String name=sc.next();
			System.out.println("Specify the gender of the Student: ");
			String gender=sc.next();
			System.out.println("Enter the phone number of the Student: ");
			String phone=sc.next();
			System.out.println("Enter the mail id of the Student: ");
			String mail_id=sc.next();
			System.out.println("Do you want to enter the details: Yes / No");
			String option=sc.next();
			if(name!=null && rollno!=0 && gender!=null && phone!=null && mail_id!=null) {
				Student s=new Student(rollno,name,gender,phone,mail_id);
				st.add(s);
			}
			if(option.contains("No")) {
				break;
			}
		}
		StudentDao sdao=new StudentDao();
		sdao.addStudent(st);
		List<Student> stu=sdao.listAll();
		for(Student s:stu) {
			System.out.println("Id:"+s.getRollno()+"   "+"Student name:"+s.getName()+"   "+"Gender:"+s.getGender()+"   "+"Phone:"+s.getPhone()+"   "+"Email_id:"+s.getMail_id());
			System.out.println();
		}

	}

}
