package com.test;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Hex")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Train_name")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tname;
	@Column(name="Train_sloc")
	private String tsloc;
	@Column(name="Train_dloc")
	private String tdloc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsloc() {
		return tsloc;
	}
	public void setTsloc(String tsloc) {
		this.tsloc = tsloc;
	}
	public String getTdloc() {
		return tdloc;
	}
	public void setTdloc(String tdloc) {
		this.tdloc = tdloc;
	}
	
}


