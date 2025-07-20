package com.oop.classes.intro;

public class DipendenteAndrea {
	
	public String matricola;
	public float stipendio;
	public float straordinario;
	
	
	
	public DipendenteAndrea(String matricola, float stipendio, float straordinario) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.straordinario = straordinario;
	}



	public float getStipendio() {
		return stipendio;
	}

	

	public double paga(float stipendio) {
		return stipendio + stipendio * straordinario;
	}
	
	
	
	public void stampa() {
		System.out.println(this.matricola + " " + this.stipendio + " " + this.straordinario);
	}
}
