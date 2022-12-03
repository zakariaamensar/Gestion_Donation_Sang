package main;

import java.util.Objects;
import java.util.regex.Pattern;

import Exceptions.invalidCin;
import Exceptions.invalidNum;

public class Donneur extends Personne {
	private String cin;
	private int num_tele;
	
	public Donneur(String nom, String prenom, String cin, int num_tele) {
		super(nom, prenom);
		try {
		this.cin = verifierCin(cin);
		this.num_tele = verifierNum(num_tele);}
		catch(invalidCin e) {
			System.out.println(e.getMessage());
		}
		catch(invalidNum e) {
			System.out.println(e.getMessage());
		}
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getNum_tele() {
		return num_tele;
	}

	public void setNum_tele(int num_tele) {
		this.num_tele = num_tele;
	}

	@Override
	public String toString() {
		return "le donneur "+ getNom()+ " "+getPrenom()+ "[CIN=" + cin + ", numero telephone=" + num_tele + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Donneur other = (Donneur) obj;
		return Objects.equals(cin, other.cin);
	}
	
	private String verifierCin(String cin) throws invalidCin {
		if(cin.length()!=8) {
			throw new invalidCin();
		}
		if(Pattern.matches("[a-zA-Z]{2}\\d{6}", cin)) {
			throw new invalidCin();
		}
		return cin;
	}
	
	
	private int verifierNum(int num_tele) throws invalidNum {
		String num = ""+ num_tele;
		if(num.length()!=10) {
			throw new invalidNum();
		}
		return num_tele;
	}
	
	
	
}
