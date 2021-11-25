package com.tn.beans;

public class Adresse {
	private String rue;
	private int numero;
	private int codePostal;
	
	
	public Adresse(String rue, int numero, int codePostal) {
		super();
		this.rue = rue;
		this.numero = numero;
		this.codePostal = codePostal;
	}
	
	public Adresse() {
		super();
	}

	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
}
