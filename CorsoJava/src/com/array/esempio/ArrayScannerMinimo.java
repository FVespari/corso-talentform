package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");

		int lunghezzaArray = scanner.nextInt();

		int[] array = new int[lunghezzaArray];

		int minimo = 0;

		for (int i = 0; i < lunghezzaArray; i++) {
			System.out.println("inserisci il numero nell'indice " + (i) + ": ");
			array[i] = scanner.nextInt();
			minimo = array[0];
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}

		System.out.println("Il minimo è : " + minimo);
		
		scanner.close();
		
	}

}
