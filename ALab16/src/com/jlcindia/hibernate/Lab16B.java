package com.jlcindia.hibernate;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab16B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Customer cust = (Customer)session.load(Customer.class, 1);
				System.out.println(cust);
				
				Collection<Request> reqcol = cust.getRequest();
				for(Request request : reqcol){
					System.out.println(request);
				}
				
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
