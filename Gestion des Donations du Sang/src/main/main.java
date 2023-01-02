package main;

import java.io.*;

import Enumerates.Types;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INITIALIZATION

		Hopital hopital = new Hopital("Cheikh zayd","Irfan rabat");
		
		Centre centre1= new Centre("centre1","Agdal");
		Centre centre2= new Centre("centre2","qamra");
		
		Infermier infermier1=new Infermier("zakaria","amensar",1,false);
		Infermier infermier2=new Infermier("safwane","guilmi",2,true);
		Infermier infermier3=new Infermier("rida","tahir",3,false);
		Infermier infermier4=new Infermier("younes","amensar",4,true);
		

		Donneur donneur1=new Donneur("oussama","haroui","JE123456",1234567893);
		Donneur donneur2=new Donneur("salah","ouzakri","JE318339",1876543213);
		Donneur donneur3=new Donneur("said","alhyan","JE318921",1516543213);
		Donneur donneur4=new Donneur("salah","ouzakri","JE318339",1666432136);
		
		TypeSang A=new TypeSang(Types.A);
		TypeSang B=new TypeSang(Types.B);
		TypeSang AB=new TypeSang(Types.AB);
		TypeSang O=new TypeSang(Types.O);

		

		
		Sachet sachet1= new Sachet(1,donneur1,infermier1,A);
		Sachet sachet2= new Sachet(2,donneur2,infermier2,B);
		Sachet sachet3= new Sachet(3,donneur3,infermier3,AB);
		Sachet sachet4= new Sachet(4,donneur4,infermier4,O);
		
		//TESTES DES FONCTIONALITES

		centre1.ajouterInfermier(infermier1);
		centre1.ajouterInfermier(infermier2);
		centre2.ajouterInfermier(infermier3);
		centre2.ajouterInfermier(infermier4);
		
		centre1.ajouterSachet(sachet1);
		centre1.ajouterSachet(sachet2);
		centre2.ajouterSachet(sachet3);
		centre2.ajouterSachet(sachet4);

		hopital.ajouterCentre(centre1);
		hopital.ajouterCentre(centre2);
		
		System.out.println(centre1.getInfermiers());
		System.out.println(centre2.getSachets());
		
		centre1.sachetExiste(sachet4);
		centre2.supprimerInfermier(4);
		
		System.out.println(centre2.getInfermiers());
		
		
		//Serialization
		try {
			FileOutputStream fileOut = new FileOutputStream("Donneur.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(donneur1);
			out.close();
			fileOut.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();;
		}
		
		
		try {
			FileInputStream fileIn = new FileInputStream("Donneur.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Donneur donneur_ser = (Donneur) in.readObject();
			in.close();
			fileIn.close();
			System.out.println(donneur_ser.equals(donneur1));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//File Writer
		String text = "";

		for(Infermier inf : centre1.getInfermiers()) {
			text+=inf.toString()+"\n";
			
		}

		
		try {
			FileWriter out = new FileWriter("InfermiersCentre1.txt");
			out.write(text,0,text.length());
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		////////////////READER/////////////////////
		try {
			FileReader in = new FileReader("InfermiersCentre1.txt");
			int s;
			String fulltext="";
			while((s=in.read())!=-1) {
				
				fulltext+=(char)(s);
				
			}
			System.out.println(fulltext);
			in.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

		

		
	}

}
