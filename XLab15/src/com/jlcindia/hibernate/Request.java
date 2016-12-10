package com.jlcindia.hibernate;

public class Request  {  
	private Integer reqid;
	private String reqDate;
	private String discription;
	private String status;
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
