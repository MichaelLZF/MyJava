package org.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.vo.User;

public class HibernateTest {

	public Configuration cfg;
	public SessionFactory sessionFactory;
	public Session session;

	public static void main(String[] args) {
		HibernateTest ht = new HibernateTest();
		ht.getCurrentSession();

		ht.saveUser();
		System.out.println("add======");
		ht.queryUser();

		ht.updateUser();
		System.out.println("update====");
		ht.queryUser();

		ht.deleteUser();
		System.out.println("delete=====");
		ht.queryUser();

		ht.closeSession();
	}

	public void getCurrentSession() {
		cfg = new Configuration();
		sessionFactory = cfg.configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public void closeSession() {
		if (session != null) {
			session.close();
		}
	}

	public void saveUser() {
		Transaction t1 = session.beginTransaction();
		User user = new User();
		user.setId(1);
		user.setUsername("felix");
		user.setPassword("123456");
		session.save(user);
		t1.commit();
	}

	public void updateUser() {
		Transaction t2 = session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		user.setUsername("jim");
		session.update(user);
		t2.commit();
	}

	public void queryUser() {
		try {
			Query query = session.createQuery("from User");
			List list = query.list();
			for (int i = 0; i < list.size(); i++) {
				User user = (User) list.get(i);
				System.out.println(user.getUsername());
				System.out.println(user.getPassword());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser() {
		Transaction t3 = session.beginTransaction();
		User user = (User) session.get(User.class, 1);
		session.delete(user);
		t3.commit();
	}
}
