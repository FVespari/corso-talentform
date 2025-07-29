package com.collections;

import java.util.HashSet;
import java.util.List;

public class HashSetEsempi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea un HashSet di stringhe, aggiungi tre colori e stampali.
		
		HashSet<String> colori = new HashSet<String>();
		
		colori.add("Rosso Ferrari");
		colori.add("Giallo Lamborghini");
		colori.add("Antracite Pagani");
		
		for (String c : colori) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Crea un HashSet di stringhe, aggiungi 8 nomi di persona di cui 3 uguali

		HashSet<String> nomi = new HashSet<String>();
		
		nomi.add("John");
		nomi.add("Mary");
		nomi.add("James");
		nomi.add("Jennifer");
		nomi.add("Robert");
		nomi.add("Jennifer");
		nomi.add("Elizabeth");
		nomi.add("Jennifer");
		
		for (String n : nomi) {
			System.out.println(n);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Verifica se un HashSet contiene il valore "Milano".
		
		HashSet<String> città = new HashSet<String>();
		
		città.add("Roma");
		città.add("Parigi");
		città.add("Londra");
		città.add("Berlino");
		città.add("Madrid");
		città.add("Amsterdam");
		città.add("Vienna ");
		città.add("Praga");
		città.add("Milano");
		
		System.out.println("Stampa dell'HashSet città:");

		for (String cC : città) {
			System.out.println(cC);
		}
		
		System.out.println("Nell'HashSet città è presente Milano? " + città.contains("Milano"));
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi "Roma" dal HashSet.
		
		città.remove("Roma");
		
		System.out.println("Stampa dell'HashSet dopo la rimozione di Roma:");

		for (String cC : città) {
			System.out.println(cC);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Stampa il numero di elementi nel HashSet.
		
		System.out.println("Quanti elementi ha l'HashSet città? " + città.size() + " elementi.");
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Copia un HashSet in un altro.
		
		HashSet<String> copiaCittà = new HashSet<String>(città);

		System.out.println("Stama HashSet copiaCittà:");
		
		for (String cCC : copiaCittà) {
			System.out.println(cCC);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Svuota il set e verifica se è vuoto.
	
		città.clear();
		System.out.println("L'HashSet città è vuoto? " + città.isEmpty());
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova gli elementi comuni tra due HashSet.
		
		HashSet<String> listaNomi1 = new HashSet<>(List.of("mario", "luigi", "albano" , "albano", "topolino"));

		System.out.println("Prima stampa listaNomi1:");
		for (String ln : listaNomi1) {
			System.out.println(ln);
		}
		
		HashSet<String> listaNomi2 = new HashSet<>(List.of("maria", "luigia", "albano" , "topolino", "mario"));
		
		System.out.println("Prima stampa listaNomi2:");
		for (String ln : listaNomi2) {
			System.out.println(ln);
		}

		listaNomi1.retainAll(listaNomi2);
		
		System.out.println("Seconda stampa listaNomi1:");
		for (String ln : listaNomi1) {
			System.out.println(ln);
		}
				
		System.out.println("Seconda stampa listaNomi2:");
		for (String ln : listaNomi2) {
			System.out.println(ln);
		}
		
		System.out.println(listaNomi1);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Unione tra set

		HashSet<String> fruttiCalabresi = new HashSet<>(List.of("Bergamotto", "Clementine", "Annona"));
		HashSet<String> fruttiPuglieesi = new HashSet<>(List.of("Fichi", "Uva", "Ciliegie"));

		fruttiCalabresi.addAll(fruttiPuglieesi);
		
		System.out.println(fruttiCalabresi);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova gli elementi presenti in set1 ma non in set2.
		
		HashSet<String> fruttiUno = new HashSet<>(List.of("Bergamotto", "Clementine", "Annona", "Banana", "Mela"));
		HashSet<String> fruttiDue = new HashSet<>(List.of("Fichi", "Uva", "Ciliegie", "Banana", "Mela"));
		
		HashSet<String> differenza = new HashSet<>(fruttiUno);

		differenza.removeAll(fruttiDue);
		
		System.out.println("Stampa differenza:");
		for (String dff : differenza) {
			System.out.println(dff);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi da un HashSet tutti gli elementi presenti in un altro.
		
		HashSet<String> pizzeUno = new HashSet<>(List.of("Margherita", "Marinara", "Diavola", "Quattro Formaggi", "Pistacchiosa"));
		HashSet<String> pizzeDue = new HashSet<>(List.of("Bosco Calabrese", "Sorrentina", "Tre Cipolle sul Tonnò", "Pistacchiosa", "Diavola", "Margherita"));
		
		pizzeUno.removeAll(pizzeDue);
		
		System.out.println(pizzeUno);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Crea un HashSet<Integer>, aggiungi numeri e calcola la somma.
		
		HashSet<Integer> numerissimi = new HashSet<>(List.of(10, 20, 30, 10));
		
		System.out.println(numerissimi);
		
		int somma = 0; 
		
		for (Integer i : numerissimi) {
			somma += i;
		}
		
		System.out.println("La somma dei valori dell'HashSet (10, 20, 30, 10) è pari a " + somma + " perché tolgo il doppio considerando 10 una sola volta.");
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();

	}

}
