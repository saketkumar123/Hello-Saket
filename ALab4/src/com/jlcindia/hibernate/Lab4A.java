package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4A {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		try{
				SessionFactory sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				tx = session.beginTransaction();
				String[] cous1 = {"Java8","JDBC","Servlets","Jsp"};
				
				List<String> ems1 = new ArrayList<String>();
				ems1.add("aa@jlc");
				ems1.add("bb@cc");
				ems1.add("cc@jlc.com");
				
				List<Integer> marks1 = new ArrayList<Integer>();
				marks1.add(new Integer(90));
				marks1.add(new Integer(43));
				marks1.add(new Integer(87));
				
				Set<Long> ph1 = new HashSet<Long>();
				ph1.add(new Long(9999));
				ph1.add(new Long(4444));
				ph1.add(new Long(2121));
				
				Map<String, Long> refs1 = new HashMap<>();
				refs1.put("aa", new Long(9087));
				refs1.put("bb", new Long(9876));
				refs1.put("cc", new Long(7654));
				
				String[] cous2 = {"Struts1","struts2","Hibernate","spring"};
				
				List<String> ems2 = new ArrayList<String>();
				ems2.add("aa@jlc");
				ems2.add("bb@cc");
				ems2.add("cc@jlc.com");
				
				List<Integer> marks2 = new ArrayList<Integer>();
				marks2.add(new Integer(30));
				marks2.add(new Integer(67));
				marks2.add(new Integer(78));
				
				Set<Long> ph2 = new HashSet<Long>();
				ph2.add(new Long(1111));
				ph2.add(new Long(5555));
				ph2.add(new Long(8888));
				
				Map<String, Long> refs2 = new HashMap<String, Long>();
				refs2.put("aa", new Long(6666));
				refs2.put("sd", new Long(3333));
				refs2.put("sri", new Long(2222));
				
				Student stu1 = new Student("vas", "12-10", "B.tech", cous1,ems1,marks1,ph1,refs1);
				session.save(stu1);
				Student stu2 = new Student("dd", "12-1-92", "B.tech", cous2,ems2,marks2,ph2,refs2);
				session.save(stu2);
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
