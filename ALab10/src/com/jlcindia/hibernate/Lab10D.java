package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10D {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				
				WeekdayStudent wdstu = new WeekdayStudent("Prem Nath", "Blore", "Inactive", 15000, "8 am - 12 am", "BTM", 6000, "B.tech", "67", 2016);
				wdstu.setSid(1);
				session.save(wdstu);
				
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
