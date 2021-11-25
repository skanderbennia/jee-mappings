package com.tn.beans;

public class Facture {
	private int idFacture;
	private float montant;
	
		public Facture() {
		super();
	}
	public Facture(int idFacture, float montant) {
		super();
		this.idFacture = idFacture;
		this.montant = montant;
	}
	public int getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
}
