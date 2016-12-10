package com.jlcindia.hibernate;

public class Customers {  
	private int cid;  
	private String cname;
	private String email;
	private String city;  
	private String myphone;
	private double mybal;
	public Customers() {	}
	public Customers(String cname, String email, String city, String myphone, double mybal) {
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
