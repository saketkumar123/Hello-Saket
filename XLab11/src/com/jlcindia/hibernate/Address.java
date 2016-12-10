package com.jlcindia.hibernate;

public class Address  {  
	int aid;
	private String street;
	private String city;
	private String state;
	
	public Address(){}

	public Address( String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address(int aid, String street, String city, String state) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		return  aid + "\t" + street + "\t"  + city + "\t" + state;
	}
	
	
}  
