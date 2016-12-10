package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10E {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				WeekendStudent westu = new WeekendStudent("Ramesh kumar", "Hyd", "Inactive", 22000, "4 p.m - 8 p.m", "BTM", 2000, "Capagemini", "rameshkr@capagemini.com", 240000);
				westu.setSid(1);
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
