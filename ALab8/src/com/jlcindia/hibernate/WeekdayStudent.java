package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="WDSTU")
public class WeekdayStudent extends CurrentStudent{  
	
	@Column(length=15)
	private String qualification;
	
	@Column(length=12)
	private String percentage;
	@Column(length=5)
	private int yop;
	
	public WeekdayStudent(){}

	public WeekdayStudent(int sid, String sname, String city, String status, double totalfee,String timing, String branch, double feebal, String qualification, String percentage, int yop) {
		super(sid, sname, city, status, totalfee, timing, branch, feebal);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	
	public WeekdayStudent(String sname, String city, String status, double totalfee,String timing, String branch, double feebal, String qualification, String percentage, int yop) {
		super(sname, city, status, totalfee, timing, branch, feebal);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String toString() {
		return  super.toString() +"," + qualification + "\t" + percentage +"\t" + yop;
	}
	
}  
