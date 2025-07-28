package com.oop.classes.intro;

public class MainTipoCapoAbbigliamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TipoCapoAbbigliamento capoZeta = new TipoCapoAbbigliamento("Adidas", "Advantage", 35.0f);
		
		System.out.println(capoZeta.toString());
		
		//System.out.println("Prezzo scontato: " + capoZeta.applicaSconto(20.0f));
		
		capoZeta.modificaCosto((float) capoZeta.applicaSconto(20.0f));
		
		System.out.println(capoZeta.toString());
		
		capoZeta.getCosto();

	}

}