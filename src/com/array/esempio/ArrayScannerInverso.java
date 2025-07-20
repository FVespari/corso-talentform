package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stampa l’array al contrario
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Quanti elementi vuoi scrivere nell'array? ");
		int lunghezzaArray = scanner.nextInt();
		
        int[] numeri = new int[lunghezzaArray];

        //carico i valori nell'array
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci un numero: ");
            numeri[i] = scanner.nextInt();
        }

        //stampo i valori dell'array al contrario
		for (int i = numeri.length-1; i >= 0; i--) {
			System.out.println("Nell'indice " + i + " hai inserito il valore: " + numeri[i]);
		}
        
        scanner.close();
		
		
	}

}
