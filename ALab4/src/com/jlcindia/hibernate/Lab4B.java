package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				Student stu = (Student)session.load(Student.class, 1);
				System.out.println(stu.toString());
				Student stu1 = (Student)session.load(Student.class,2);
				System.out.println(stu1.toString());
				Student stu2 = (Student)session.load(Student.class, 3);
				System.out.println(stu2.toString());
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
