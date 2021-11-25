package com.tn.beans;

public class FactureParCheque extends Facture {
	private int idFactureCheque;
	private int numero;
	
	
	
	
	
	public FactureParCheque(int idFactureCheque, int numero) {
		super();
		this.idFactureCheque = idFactureCheque;
		this.numero = numero;
	}
	
	
	
	
	public FactureParCheque() {
		super();
	}




	public int getIdFactureCheque() {
		return idFactureCheque;
	}
	public void setIdFactureCheque(int idFactureCheque) {
		this.idFactureCheque = idFactureCheque;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
