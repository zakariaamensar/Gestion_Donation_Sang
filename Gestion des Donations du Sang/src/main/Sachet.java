package main;

import java.io.Serializable;
import java.time.LocalDate;

import Enumerates.EtatSachet; 

public class Sachet implements Serializable{
	private int codeSachet;
	private Donneur donneur;
	private Infermier infermier;
	public LocalDate DateDePrise;
	private TypeSang typeSang;
	private EtatSachet etatSachet;
	
	
	
	public Sachet(int codeSachet, Donneur donneur, Infermier infermier, TypeSang typeSang) {
		this.codeSachet = codeSachet;
		this.donneur = donneur;
		this.infermier = infermier;
		DateDePrise = LocalDate.now();
		this.typeSang = typeSang;
	}
	public int getCodeSachet() {
		return codeSachet;
	}
	public void setCodeSachet(int codeSachet) {
		this.codeSachet = codeSachet;
	}
	public Donneur getDonneur() {
		return donneur;
	}
	public void setDonneur(Donneur donneur) {
		this.donneur = donneur;
	}
	public Infermier getInfermier() {
		return infermier;
	}
	public void setInfermier(Infermier infermier) {
		this.infermier = infermier;
	}
	public TypeSang getTypeSang() {
		return typeSang;
	}
	public void setTypeSang(TypeSang typeSang) {
		this.typeSang = typeSang;
		}
	
	
	public EtatSachet getEtatSachet() {
		return etatSachet;
	}
	public void setEtatSachet(EtatSachet etatSachet) {
		this.etatSachet = etatSachet;
	}
	
	
	@Override
	public String toString() {
		return "Sachet [codeSachet=" + codeSachet + ", donneur=" + donneur + ", infermier=" + infermier
				+ ", DateDePrise=" + DateDePrise + ", typeSang=" + typeSang + "]";
	}
	
	
	

}
