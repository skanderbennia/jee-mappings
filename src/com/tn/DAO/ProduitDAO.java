package com.tn.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.Hibernate.HibernateUtil;
import com.tn.beans.Produit;

public class ProduitDAO extends DAO<Produit> {

	public ProduitDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean Create(Produit pd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(pd);
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

	public boolean Delete(int idProduit) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Produit ms = (Produit) session.get(Produit.class, idProduit);
			if (ms != null) {
				session.delete(ms);
				System.out.println("Produit is deleted");
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

	public boolean Update(int id, String libelle) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Produit produit = Find(id);
			produit.setLibelle(libelle);
			session.update(produit);
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

	public Produit Find(int id) {
		Transaction tx = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Produit pd = null;
		try {
			tx = session.beginTransaction();
			pd = (Produit) session.get(Produit.class, id);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		return pd;
	}

}


