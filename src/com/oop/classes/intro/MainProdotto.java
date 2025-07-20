package com.oop.classes.intro;

public class MainProdotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto p = new Prodotto("Xiaomi", "Tredici Pro Plus", "Smartphone della famiglia Redmi", 7, 200, 20);
		
		System.out.println("Brand: " + p.getBrandProdotto());
		System.out.println("Nome: " + p.getNomeProdotto());
		System.out.println("Descrizione: " + p.getDescrizioneProdotto());
		System.out.println("Quantità: " + p.getQuantitaProdotto());
		System.out.println("Prezzo: " + p.getPrezzoProdotto());
		System.out.println("Sconto: " + p.getScontoProdotto());
		System.out.println("Prezzo scontato: " + p.getPrezzoScontato());
		
	}

}
