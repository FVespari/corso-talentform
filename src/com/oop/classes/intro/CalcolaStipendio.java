package com.oop.classes.intro;

public class CalcolaStipendio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DipendenteA emir = new DipendenteA("XYZ", 1500, 8.5f);

		emir.prendiMalattia(5);
		
		System.out.println("Il totale della paga: " + emir.paga(3));
		
		emir.stampaMalattia();
		
		emir.prendiMalattia(1);
		
		emir.stampaMalattia();		
		
	}

}