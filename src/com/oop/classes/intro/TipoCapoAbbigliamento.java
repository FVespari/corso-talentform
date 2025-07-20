package com.oop.classes.intro;

public class TipoCapoAbbigliamento {
	
	public String marca;
	public String modello;
	public float costo;
	
	
	
	public TipoCapoAbbigliamento(String marca, String modello, float costo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}
	
	

	public void getCosto() {
		System.out.println("Costo: " + costo);;
	}
	
	
	
	public float applicaSconto(float sconto) {
		return costo - (costo * sconto / 100);
	}
	
	
	
	public void modificaCosto(float costo) {
		this.costo = costo;
	}



	@Override
	public String toString() {
		return "TipoCapoAbbigliamento [marca=" + marca + ", modello=" + modello + ", costo=" + costo + "]";
	}



	
}
