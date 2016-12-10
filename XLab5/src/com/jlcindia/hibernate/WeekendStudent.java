package com.jlcindia.hibernate;

public class WeekendStudent extends CurrentStudent {  
	
	private String wcompany;
	private String wcemail;
	private double wctc;
	
	public WeekendStudent(){}

	public WeekendStudent(int sid, String sname, String city, String status, double totalfee, String timing,String branch, double feebal, String wcompany, String wcemail, double wctc) {
		super(sid, sname, city, status, totalfee, timing, branch, feebal);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}
	
	public WeekendStudent(String sname, String city, String status, double totalfee, String timing,String branch, double feebal, String wcompany, String wcemail, double wctc) {
		super(sname, city, status, totalfee, timing, branch, feebal);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}

	public String getWcompany() {
		return wcompany;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public String getWcemail() {
		return wcemail;
	}

	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}

	public double getWctc() {
		return wctc;
	}

	public void setWctc(double wctc) {
		this.wctc = wctc;
	}

	public String toString() {
		return  super.toString() +"," + wcompany + "\t" + wcemail + "\t" + wctc;
	}
	
}  
