package main;

public abstract class Personne {
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
