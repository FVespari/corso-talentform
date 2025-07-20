package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerSomma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcola la somma degli elementi
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrayInteri = new int[3];
		int somma = 0;
		
		for (int i = arrayInteri.length-1; i >= 0; i--) {
			System.out.print("Inserisci un numero: ");
			arrayInteri[i] = sc.nextInt();
			somma += arrayInteri[i];
		}
		
		System.out.println("I numeri che hai inserito sono:");
		
		for (int i : arrayInteri) {
			System.out.println(i);
		}
		
		System.out.print("La somma dei numeri che hai inserito è:" + somma);
		
		sc.close();
		
	}

}
