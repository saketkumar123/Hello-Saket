package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab8A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Student stu = new Student("Saket kumar", "Gaya", "Active", 25000);
				session.save(stu);
				
				CurrentStudent cstu = new CurrentStudent("Hemant", "Blor", "Active", 32000, "9 am - 11 am", "MHA", 10000);
				session.save(cstu);
				
				OldStudent ostu = new OldStudent("Ranjeet", "Hyd", "Active", 18000, "tcs", "ranjeetkr@tcs.com", 500000);
				session.save(ostu);
				
				WeekdayStudent wdstu = new WeekdayStudent("Prem Nath", "Blore", "Inactive", 15000, "8 am - 12 am", "BTM", 6000, "B.tech", "67", 2016);
				session.save(wdstu);
				
				WeekendStudent westu = new WeekendStudent("Ramesh kumar", "Hyd", "Inactive", 22000, "4 p.m - 8 p.m", "BTM", 2000, "Capagemini", "rameshkr@capagemini.com", 240000);
				session.save(westu);
				
				tx.commit();
				session.close();
				System.out.println("Record Inserted");
		}catch(Exception e){
			e.printStackTrace();
			if(tx != null){
				tx.rollback();
			}
		}

	}

}
