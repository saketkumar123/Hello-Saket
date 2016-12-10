package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ostudents")
@PrimaryKeyJoinColumn(name="sid")
public class OldStudent extends Student {  
	
	@Column(name="oscompany")
	private String ocompany;
	
	@Column(name="osemail")
	private String ocemail;
	
	@Column(name="osctc")
	private double octc;
	
	public OldStudent(){}

	public OldStudent(String sname, String city, String status, double totalfee,String ocompany, String ocemail, double octc) {
		super(sname, city,status, totalfee);
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}
	
	public OldStudent(int sid, String sname, String city, String status, double totalfee,String ocompany, String ocemail, double octc) {
		super(sid, sname, city, status, totalfee);
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}

	public String getOcompany() {
		return ocompany;
	}

	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}

	public String getOcemail() {
		return ocemail;
	}

	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}

	public double getOctc() {
		return octc;
	}

	public void setOctc(double octc) {
		this.octc = octc;
	}

	public String toString() {
		return  super.toString() +"," + ocompany + "\t" + ocemail + "\t"  + octc;
	}
	
	
}  
