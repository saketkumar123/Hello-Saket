package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				Customers cust = new Customers("nivas","nivas@jlc","Blore","4567",100000);
				session.save(cust);
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
