package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerAggiungiInCoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aggiungi un elemento in coda all’array
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quanti numeri vuoi inserire? ");

		int lunghezzaArray = scanner.nextInt();

		int[] array = new int[lunghezzaArray];

		for (int i = 0; i < lunghezzaArray; i++) {
			System.out.print("inserisci il numero nell'indice " + (i) + ": ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Quale numero vuoi aggiungere? ");

		int numeroDaAggiungere = scanner.nextInt();

		int[] arrayNuovo = new int[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			arrayNuovo[i] = array[i]; 
		}
		
		arrayNuovo[arrayNuovo.length-1] = numeroDaAggiungere;
		
		for (int k : arrayNuovo) {
			System.out.println(k);
		}
		
		scanner.close();


	}

}
