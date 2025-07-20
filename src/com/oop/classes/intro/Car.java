package com.oop.classes.intro;

public class Car {
	
	public double serbatoio;
	//public int kmPercorsi;
	public double resa;		// km / l		>>> 20 km con 1 litro
	
	
	
	public Car(double serbatoio, double resa) {
		//super();
		this.serbatoio = serbatoio;
		this.resa = resa;
	}



	public double getSerbatoio() {
		return serbatoio;
	}



	public void setSerbatoio(double serbatoio) {
		this.serbatoio = serbatoio;
	}



	public double getResa() {
		return resa;
	}



	public void setResa(double resa) {
		this.resa = resa;
	}
	
	
	
	public void addGas(double gas) {
		serbatoio += gas;
		System.out.println("Nel serbatoio ci sono: " + serbatoio + " litri di carburante.");
	}
	
	
	
	public void calcolaConsumo(double kmPercorsi) {		// metodo drive
		double consumo = kmPercorsi / resa;				//	in litri
		serbatoio -= consumo;
		System.out.println("Nel serbatoio ci sono: " + serbatoio + " litri di carburante, perché hai consumato: " + consumo + " litri, avendo percorso " + kmPercorsi + " km");
	}



	@Override
	public String toString() {
		return "Car [serbatoio= " + serbatoio + " litri, resa= " + resa + " km/litro]";
	}
	
	
	
	
	

}
