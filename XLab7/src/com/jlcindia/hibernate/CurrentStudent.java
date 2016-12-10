package com.jlcindia.hibernate;

public class CurrentStudent extends Student {  
	
	private String timing;
	private String branch;
	private double feebal;
	
	public CurrentStudent(){}

	public CurrentStudent(int sid, String sname, String city, String status, double totalfee,String timing, String branch, double feebal) {
		super(sid, sname, city, status, totalfee);
		this.timing = timing;
		this.branch = branch;
		this.feebal = feebal;
	}
	
	public CurrentStudent( String sname, String city, String status, double totalfee,String timing, String branch, double feebal) {
		super(sname, city, status, totalfee);
		this.timing = timing;
		this.branch = branch;
		this.feebal = feebal;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String toString() {
		return super.toString() +"," + timing + "\t" + branch + "\t" + feebal ;
	}
	
	
}  
