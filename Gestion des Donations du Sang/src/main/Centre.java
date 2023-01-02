package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Enumerates.EtatSachet;

public class Centre extends Immeuble implements Serializable{
	private List<Infermier> Infermiers=new ArrayList<Infermier>();
	private List<Sachet> Sachets=new ArrayList<Sachet>();
	
	public Centre(String nom, String localisation) {
		super(nom, localisation);
	}

	

	public List<Infermier> getInfermiers() {
		return Infermiers;
	}

	public List<Sachet> getSachets() {
		return Sachets;
	}


	
	public boolean infermierExiste(Infermier infermier) {
		for(Infermier inferm:Infermiers) {
			if(inferm.equals(infermier))return true;
		}
		return false;	
		
	}
	public boolean sachetExiste(Sachet sachet) {
		for(Sachet sach:Sachets) {
			if(sach.equals(sachet))return true;
		}
		return false;	
	}
	
	public Infermier rechercherInfermier(int codeInfermier) {
		for(int i=0; i<Infermiers.size();i++) {
			if(Infermiers.get(i).getCodeInfermier()==codeInfermier) {
				return Infermiers.get(i);
			}
		}
		return null;

	}
	public Sachet rechercherSachet(int codeSachet) {
		for(int i=0;i<Sachets.size();i++) {
			if(Sachets.get(i).getCodeSachet()==codeSachet) {
				return Sachets.get(i);
			}
		}
		return null;

	}
	
	public void ajouterInfermier(Infermier infermier) {
		if(!infermierExiste(infermier)) {
			Infermiers.add(infermier);
		}
	}
	public void ajouterSachet(Sachet sachet) {
		if(!sachetExiste(sachet)) {
			Sachets.add(sachet);
			sachet.getTypeSang().setNbrSachetsDispo(sachet.getTypeSang().getNbrSachetsDispo()+1);
			sachet.setEtatSachet(EtatSachet.PASENCOURS);
		}
	}
	
	public void supprimerInfermier(int codeInfermier) {
		for(int i=0; i<Infermiers.size();i++) {
			if(Infermiers.get(i).getCodeInfermier()==codeInfermier) {
				Infermiers.remove(i);
				break;
			}
		}

	}
	public void supprimerSachet(int codeSachet) {
		for(int i=0;i<Sachets.size();i++) {
			if(Sachets.get(i).getCodeSachet()==codeSachet) {
				Sachets.remove(i);
				Sachets.get(i).getTypeSang().setNbrSachetsDispo(Sachets.get(i).getTypeSang().getNbrSachetsDispo()-1);
				Sachets.get(i).setEtatSachet(EtatSachet.UTILISE);

			}
		}
	}
}
