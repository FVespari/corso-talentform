package com.cicli.esempio;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < 10; i++) {			
			if(i==7) {
				continue;	// ignora la stampa del 7
			}
			System.out.println(i);
		}
		*/
		
		/*
		System.out.println("---------------------------------------------");
		
		// Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un ciclo for.
		
		int somma = 0;
		
		for (int i = 0; i <= 100; i++) {
			somma = somma + i;
			//somma += i; 					//forma contratta
		}
		
		System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
		
		// Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un ciclo for. (SITUAZIONE + FLESSIBILE)
		
		int sum = 0;
		int start = 0;
		int finish = 100;
		
		for (int i = start; i <= finish; i++) {
			sum = sum + i;
		}
		
		System.out.println("La sum dei numeri da " + start + " a " + finish + " è: " + sum);
		*/

		/*
		System.out.println("---------------------------------------------");
		
		//Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).

		int fattoreTabellina = 2;
		int prodotto = 0;
		
		for (int i = 1; i <= 10; i++) {
			prodotto = i * fattoreTabellina;
			System.out.println(fattoreTabellina + " x " + i + " = " + prodotto);
		}
		*/
		
		/*
		System.out.println("---------------------------------------------");
		
		//Scrivi un programma che stampa tutti i numeri primi da 2 a 100 usando solo for.
		
		for(int i =2; i<=100; i++) {
			boolean primo = true;			
			for(int x = 2; x <= i/2; x++) {
				if(i%x==0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.println(i+ " ");
			}
		*/
		
			System.out.println("---------------------------------------------");
			
			//Scrivi un programma che inverte un numero intero positivo. Esempio: 1234 → 4321
			
			int num = 1230;			//	--> 1
			int numReverse = 0;
			
			while (num > 0) {
				int restoDivisione = num%10;	// --> 0 	questa non è una verifica! È un'operazione 			20 % 10 = 0
				numReverse = (numReverse * 10) + restoDivisione;
				num = num / 10;
			}
			
			System.out.println(numReverse);
			
			System.out.println("---------------------------------------------");
			
			//Scrivi un programma che stampa la rappresentazione binaria di un numero intero positivo. Esempio: 13 → 1101			
			
			int numero = 13;
	        int n = numero;
	        String binario = "";

	        if (numero == 0) {
	            binario = "0";
	        } else {
	            while (n > 0) {
	                binario = (n % 2) + binario;
	                n /= 2;
	            }
	        }

	        System.out.println("Binario di " + numero + ": " + binario);
	        
			System.out.println("---------------------------------------------");
			
			//Scrivi un programma che somma tutte le cifre di un numero intero positivo. Esempio: 456 → 4 + 5 + 6 = 15.
		
			int numeroDanai = 456;
			int somma = 0;
			
			do {
				int cifra = numeroDanai % 10;
				somma = somma + cifra;
				numeroDanai = numeroDanai / 10;
			}
			while (numeroDanai > 0);
			System.out.println(somma);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
