package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="myaddress1")
public class Address  {  
	
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int aid;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@OneToOne(mappedBy="address")
	private Customer customer;
	
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
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString() {
		return  aid + "\t" + street + "\t"  + city + "\t" + state;
	}
	
	
}  
