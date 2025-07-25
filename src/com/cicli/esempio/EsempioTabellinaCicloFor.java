package com.cicli.esempio;

public class EsempioTabellinaCicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------------------------------");
		
		//Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).

		int fattoreTabellina = 2;
		int prodotto = 0;
		
		for (int i = 1; i <= 5; i++) {
			prodotto = i * fattoreTabellina;
			System.out.println(fattoreTabellina + " x " + i + " = " + prodotto);		
		}

	}

}
