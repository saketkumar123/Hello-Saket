package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab7B {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				
				Student stu = (Student)session.load(Student.class, 1);
				System.out.println(stu.toString());
				
				CurrentStudent cstu =(CurrentStudent) session.load(CurrentStudent.class, 2);
				System.out.println(cstu.toString());
				
				OldStudent ostu =(OldStudent) session.load(OldStudent.class, 3);
				System.out.println(ostu.toString());
				
				WeekdayStudent weestu =(WeekdayStudent) session.load(WeekdayStudent.class, 4);
				System.out.println(weestu.toString());
				
				WeekendStudent westu =(WeekendStudent) session.load(WeekendStudent.class, 5);
				System.out.println(westu.toString());
				
				//session.save(stu);
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
