package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ccstudents")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Student {  
	
	@Id
	@Column(name="sid", length=5)
	private int sid; 
	
	@Column(name="sname", length=20)
	private String sname;
	
	@Column(name="city", length=40)
	private String city;
	
	@Column(name="status", length=10)
	private String status;
	
	@Column(name="totalfee", length=8)
	private double totalfee;
	
	public Student(){}
	
	public Student(int sid, String sname, String city, String status, double totalfee) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
	}

	public Student(String sname, String city, String status, double totalfee) {
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}

	public String toString() {
		return  sid + "\t" + sname + "\t" + city +  "\t"  + status + "\t" + totalfee ;
	}
	
	

	
}  
