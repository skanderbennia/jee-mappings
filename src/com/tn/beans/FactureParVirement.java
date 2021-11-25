package com.tn.beans;

public class FactureParVirement extends Facture {
	private int idFactureVirement;
	private String rib;
	
	

	public FactureParVirement(int idFactureVirement, String rib) {
		super();
		this.idFactureVirement = idFactureVirement;
		this.rib = rib;
	}
	
	
	public FactureParVirement() {
		super();
	}


	public int getIdFactureVirement() {
		return idFactureVirement;
	}
	public void setIdFactureVirement(int idFactureVirement) {
		this.idFactureVirement = idFactureVirement;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	
	
	
}
