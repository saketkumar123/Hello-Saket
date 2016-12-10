package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="myrequest")
public class Request  {  
	
	@Id
	@Column(name="reqid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer reqid;
	
	@Column(name="requestDate")
	private String reqDate;
	
	@Column(name="Discription")
	private String discription;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	private Customer customer;
	
	public Request(){}

	public Request( String reqDate, String discription, String status) {
		this.reqDate = reqDate;
		this.discription = discription;
		this.status = status;
	}
	
	public Request(Integer reqid, String reqDate, String discription, String status) {
		this.reqid = reqid;
		this.reqDate = reqDate;
		this.discription = discription;
		this.status = status;
	}

	public Integer getReqid() {
		return reqid;
	}

	public void setReqid(Integer reqid) {
		this.reqid = reqid;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString() {
		return reqid + "\t" + reqDate + "\t"  + discription + "\t" + status;
	}
}  
