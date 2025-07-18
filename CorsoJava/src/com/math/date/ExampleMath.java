package com.math.date;

public class ExampleMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Radice quadrata di 100: " + Math.sqrt(100));
//		System.out.println("Radice quadrata di 100: " + Math.sqrt(81));
//		System.out.println("2 elevato a potenza 3: " + Math.pow(2, 3));
//		System.out.println("10 elevato a potenza 5: " + Math.pow(10, 5));
//		
//		// GENERA NUMERI CASUALI DA 1 A 10:
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Math.random());
//		}
//		
//		// ARROTONDA AL NUMERO INTERO
//		
//		System.out.println("Round Up = " + Math.round(10.8));
//		System.out.println("Round ? = " + Math.round(10.5));
//		
//		// MANTIENE IL NUMERO INTERO EVITANDO IL DECIMALE
//		
//		System.out.println("Floor = " + Math.floor(10.8));
//		
//		// ARROTONDA AL NUMERO INTERO
//		
//		System.out.println("Ceil = " + Math.ceil(10.2));
		
//		System.out.println("---------------------------------------------");
//		
//		// GENERA NUMERI CASUALI DA 1 A 10:
//		
//		for (int i = 0; i < 10; i++) {
//			//System.out.println(Math.round(Math.random()));
//			System.out.println(Math.floor((Math.random()*i)+1));
//			//console.log(Math.floor(Math.random() * 5) + 1);
//		}
		
		System.out.println("---------------------------------------------");
		
		//Dato un numero intero, stampa il suo valore assoluto.

		int numeroIntero = -27;
		int valoreAssoluto = Math.abs(numeroIntero);
		System.out.println("Il valore assoluto di " + numeroIntero + " è: " + valoreAssoluto);
		
		System.out.println("---------------------------------------------");
		
		//Dato un numero intero, stampa il suo valore assoluto.

		int max = Math.max(15, 27);
		System.out.println(max);
		
		System.out.println("---------------------------------------------");
		
		//Stampa un numero casuale (double) tra 0.0 e 1.0.
		
		System.out.println("Numero casuale tra 0 e 1:" + Math.random());

		System.out.println("---------------------------------------------");
		
		//Stampa un numero intero random compreso tra 1 e 10.

		int numerus = (int) (Math.random() * 10) + 1;
		System.out.println("Numero casuale tra 1 e 10: " + numerus);

		System.out.println("---------------------------------------------");
		
		//Stampa la differenza assoluta tra 20 e 35. 20-35 = |-15| = 15

		int alpha = 20;
		int beta = 35;
		int gamma = Math.abs(alpha-beta);
		
		System.out.println("Differenza assoluta tra " + alpha + " e " + beta + " = " + gamma);
		
		System.out.println("---------------------------------------------");

		int differenza = 20-35;
		int valoreAbs = Math.abs(differenza);
		
		System.out.println(valoreAbs);
		
		System.out.println("---------------------------------------------");

		int catetoUno = 3;
		int catetoDue = 4;
		double iptenusa = Math.sqrt(Math.pow(catetoUno,2) + Math.pow(catetoDue,2));
		
		System.out.println("Ipotenusa: " + iptenusa);
		
		System.out.println("---------------------------------------------");
		
		//Dato il raggio r = 5, calcola l’area del cerchio.
		
		double raggio = 5;
		double area = Math.PI * Math.pow(raggio, 2);
		double difetto = Math.ceil(area);
		System.out.println("l'area del cerchio è: " + difetto);
		
		System.out.println("---------------------------------------------");
		
		//Stampa un numero casuale compreso tra 0.00 e 1.00 con due cifre decimali.
		
		double numerix = Math.round(Math.random() * 100 / 100.00);
		
		System.out.println(numerix);

	}

}
