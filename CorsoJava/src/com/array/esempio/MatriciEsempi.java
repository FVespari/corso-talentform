package com.array.esempio;

public class MatriciEsempi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea una matrice 2x3 e stampa tutti i suoi elementi.
		
		int[][] matrice = {
				{1,2,3},
				{4,5,6}
		};
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		
		//Somma tutti gli elementi di una matrice 3x3.
		
		int[][] matrix = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		
		int somma = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				somma += matrix[i][j];
			}
		}
		
		System.out.println("La somma degli elementi in matrice è: " + somma);
	
		System.out.println("------------------------------------------------------------------------------------");

		//Trova il valore massimo in una matrice 3x2.

		int[][] neo = {
				{1,1,1},
				{1,7,1}
		};
	
		int eletto = neo[0][0];
		
		for (int i = 0; i < neo.length; i++) {
			for (int j = 0; j < neo[i].length; j++) {
				if(neo[i][j] > eletto) {
					eletto = neo[i][j];
				}
			}
		}
	
		System.out.println("Il massimo nella matrice è: " + eletto);
	
		System.out.println("------------------------------------------------------------------------------------");

		//Stampa la seconda riga di una matrice 3x3.
		
		int[][] matr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		//Versione lunga
//		for (int i = 0; i < matr.length; i++) {
//			if(i == 1) {
//				System.out.println("La seconda riga della matrice è:");
//				for (int j = 0; j < matr[i].length; j++) {
//					System.out.print(matr[i][j] + " ");
//				}	
//			}
//		}
		
		System.out.println("La seconda riga della matrice è:");
		for (int j = 0; j < matr[1].length; j++) {
			System.out.print(matr[1][j] + " ");
		}
	
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		//Stampa la terza colonna di una matrice 3x3.
		
		int[][] trePerTre = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		System.out.println("La terza colonna della matrice è:");
		for (int i = 0; i < trePerTre.length; i++) {
			System.out.print(trePerTre[i][2] + " ");
		}
	
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		//Calcola la somma di ogni riga in una matrice 3x3.
		
		int[][] matriceDanai = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		for (int i = 0; i < matriceDanai.length; i++) {
			int sommaDanai = 0;
			for (int j = 0; j < matriceDanai[i].length; j++) {
				sommaDanai += matriceDanai[i][j];
			}
			System.out.println("somma riga " + i + ": " + sommaDanai);
		}
	
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		//Calcola la somma di ogni colonna in una matrice 3x3.
		
		int[][] matriceAndrea = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				//,{1,1,1}
		};
		
		System.out.println("Righe matrice: " + matriceAndrea.length);
		
		for (int i = 0; i < matriceAndrea.length; i++) {
			int sommaAndrea = 0;
			for (int j = 0; j < matriceAndrea[i].length; j++) {
				sommaAndrea += matriceAndrea[j][i];
			}
			System.out.println("somma colonna " + i + ": " + sommaAndrea);
		}
		
		
	}
	
}