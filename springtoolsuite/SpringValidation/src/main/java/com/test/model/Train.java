package com.test.model;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
public class Train {
	@Size(min = 3, max = 50)
	@NotEmpty(message = "Name is required")
	private String name;
	
	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	
	//@Size(min = 3, max = 50)
	@NotEmpty(message = "From location is required")
	private String fromloc;
	
	//@Size(min = 3, max = 50)
	@NotEmpty(message = "To location is required")
	private String toloc;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dreg;
	
	@NotBlank
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDreg() {
		return dreg;
	}

	public void setDreg(Date dreg) {
		this.dreg = dreg;
	}

	public String getFromloc() {
		return fromloc;
	}

	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}

	public String getToloc() {
		return toloc;
	}

	public void setToloc(String toloc) {
		this.toloc = toloc;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
