package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				Student stu = (Student)session.load(Student.class, 1);
				System.out.println(stu.toString());
				session.save(stu);
				session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx != null){
				tx.rollback();
			}
		}

	}

}
