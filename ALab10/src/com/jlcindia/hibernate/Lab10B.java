package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				CurrentStudent cstu = new CurrentStudent("Hemant", "Blor", "Active", 32000, "9 am - 11 am", "MHA", 10000);
				cstu.setSid(1);
				session.save(cstu);
			
				
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
