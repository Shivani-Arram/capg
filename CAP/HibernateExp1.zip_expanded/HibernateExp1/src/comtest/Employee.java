package comtest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee2")
public class Employee {
	
	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "EMP_NAME")
	private String empname;
	@Column(name = "EMP_SALARY")
	private double empsalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	} 
	
}
