package main;

import java.io.Serializable;

public abstract class Personne implements Serializable{
	private String nom;
	private String prenom;
	
	public Personne(String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
}
