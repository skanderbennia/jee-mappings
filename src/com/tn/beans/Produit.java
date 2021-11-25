package com.tn.beans;

import java.util.HashSet;
import java.util.Set;

public class Produit {
	private int idProduit;
	private String libelle;
	private Set<Fournisseur> fournisseurs =new HashSet<Fournisseur>();
	private Set<LigneCommande> lignes=new HashSet<LigneCommande>();
	

	
	
	public Produit(int idProduit, String libelle, Set<Fournisseur> fournisseurs, Set<LigneCommande> lignes) {
		super();
		this.idProduit = idProduit;
		this.libelle = libelle;
		this.fournisseurs = fournisseurs;
		this.lignes = lignes;
	}

	public Produit() {
		super();
	}

	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}
	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public Set<LigneCommande> getLignes() {
		return lignes;
	}

	public void setLignes(Set<LigneCommande> lignes) {
		this.lignes = lignes;
	}

	
}
