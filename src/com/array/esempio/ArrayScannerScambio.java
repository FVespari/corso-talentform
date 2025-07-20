package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerScambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scambia primo e ultimo elemento

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");

		int lunghezzaArray = scanner.nextInt();

		int[] array = new int[lunghezzaArray];

		for (int i = 0; i < lunghezzaArray; i++) {
			System.out.println("inserisci il numero nell'indice " + (i) + ": ");
			array[i] = scanner.nextInt();
		}
		
		int primaPosizione = array[0];
		
		array[0] = array[array.length-1];
		
		array[array.length-1] = primaPosizione;
		
		for (int i : array) {
			System.out.println("Array con scambio prima - ultima posizione: " + i);
		}
		
		scanner.close();
		
	}

}
