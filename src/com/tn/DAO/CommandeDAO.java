package com.tn.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.Hibernate.HibernateUtil;
import com.tn.beans.Commande;

public class CommandeDAO extends DAO<Commande> {

	public CommandeDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean Create(Commande cd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(cd);
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

	public boolean Delete(int idCommande) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Commande cd = (Commande) session.get(Commande.class, idCommande);
			if (cd != null) {
				session.delete(cd);
				System.out.println("message is deleted");
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

	public boolean Update(int id, String new_date) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Commande commande = Find(id);
			commande.setDate(new_date);
			session.update(commande);
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

	public Commande Find(int idCommande) {
		System.out.println(idCommande);
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Commande cd = null;
		try {
			tx = session.beginTransaction();
			cd = (Commande) session.get(Commande.class, new Integer(idCommande));
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return cd;
	}

}