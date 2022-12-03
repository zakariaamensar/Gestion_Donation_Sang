package main;

import java.util.Objects;

public class Infermier extends Personne {
	private int codeInfermier;
	private boolean chef_ou_non;
	
	public Infermier(String nom,String prenom,int codeInfermier,boolean chef_ou_non) {
		super(nom,prenom);
		this.codeInfermier=codeInfermier;
		this.chef_ou_non=chef_ou_non;
	}

	public int getCodeInfermier() {
		return codeInfermier;
	}

	public void setCodeInfermier(int codeInfermier) {
		this.codeInfermier = codeInfermier;
	}

	public boolean isChef_ou_non() {
		return chef_ou_non;
	}

	public void setChef_ou_non(boolean chef_ou_non) {
		this.chef_ou_non = chef_ou_non;
	}

	@Override
	public String toString() {
		return "l'infermier "+ getNom()+ " "+getPrenom() + " [codeInfermier=" + codeInfermier + ", chef_ou_non=" + chef_ou_non+"]" ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeInfermier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infermier other = (Infermier) obj;
		return codeInfermier == other.codeInfermier;
	}

	
}
