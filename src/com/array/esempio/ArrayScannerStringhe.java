package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerStringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stringa = new Scanner(System.in);
		
		String [] nomi = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("inserisci un nome: " + i);
			nomi[i] = stringa.nextLine();
		}
		
		for(String s : nomi) {
			System.out.println("stampo i nomi: " + s);
		}
		
		stringa.close();
		
	}

}
