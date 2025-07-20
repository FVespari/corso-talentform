package com.oop.classes.intro;

public class IntroClass {
	
	// ATTRIBUTI O PROPRIETÀ DELLA CLASSE
	
	//	MODEL DELLA CLASSE
	String nome;
	String cognome;
	String comune;
	String nazione;
	
	// Definendo gli attributi qui e non nel MAIN posso creare tutto il modello composto dai metodi get e set

	// COSTRUTTORE
	public IntroClass(String nome, String cognome, String comune, String nazione) {
		super(); // IN QUESTO CASO SI POTREBBE ANCHE EVITARE IL SUPER PERCHÉ NON CI SARÀ EREDITARIETÀ IN QUESTO ESEMPIO
		this.nome = nome;
		this.cognome = cognome;
		this.comune = comune;
		this.nazione = nazione;
	}
	
	// METODI DELLA CLASSE
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// ATTRIBUTI O PROPRIETÀ DELLA CLASSE
//		
//		String nome;
//		String cognome;
		
		IntroClass intro = new IntroClass("Francesco","Vespari","Mottafollone","Italia");
		
		System.out.println(intro.getNome());
		
	}

}
