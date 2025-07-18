package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerEsempio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arrayInteri = new int[5];
		
		for (int i = arrayInteri.length-1; i >= 0; i--) {
			System.out.print("Inserisci un numero: ");
			arrayInteri[i] = sc.nextInt();
		}

		System.out.println("I numeri che hai inserito sono:");
		
		for (int i : arrayInteri) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
