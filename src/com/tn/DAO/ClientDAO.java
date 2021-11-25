package com.tn.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.Hibernate.HibernateUtil;
import com.tn.beans.Client;

public class ClientDAO extends DAO<Client> {

	public ClientDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean Create(Client ms) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(ms);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return false;
		}
	};

	public boolean Delete(int idMessage) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Client ms = (Client) session.get(Client.class, idMessage);
			if (ms != null) {
				session.delete(ms);
				System.out.println("client is deleted");
			}

			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return false;
		}
	}

	public boolean Update(int id, String name) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Client client = Find(id);
			client.setName(name);
			session.update(client);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return false;
		}
	}

	public Client Find(int id) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Client cl = null;
		try {
			tx = session.beginTransaction();
			cl = (Client) session.get(Client.class, id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return cl;
	}

}
