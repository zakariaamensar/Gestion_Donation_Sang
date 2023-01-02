package main;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hopital extends Immeuble implements Serializable {
	
	public Set <Centre> Centres=new HashSet<Centre>();
	
	public Hopital(String nom, String localisation) {
		super(nom, localisation);
	}

	public Set<Centre> getCentres() {
		return Centres;
	}

	public void ajouterCentre(Centre centre) {
		Centres.add(centre);
	}
	public void supprimerCentre(String localisationCentre) {
		Iterator it=Centres.iterator();
		while(it.hasNext()) {
			Centre centre=(Centre)it.next();
			if(centre.getLocalisation()==localisationCentre) {
				Centres.remove(centre);
				break;
			}
		}

	}
	public Centre rechercherCentre(String localisationCentre) {
		Iterator it=Centres.iterator();
		while(it.hasNext()) {
			Centre centre=(Centre)it.next();
			if(centre.getLocalisation()==localisationCentre) {
				return centre;
			}
		}
		return null;
	}
}
