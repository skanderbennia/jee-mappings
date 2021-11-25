package com.tn.Hibernate;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tn.DAO.ClientDAO;
import com.tn.DAO.CommandeDAO;
import com.tn.DAO.FournisseurDAO;
import com.tn.DAO.LigneCommandeDAO;
import com.tn.DAO.ProduitDAO;
import com.tn.beans.Adresse;
import com.tn.beans.Client;
import com.tn.beans.Commande;
import com.tn.beans.Fournisseur;
import com.tn.beans.LigneCommande;
import com.tn.beans.Produit;

public class Testhibernate {

	public static void main(String[] args) {

		SessionFactory sessionf = HibernateUtil.getSessionFactory();

		Transaction tx = null;
		CommandeDAO myObject = new CommandeDAO(sessionf);
		ClientDAO clientDao = new ClientDAO(sessionf);
		LigneCommandeDAO ligneCommandeDao = new LigneCommandeDAO(sessionf);
		FournisseurDAO fournisseurDao = new FournisseurDAO(sessionf);
		ProduitDAO produitDao = new ProduitDAO(sessionf);
		Client client = new Client("Mohamed Skander Bennia");
		Adresse ad1=new Adresse();
		ad1.setRue("Cité Mahrajene");
		ad1.setNumero(2);
		ad1.setCodePostal(2000); 
		client.setMonAdresse(ad1);
		clientDao.Create(client);
		//testing the commande ligne many - to - many problem
				Client clientt = (Client) clientDao.Find(1);
				Produit p11=new Produit();
				p11.setLibelle("monproduit");
				produitDao.Create(p11);
				Commande cm1=new Commande();
				cm1.setDate("2008/01/01");
				myObject.Create(cm1);
				client.getCommandes().add(cm1);
				clientDao.Create(clientt);
				LigneCommande lm1=new LigneCommande(10,cm1, p11);
				ligneCommandeDao.Create(lm1);
		Scanner myObj = new Scanner(System.in);
		System.out.println("Type 1 to create, Type 2 to update");
		

		String opt = myObj.nextLine();

		switch (opt) {

		case "1":
			System.out.println("Type your message text");
			String date = myObj.nextLine();
			Commande commande1 = new Commande(date,client);
			myObject.Create(commande1);
			System.out.println("Message created with success");
			break;

		case "2":
			System.out.println("Type your updat message text");
			String date_update = myObj.nextLine();
			Commande commande_updated = new Commande(date_update,client);
			myObject.Update(1, "updated");
			System.out.println("Message updated with success");

			break;
		case "3":
			Produit p1=new Produit();
			p1.setLibelle("pr10");
			Fournisseur f1=new Fournisseur();
			f1.setNomFournisseur("fr10");
			p1.getFournisseurs().add(f1);
			f1.getProduits().add(p1);
			produitDao.Create(p1);
			

			break;
		default:
			System.out.println("Unvalid choice");
		}

		Commande commande1 = new Commande("Bonjour",client);
		Commande commande2 = new Commande("Hello world",client);

		myObject.Create(commande1);
		myObject.Create(commande2);
		
		
		
		System.out.println(commande1.getIdCommande());
		//myObject.Update(1, "news wooo");

	}

}