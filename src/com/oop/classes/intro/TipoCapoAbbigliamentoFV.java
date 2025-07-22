package com.oop.classes.intro;

public class TipoCapoAbbigliamentoFV {
	
	private String marca;
	private String modello;
	private double costo;
	
	public TipoCapoAbbigliamentoFV(String marca, String modello, double costo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public double applicaSconto(double percentualeSconto){
		return getCosto() - (getCosto() * (percentualeSconto / 100));
	}
	
	public void modificaCosto(double nuovoCosto){
		costo = nuovoCosto;
	}	
	
}
