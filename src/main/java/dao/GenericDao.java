package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtil;

public abstract class GenericDao <T> {
	
	private Class<T> clazz;

	public GenericDao(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}
	
	public void save(T c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		save(c, s);
		s.close();
	}
	
	public void save(T c, Session s) {
		s.beginTransaction();
		try {
			save(c, s, s.getTransaction());
			s.getTransaction().commit();
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			throw e;
		}
	}

	public void save(T c, Session s, Transaction t ) {
		s.saveOrUpdate(c);
	}

	public void delete(T c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		delete(c, s);
		s.close();
	}

	public void delete(T c, Session s, Transaction t ) {
		s.delete(c);
	}

	public void delete(T c, Session s) {
		s.beginTransaction();
		try {
			delete(c, s, s.getTransaction());
			s.getTransaction().commit();
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			throw e;
		}
	}
	
	public T findById(int id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		T c = findById(id, s);
		s.close();
		return c;
	}

	public T findById(int id, Session s) {
		return s.get(clazz, id);
	}
	
	public List<T> findAll() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<T> lc = findAll(s);
		s.close();
		return lc;
	}

	public List<T> findAll(Session s) {
		return s.createQuery("from " + clazz.getName()).list();
	}

}

