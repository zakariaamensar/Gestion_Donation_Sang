package main;

import Enumerates.*;

public class TypeSang {
	private Types typeSang;
	private int nbrSachetsDispo;
	
	
	public TypeSang(Types typeSang) {
		this.typeSang = typeSang;
	}
	
	
	public Types getTypeSang() {
		return typeSang;
	}
	public void setTypeSang(Types typeSang) {
		this.typeSang = typeSang;
	}
	public int getNbrSachetsDispo() {
		return nbrSachetsDispo;
	}
	public void setNbrSachetsDispo(int nbrSachetsDispo) {
		this.nbrSachetsDispo = nbrSachetsDispo;
	} 
	
	public NiveauBesoin niveaBesoin() {
		if(this.getNbrSachetsDispo()<100)  return NiveauBesoin.DANGEUREUX;
		if(this.getNbrSachetsDispo()<500 &&this.getNbrSachetsDispo()>=100 )  return NiveauBesoin.FAIBLE;
		if(this.getNbrSachetsDispo()<1000 &&this.getNbrSachetsDispo()>=500 )  return NiveauBesoin.MOYEN;
		if(this.getNbrSachetsDispo()>=1000 )  return NiveauBesoin.SUFFISANT;
		return null;
	
	
	}
	
}
