package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				Customers cust = (Customers)session.load(Customers.class, 2);
				System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getCity()+"\t"+cust.getMyphone()+"\t"+cust.getMybal());
				session.save(cust);
				session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx != null){
				tx.rollback();
			}
		}

	}

}
