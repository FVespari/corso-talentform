package com.oop.classes.intro;

public class Cellulare {
	
	// ATTRIBUTI
	
	private double carica;
	private int numeroChiamate;
	
	
	
	public Cellulare(double carica, int numeroChiamate) {
		super();
		this.carica = carica;
		this.numeroChiamate = numeroChiamate;
	}



//	public double getCarica() {
//		return carica;
//	}



//	public void setCarica(double carica) {
//		this.carica = carica;
//	}



//	public int getNumeroChiamate() {
//		return numeroChiamate;
//	}



//	public void setNumeroChiamate(int numeroChiamate) {
//		this.numeroChiamate = numeroChiamate;
//	}
	
	
	
	public void ricarica(double ricarica) {
		carica += ricarica;
	}
	
	
	
	public void chiamata(double minutiDurata) {
		double costoMinuto = 0.20;
		carica -= (minutiDurata * costoMinuto);
		numeroChiamate += 1;
	}

	
	
	public int getNumeroChiamata() {
		return numeroChiamate;
	}
	
	
	
	public double numero404() {
		return carica;
	}
	
	
	
	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
	
	
	
	
	
}
