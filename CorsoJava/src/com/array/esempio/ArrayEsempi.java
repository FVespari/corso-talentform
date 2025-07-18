package com.array.esempio;

public class ArrayEsempi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNumeri = new int[7];
		
		arrayNumeri[0] = -100;		//posizione 1
		arrayNumeri[1] = 90;		//posizione 2
		arrayNumeri[2] = -80;		//posizione 3
		arrayNumeri[3] = 70;		//posizione 4
		arrayNumeri[4] = -60;		//posizione 5
		arrayNumeri[5] = 50;		//posizione 6
		arrayNumeri[6] = 40;		//posizione 7
	
		int lunghezza = arrayNumeri.length; // >>> 7
		
		System.out.println("Lunghezza array: " + lunghezza);
		
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < arrayNumeri.length; i++) {
			System.out.println(arrayNumeri[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		int[] arrayNumerix = {16,13,29,79,81,100};

		for (int in : arrayNumerix) {
			System.out.println(in);
		}
		
		System.out.println("---------------------------------------------");

		System.out.println(arrayNumeri[5]);
		
		System.out.println("---------------------------------------------");

		for (int i = 0; i < arrayNumeri.length; i++) {
			if(arrayNumeri[i] == 50) {
				System.out.println("Il valore 50 si trova in posizione: " + i);
				break;
			}
		}
		
		System.out.println("---------------------------------------------");
		
		String[] arrayStringhe = new String[3];
		
		arrayStringhe[0] = "Ciao ";
		arrayStringhe[1] = "come ";
		arrayStringhe[2] = "oggi? Ieri eri sciupatissimo.";
		
		System.out.println(arrayStringhe[1]);
		
		System.out.println("---------------------------------------------");

		int lun = arrayStringhe.length;
		
		System.out.println("Lunghezza array di stringhe: " + lun);
		
		System.out.println("---------------------------------------------");
		
		System.out.println();
		
		System.out.println("---------------------------------------------");
		
		System.out.println(arrayStringhe[0] + arrayStringhe[1] + arrayStringhe[2]);

		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < arrayStringhe.length; i++) {
			System.out.print(arrayStringhe[i]);
		}
		
		System.out.println("---------------------------------------------");

		String[] str = {"oggi ", "studiamo ", "gli array"};
		
		for (String index : str) {
			System.out.println(index);
		}
		
		System.out.println("---------------------------------------------");
		
		for (String ind : arrayStringhe) {
			System.out.println(ind);
		}
		
		System.out.println("---------------------------------------------");

		//Calcola la somma di tutti gli elementi di un array.

		int[] arrayInteri1 = new int[3];
		
		arrayInteri1[0] = 10;		//posizione 1
		arrayInteri1[1] = 20;		//posizione 2
		arrayInteri1[2] = 30;		//posizione 3
		
		int somma1 = 0;
		
		for (int i = 0; i < arrayInteri1.length; i++) {
			somma1 += arrayInteri1[i];
		}
		
		System.out.println("Somma elementi arrayInteri1: " + somma1);
		
		System.out.println("---------------------------------------------");

		//Calcola la media aritmetica degli elementi di un array.
		
		int[] arrayInteri2 = new int[4];
		
		arrayInteri2[0] = 1253;		//posizione 1
		arrayInteri2[1] = 7;		//posizione 2
		arrayInteri2[2] = 9550;		//posizione 3
		arrayInteri2[3] = 3254;		//posizione 4

		int somma2 = 0;
		
		for (int i = 0; i < arrayInteri2.length; i++) {
			somma2 += arrayInteri2[i];
		}
		
		double media2 = somma2 / arrayInteri2.length;
		
		System.out.println("Media elementi arrayInteri2: " + media2);
		
		System.out.println("---------------------------------------------");

		//Trova il valore massimo in un array di interi.
		
		int[] arrayInteri3 = new int[3];
		
		arrayInteri3[0] = 1253;		//posizione 1
		arrayInteri3[1] = 9550;		//posizione 2
		arrayInteri3[2] = 9549;		//posizione 3
		
		int max = arrayInteri3[0];						//int max = 0;
		
		for (int i = 0; i < arrayInteri3.length; i++) {
			if(arrayInteri3[i] > max) {
				max = arrayInteri3[i];
			}
		};
		
		System.out.println("Massimo valore in arrayInteri3: " + max);
		
		System.out.println("---------------------------------------------");

		//Trova il valore massimo in un array di interi.
		
		int[] arrayInteri4 = new int[3];
		
		arrayInteri4[0] = 3;		//posizione 1
		arrayInteri4[1] = 0;		//posizione 2
		arrayInteri4[2] = 1;		//posizione 3
		
		int min = arrayInteri4[0];						//int min = 0;
		int posizioneMinimo = 0;
		
		for (int i = 0; i < arrayInteri4.length; i++) {
			if(arrayInteri4[i] < min) {
				min = arrayInteri4[i];
				posizioneMinimo = i;		
			}
		};
		
		System.out.println("Minimo valore in arrayInteri4: " + min + " in posizione " + posizioneMinimo);
		
		System.out.println("---------------------------------------------");

		//Conta il numero di elementi pari in un array.
		
		int[] arrayInteri5 = new int[3];
		
		arrayInteri5[0] = 2;		//posizione 1
		arrayInteri5[1] = 3;		//posizione 2
		arrayInteri5[2] = 4;		//posizione 3
		
		int contatore = 0;
		
		for (int i = 0; i < arrayInteri5.length; i++) {
			if(arrayInteri5[i] %2 == 0) {
				contatore++;
			}
		};
		
		System.out.println("Conteggio valori pari in arrayInteri5: " + contatore);
		
		System.out.println("---------------------------------------------");

		//Stampa gli elementi dell’array in ordine inverso.
		
		int[] arrayInteri6 = new int[3];
		
		arrayInteri6[0] = 8;		//posizione 1
		arrayInteri6[1] = 9;		//posizione 2
		arrayInteri6[2] = 10;		//posizione 3
				
		for (int i = arrayInteri6.length-1; i >= 0; i--) {
			System.out.println(arrayInteri6[i]);
		};
				
		System.out.println("---------------------------------------------");

		//Controlla se un numero dato (es. 10) è presente nell’array.
		
		int numeroCercato = 10;
		
		int[] arrayInteri7 = new int[3];
		
		arrayInteri7[0] = 10;		//posizione 1
		arrayInteri7[1] = 9;		//posizione 2
		arrayInteri7[2] = 10;		//posizione 3
				
		boolean cerca = false;
		int conteggioCicli = 0;
		
		for (int i = 0; i < arrayInteri7.length; i++) {
			conteggioCicli++;
			if(arrayInteri7[i] == numeroCercato) {
				cerca = true;
				break;
			}
		};
		
		System.out.println("Il numero cercato " + numeroCercato + " è presente? " + cerca);
		System.out.println("Sono stati fatti " + conteggioCicli + " cicli");

		System.out.println("---------------------------------------------");

		//Conta quanti elementi nell’array sono maggiori di 10.
		
		int[] arrayInteri8 = new int[3];
		
		arrayInteri8[0] = 2;		//posizione 1
		arrayInteri8[1] = 11;		//posizione 2
		arrayInteri8[2] = 4;		//posizione 3
		
		int contatore8 = 0;
		int numeroVerifica = 10;

		for (int i = 0; i < arrayInteri8.length; i++) {
			if(arrayInteri8[i] > numeroVerifica) {
				contatore8++;
			}
		};
		
		System.out.println("Conteggio valori pari in arrayInteri8: " + contatore8);

		System.out.println("---------------------------------------------");

		//Copia tutti gli elementi di un array in un secondo array e stampalo.
		
		int[] arrayInteri9 = new int[3];
		
		arrayInteri9[0] = 27;		//posizione 1
		arrayInteri9[1] = 7;		//posizione 2
		arrayInteri9[2] = 1987;		//posizione 3
		
		int[] arrayInteri10 = new int[arrayInteri9.length];
		
		for (int i = 0; i < arrayInteri9.length; i++) {
			arrayInteri10[i] = arrayInteri9[i];
			System.out.println(arrayInteri10[i]);
		};

		System.out.println("---------------------------------------------");

		//Stampa solo gli elementi dispari presenti in un array.
		
		int[] arrayOggi = new int[5];
		
		arrayOggi[0] = 2;		//posizione 1
		arrayOggi[1] = 3;		//posizione 2
		arrayOggi[2] = 4;		//posizione 3
		arrayOggi[3] = -7;		//posizione 4
		arrayOggi[4] = 8;		//posizione 5
				
		for (int i = 0; i < arrayOggi.length; i++) {
			if(arrayOggi[i] %2 != 0) {
				System.out.println("Numero dispari presente in arrayOggi: " + arrayOggi[i]);
			}
		};
				
		System.out.println("---------------------------------------------");

		//Controlla se gli elementi dell’array sono ordinati in ordine crescente.
		
		int[] arrayDomani = new int[5];
		
		arrayDomani[0] = 7;		//posizione 1
		arrayDomani[1] = 8;		//posizione 2
		arrayDomani[2] = 2;		//posizione 3
		arrayDomani[3] = 10;	//posizione 4
		arrayDomani[4] = 11;	//posizione 5
		
		boolean ordineCrescente = true;
		
		for (int i = 0; i < arrayDomani.length-1; i++) {			
			if(arrayDomani[i] > arrayDomani[i+1]) {
				ordineCrescente = false;
				break;
			}
		};
		
		System.out.println(ordineCrescente);
		
		//Controlla se gli elementi dell’array sono ordinati in ordine crescente. SOLUZIONE ANDREA :)
		
		int[] array = { 3, 5, 8, 11, 50 };

		boolean ordinata = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				ordinata = false;
				break;
			}
		}
		
		System.out.println("ordinata: " + ordinata);

		if (ordinata) {
			System.out.println("ordinato giusto");
		} else {
			System.out.println("ordinato sbagliato");
		}
		
		System.out.println("---------------------------------------------");

		//Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.
		
		int[] arrayPomeriggio = new int[5];
		
		arrayPomeriggio[0] = 1;		
		arrayPomeriggio[1] = 3;		
		arrayPomeriggio[2] = 5;		
		arrayPomeriggio[3] = 2;
		arrayPomeriggio[4] = 4;
		
		// sommaDispari = 9
		// sommaPari = 6
		
		int sommaDispari = 0;
		int sommaPari = 0;
		
		for (int i = 0; i < arrayPomeriggio.length; i++) {
			if(arrayPomeriggio[i] %2 != 0) {
				sommaDispari += arrayPomeriggio[i];
			} else {
				sommaPari += arrayPomeriggio[i];
			}
		};
		
		System.out.println("Somma dei numeri dispari: " + sommaDispari);
		System.out.println("Somma dei numeri pari: " + sommaPari);
		
		System.out.println("---------------------------------------------");
		
		//Dato un array, crea un nuovo array con solo i numeri positivi.

		
		int[] originali = {-2, 4, -1, 3, 0, 7};
		int[] positivi = new int[originali.length];

		int indicePositivi = 0;
				
		for (int i = 0; i < originali.length; i++) {
			if(originali[i] >= 0) {
				positivi[indicePositivi] = originali[i];
				indicePositivi++;
			}
		};
		
		//qui stampo il nuovo array con tutti i valori del primo array ma tutti con segno positivo
		for (int i = 0; i < indicePositivi; i++) {
			System.out.println(positivi[i]);
		}
		
		System.out.println("numero di posizioni di positivi: " + positivi.length);

		System.out.println("---------------------------------------------");
				
		int[] originaliDue = { -2, 4, -1, 3, 0, 7, 9, -18, 102 };
		int lunghezzaDue = 0;
		
		for (int i = 0; i < originaliDue.length; i++) {
			if (originaliDue[i] >= 0) {
				lunghezzaDue++;
			}

		}
		
		int indexPositivi = 0;
		int[] positiviDue = new int[lunghezzaDue];
		
		for (int i = 0; i < originaliDue.length; i++) {
			if (originaliDue[i] >= 0) {
				positiviDue[indexPositivi] = originaliDue[i];
				indexPositivi++;
			}
		}
		
		for (int i = 0; i < positiviDue.length; i++) {
			System.out.println(positiviDue[i]);
		}
		
		System.out.println("\nlunghezza di positivi: " + positiviDue.length);
		System.out.println("positivi in posizione 5 " + positiviDue[5]);
		
		System.out.println("---------------------------------------------");
		
		//Sposta tutti gli zeri di un array alla fine, mantenendo l’ordine degli altri numeri.
		//Esempio: {0, 5, 0, 3, 0, 1} → {5, 3, 1, 0, 0, 0}
		//PS: abbiamo risolto l'esercizio usando come numero da spostare alla fine il 111
		
		int [] number = {111, 5, 3, 111, 1, 111};
		int [] nuovonumber = new int[number.length];
		int index = 0;
		int cont = 0;
		
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] != 111) {
			nuovonumber[index] = number[i];
			index++;
			}
			if(number[i] == 111) {
				cont++;
			}
		}
		
		for(int i = nuovonumber.length - cont; i < nuovonumber.length; i++) {
				nuovonumber[i] = 111;
		
		}
		
		for(int j : nuovonumber) {
			System.out.println(j);
		}
		
		
		//Conta quante coppie di numeri hanno somma uguale a 10.
		
		int[] fabio = {6, 9, 3, 7, 5, 5, 4, 1};
		
		int countSommaDieciX = 0;
		
		for (int i = 0; i < fabio.length; i++) {
			for (int j = i+1; j < fabio.length; j++) {
				if(fabio[i] + fabio[j] == 10) {
					countSommaDieciX++;
				}
			}
		};
		
		System.out.println("Somma coppie che fanno dieci: " + countSommaDieciX);
		
		System.out.println("---------------------------------------------");

	}

}