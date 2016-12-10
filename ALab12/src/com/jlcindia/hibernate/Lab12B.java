package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab12B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Customer cust = (Customer)session.load(Customer.class, 1);
				System.out.println(cust.toString());
				
				Customer cust1 = (Customer)session.load(Customer.class, 2);
				System.out.println(cust1.toString());
				
				/*Address add = cust.getAddress();
				System.out.println(add.toString());
				
				Address add1 = cust1.getAddress();
				System.out.println(add1.toString());*/
				
				/*Address add1 = (Address)session.load(Address.class, 1);
				System.out.println(add1.toString());*/
				
				tx.commit();
				session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx != null){
				tx.rollback();
			}
		}

	}

}
