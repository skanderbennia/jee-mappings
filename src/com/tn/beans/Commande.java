package com.tn.beans;

import java.util.HashSet;
import java.util.Set;

public class Commande {

	private int idCommande;
	private String date;
	private Client client;
	private Facture facture;
	private Set<LigneCommande> lignes=new HashSet<LigneCommande>();
	

	public Commande(String date, Client client) {
		super();
		this.date = date;
		this.client = client;
	}
	
	
	
	public Commande(int idCommande, String date, Client client, Facture facture, Set<LigneCommande> lignes) {
		super();
		this.idCommande = idCommande;
		this.date = date;
		this.client = client;
		this.facture = facture;
		this.lignes = lignes;
	}
	


	public Commande() {
		super();
	}



	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}



	public Set<LigneCommande> getLignes() {
		return lignes;
	}



	public void setLignes(Set<LigneCommande> lignes) {
		this.lignes = lignes;
	}
	

}	