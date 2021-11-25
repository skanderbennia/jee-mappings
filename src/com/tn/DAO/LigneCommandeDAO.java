package com.tn.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.Hibernate.HibernateUtil;

import com.tn.beans.LigneCommande;

public class LigneCommandeDAO extends DAO<LigneCommande> {

	public LigneCommandeDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public boolean Create(LigneCommande lc) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(lc);
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

	@Override
	public boolean Update(int id, String data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LigneCommande Find(int id) {
		// TODO Auto-generated method stub
		return null;
	};


}
