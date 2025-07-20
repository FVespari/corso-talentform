package com.oop.classes.intro;

public class MainCellulare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cellulare c = new Cellulare(50.0, 0);
		
		c.ricarica(50.0);
		c.chiamata(3.0);
		System.out.println(c.numero404());
		System.out.println(c.getNumeroChiamata());
		c.azzeraChiamate();
		System.out.println(c.numero404());
		System.out.println(c.getNumeroChiamata());

	}

}