package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				Customers cust1 = new Customers("ss","ss@jlc","Blore","4567",87000);
				session.save(cust1);
				Customers cust2 = new Customers("dd","dd@jlc","Mumb","9690",267000);
				session.save(cust2);
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
