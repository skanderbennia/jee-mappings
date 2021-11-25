package com.tn.beans;

import java.util.ArrayList;

public class Client {

	private String name;
	private ArrayList<Commande> commandes;
	private int idClient;
	private Adresse monAdresse;

	public Client() {
		super();
	}
	

	
	public Client(String name, ArrayList<Commande> commandes, int idClient, Adresse monAdresse) {
		super();
		this.name = name;
		this.commandes = commandes;
		this.idClient = idClient;
		this.monAdresse = monAdresse;
	}
	




	public Adresse getMonAdresse() {
		return monAdresse;
	}



	public void setMonAdresse(Adresse monAdresse) {
		this.monAdresse = monAdresse;
	}



	public Client(String name) {
		this.name = name;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}
	

}
