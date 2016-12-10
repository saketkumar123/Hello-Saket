package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Customer cust = new Customer("saket", "kumar", "sk@gmail", "9031");
				session.save(cust);
				
				Request req1 = new Request("10/10/16", "hello1", "ok1");
				
				Request req2 = new Request("12/8/12", "hello2", "ok2");
				
				session.save(req1);
				req1.setCustomer(cust);
				session.save(req2);
				req2.setCustomer(cust);
				
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
