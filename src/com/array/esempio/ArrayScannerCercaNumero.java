package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerCercaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cerca un numero

		Scanner scanner = new Scanner(System.in);

		System.out.print("Quanti numeri vuoi inserire? ");

		int lunghezzaArray = scanner.nextInt();

		int[] array = new int[lunghezzaArray];

		for (int i = 0; i < lunghezzaArray; i++) {
			System.out.print("inserisci il numero nell'indice " + (i) + ": ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Quale numero vuoi ricercare? ");

		int numeroDaCercare = scanner.nextInt();
		boolean trovato = false;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == numeroDaCercare) {
				trovato = true;
				System.out.println("Il numero da ricercare: " + numeroDaCercare + " si trova in posizione " + i);
				break;
			}	
		}
		
		if(!trovato) {
		//if(trovato = false)
			System.out.println("Il numero da ricercare: " + numeroDaCercare + " non è presente tra quelli inseriti.");
		}
		
		scanner.close();

	}

}
