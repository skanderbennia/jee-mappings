package com.tn.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.Hibernate.HibernateUtil;
import com.tn.beans.Fournisseur;

public class FournisseurDAO extends DAO<Fournisseur> {

	public FournisseurDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean Create(Fournisseur fs) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(fs);
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

	public boolean Delete(int idFournissseur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Fournisseur ms = (Fournisseur) session.get(Fournisseur.class, idFournissseur);
			if (ms != null) {
				session.delete(ms);
				System.out.println("fournisseur is deleted");
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

	public boolean Update(int id, String nomFournisseur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Fournisseur fournisseur = Find(id);
			fournisseur.setNomFournisseur(nomFournisseur);
			session.update(fournisseur);
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

	public Fournisseur Find(int id) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Fournisseur cl = null;
		try {
			tx = session.beginTransaction();
			cl = (Fournisseur) session.get(Fournisseur.class, id);
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

