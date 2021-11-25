package com.tn.beans;

import java.util.HashSet;
import java.util.Set;

public class Fournisseur {
	private int idFournisseur;
	private String nomFournisseur;
	private Set<Produit> produits =new HashSet<Produit>();

	
	public Fournisseur() {
		super();
	}
	
	public Fournisseur(int idFournisseur, String nomFournisseur, Set<Produit> produits ) {
		super();
		this.idFournisseur = idFournisseur;
		this.nomFournisseur = nomFournisseur;
		
	}


	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	

}