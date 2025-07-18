package com.array.esempio;

import java.util.Scanner;

public class ArrayScannerMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        
		int[] numeri = new int[5];
        
        int max = 0;

        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci un numero: ");
            numeri[i] = scanner.nextInt();
            
			if(numeri[i] > max) {
				max = numeri[i];
			}
            
        }
        
        System.out.println("Numeri inseriti:");
        for (int num : numeri) {
            System.out.println(num);
        }

        System.out.println("Tra i numeri che hai inserito il max è: " + max);
        
        scanner.close();
		
	}

}
