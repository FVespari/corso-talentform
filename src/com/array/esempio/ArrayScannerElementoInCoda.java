package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerElementoInCoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aggiungi un elemento in coda all’array VERSIONE ZALONE.
		
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("inserisci il numero nell'indice " + (i) + ": ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Indice da rimuovere da 0 a 4: ");
		int pos = scanner.nextInt();
		
		if(pos < 0 || pos >= array.length) {
			System.out.println("Posizione non trovata");
		} else {
			int[] arrayNuovo = new int[array.length-1];
			
			for (int i = 0, j = 0; i < array.length; i++) {
				if(i != pos) {
					arrayNuovo[j++] = array[i];
				}
			}
			
			System.out.println("array dopo la rimozione:");
			
			for (int k : arrayNuovo) {
				System.out.println(k);
			}
		}

		scanner.close();
		
	}

}
