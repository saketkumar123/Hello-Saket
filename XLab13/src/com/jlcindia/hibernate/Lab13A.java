package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab13A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Customer cust = new Customer("saket", "kumar", "sk@gmail", "9031");
				session.save(cust);
				
				Address add = new Address("Udupi", "Blore", "KA");
				session.save(add);
				
				cust.setAddress(add);
				
				Customer cust1 = new Customer("Prem", "kumar", "prm@gmail", "9234");
				session.save(cust1);
				
				Address add1 = new Address("BTM", "Blore", "KA");
				session.save(add1);
				
				cust1.setAddress(add1);
				
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
