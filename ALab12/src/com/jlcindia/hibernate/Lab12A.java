package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab12A {

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
				
				Customer cust1 = new Customer("Hemant", "pd", "hpd@gmail", "7867");
				session.save(cust1);
				
				Address add1 = new Address("mha", "hyd", "AP");
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
