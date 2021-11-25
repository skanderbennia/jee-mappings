package com.tn.beans;

import java.io.Serializable;

public class LigneCommande {
	public static class Id implements Serializable{
		private Integer idCommande;
		private Integer idProduit;
		public Id(){}
		public Id(Integer idCommande, Integer idProduit) {
		super();
		this.idCommande = idCommande;
		this.idProduit = idProduit;
		}
		}
		private Id id=new Id();
		
		private float quantite;
		private Commande commande;
		private Produit produit;
		public Id getId() {return id;}
		public void setId(Id id) {this.id = id;}
		public float getQuantite() {return quantite;}
		public void setQuantite(float quantite) {this.quantite = quantite;}
		public Commande getCommande() {return commande;}
		public void setCommande(Commande commande) {this.commande = commande;}
		public Produit getProduit() { return produit;}
		public void setProduit(Produit produit) {this.produit = produit;}
		public LigneCommande(){}
		public LigneCommande(float quantite, Commande commande, Produit produit){
		this.quantite = quantite;
		this.commande = commande;
		this.produit = produit;
		this.id.idCommande=commande.getIdCommande();
		this.id.idProduit=produit.getIdProduit();
		produit.getLignes().add(this);
		commande.getLignes().add(this);
		}
}
