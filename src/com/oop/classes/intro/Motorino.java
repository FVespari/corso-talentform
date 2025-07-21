package com.oop.classes.intro;

public class Motorino {
	
	public String colore;
	public float velocità;
	public String tipo;		// marca + modello
	public boolean antifurto = false;
	
	
	
	public Motorino(String colore, float velocità, String tipo, boolean antifurto) {
		super();
		this.colore = colore;
		this.velocità = velocità;
		this.tipo = tipo;
		this.antifurto = antifurto;
	}



	public float getVelocità() {
		return velocità;
	}
	
	
	
	public void accelera(float velocità) {		
		if(!antifurto) {
			this.velocità += velocità;
			System.out.println("Il motorino ha velocità: " + this.velocità);
		}
	}



	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
		System.out.println("L'antifurto è inserito? " + this.antifurto);
	}



	public void setVelocità(float velocità) {
		this.velocità = velocità;
	}



	@Override
	public String toString() {
		return "Motorino [colore=" + colore + ", velocità=" + velocità + ", tipo=" + tipo + ", antifurto=" + antifurto
				+ "]";
	}
	
	
	
}
