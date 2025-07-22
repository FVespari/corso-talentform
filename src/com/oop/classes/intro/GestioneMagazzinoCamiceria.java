package com.oop.classes.intro;

public class GestioneMagazzinoCamiceria extends Camiceria {
	
	public void taglia() {
		System.out.println("TAGLIA: " + getTaglia());
	}
	
	
	
	public void colore() {
		System.out.println("COLORE: " + getColore());
	}
	
	
	
	public void prezzo() {
		System.out.println("PREZZO: " + getPrezzo());
	}
	
	

	public void tipologia(boolean tipologia) {
		
		if(tipologia==true) {
			System.out.println("UOMO");
		} else {
			System.out.println("DONNA");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
