package com.oop.classes.intro;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car fiatPunto = new Car(5, 20);
		
		fiatPunto.addGas(15);
		
		System.out.println("Nel serbatoio ci sono: " + fiatPunto.getSerbatoio() + " litri di carburante");
		
		System.out.println("Nel serbatoio ci sono: " + fiatPunto.serbatoio + " litri di carburante.");
		
		fiatPunto.addGas(1);
		
		System.out.println("Nel serbatoio ci sono: " + fiatPunto.serbatoio + " litri di carburante.");
		
		fiatPunto.calcolaConsumo(100);
		//"Nel serbatoio ci sono: " + serbatoio + " litri di carburante, perché hai consumato: " + consumo + " litri"
		
		System.out.println("Nel serbatoio ci sono: " + fiatPunto.serbatoio + " litri di carburante.......");
		
		
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("STAMPA fatta chiamando il metodo toString()");
		System.out.println(fiatPunto.toString());
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("STAMPA fatta nel main usando gli attributi dell'oggetto");
		System.out.println("Car [serbatoio= " + fiatPunto.serbatoio + " litri, resa= " + fiatPunto.resa + " km/litro]");
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("STAMPA fatta nel main usando i metodi get");
		System.out.println("Car [serbatoio= " + fiatPunto.getSerbatoio() + " litri, resa= " + fiatPunto.getResa() + " km/litro]");
		
		
		
		
		System.out.println("=============================================================");
		System.out.println("=============================================================");
		System.out.println("=============================================================");

		Car lanciaDelta = new Car(1, 6);
		System.out.println(lanciaDelta.toString());
		lanciaDelta.addGas(45);
		lanciaDelta.calcolaConsumo(100);
		System.out.println(lanciaDelta.toString());
		
		



		
	}

}
