package com.jlcindia.hibernate;

import java.util.Set;

public class Customer {  
	
	private int cid;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private Set<Request> request;
	
	public Customer(){}
	
	public Customer(int cid, String fname, String lname, String email, String phone) {
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public Customer(String fname, String lname, String email, String phone) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}
	
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Request> getRequest() {
		return request;
	}

	public void setRequest(Set<Request> request) {
		this.request = request;
	}

	public String toString() {
		return  cid + "\t" + fname +  "\t"  + lname +  "\t"  + email +  "\t" + phone;
	}
}  
