/*
 *	Creare un Model Regioni che mi stampi chiave e valore della regione di Italia 
 *	più la rispettiva latitudine e longitudine. 
 *	Utilizzare per la regione String e lat e long Double 
 */

package com.collections;

public class RegioneModel {
	
	private String nomeRegione;
	private double latitudine;
	private double longitudine;
	
	

	public RegioneModel(String nomeRegione, double latitudine, double longitudine) {
		super();
		this.nomeRegione = nomeRegione;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}



	public String getNomeRegione() {
		return nomeRegione;
	}



	public void setNomeRegione(String nomeRegione) {
		this.nomeRegione = nomeRegione;
	}



	public double getLatitudine() {
		return latitudine;
	}



	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}
	
	
	
	public double getLongitudine() {
		return longitudine;
	}



	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}



	@Override
	public String toString() {
		return "Regione [nomeRegione = " + nomeRegione + ", latitudine = " + latitudine + ", longitudine = "
				+ longitudine + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
