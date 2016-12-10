package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mycustomer")
public class Customers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;  
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="city")
	private String city; 
	
	@Column(name="phone")
	private String myphone;
	
	@Column(name="bal")
	private double mybal;
	
	public Customers() {
		System.out.println("I am Customers - D.C()");
	}
	public Customers(String cname, String email, String city, String myphone, double mybal) {
		System.out.println("I am Customers - 5 args cons()");
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.myphone = myphone;
		this.mybal = mybal;
	}
	public Customers(int cid,String cname, String email, String city, String myphone, double mybal) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.myphone = myphone;
		this.mybal = mybal;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMyphone() {
		return myphone;
	}
	public void setMyphone(String myphone) {
		this.myphone = myphone;
	}
	public double getMybal() {
		return mybal;
	}
	public void setMybal(double mybal) {
		this.mybal = mybal;
	}
	
	
}  
