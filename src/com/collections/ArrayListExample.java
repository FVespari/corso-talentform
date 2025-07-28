package com.collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(111);
		numbers.add(222);
		numbers.remove(0);

		for (int names : numbers) {
			System.out.println(names);
		}
	
		System.out.println("=====================================================");
		
		List<Integer> num = new ArrayList<Integer>();

		num.add(5);
		num.add(4);
		num.add(3);
		num.add(2);
		num.add(1);

		Collections.sort(num);

		for (int n : num) {
			System.out.println(n);
		}
		
		System.out.println("=====================================================");
		
		List<String> prodotti = new ArrayList<String>();

		prodotti.add("pane");
		prodotti.add("latte");
		prodotti.add("sapone");
		prodotti.add("frutta");
		prodotti.add("carta igienica");

		for (String prodotto : prodotti) {
			System.out.println(prodotto);
		}
		
		System.out.println("=====================================================");
		
		Collections.reverse(prodotti);	
		
		for (String prodotto : prodotti) {
			System.out.println(prodotto);
		}
		
		System.out.println("=====================================================");

		prodotti.set(2, "bagnodoccia");
		
		for (String prodotto : prodotti) {
			System.out.println(prodotto);
		}
		
		System.out.println("=====================================================");

		System.out.println("La lunghezza della lista è: " + prodotti.size());
	
		System.out.println("=====================================================");

		// lista di interi da riordinare

		List<Integer> interi = new ArrayList<Integer>();

		interi.add(1);
		interi.add(3);
		interi.add(5);
		interi.add(7);
		interi.add(9);
		interi.add(2);
		interi.add(4);
		interi.add(6);
		interi.add(8);
		interi.add(10);

		System.out.println("Lunghezza lista: " + interi.size());

		System.out.println(interi);

		System.out.println("=====================================================");
		
		// con remove elimino il 2 dalla posizione 5
		
		interi.remove(5);

		Collections.sort(interi);

		System.out.println("Lunghezza lista: " + interi.size());
		
		System.out.println(interi);
		
		System.out.println("=====================================================");

		System.out.println("Lunghezza lista: " + interi.size());

		//con clear svuoto la lista	
		
		interi.clear();
		
		boolean listEmpty = interi.isEmpty();   //è vuota (quindi true) o piena (quindi false)

		System.out.println(listEmpty);

		if (!listEmpty) {
			System.out.println("piena");
		} else {
			System.out.println("vuota");
		}
		
		if (listEmpty) {
			System.out.println("vuota");
		} else {
			System.out.println("piena");
		}

		System.out.println("=====================================================");
		
		// Crea un ArrayList di stringhe, aggiungi tre nomi e stampali.
		
		List<String> automobili = new ArrayList<String>();
		
		automobili.add("Lancia Delta HF Integrale");
		automobili.add("Ferrari Purosangue");
		automobili.add("Lancia Stratos");
		
		for (String automobile : automobili) {
			System.out.println(automobile);
		}

		System.out.println("=====================================================");
		
		// Stampa il secondo elemento di un ArrayList contenente numeri interi

		List<Integer> numeriInteri = new ArrayList<Integer>();

		numeriInteri.add(101);
		numeriInteri.add(93);
		numeriInteri.add(85);
		numeriInteri.add(77);
		numeriInteri.add(69);
		
		System.out.println("Stampa il secondo elemento: " + numeriInteri.get(1));	// stampo il secondo elemento

		System.out.println("=====================================================");
		
		// Sostituisci il primo elemento di un ArrayList di stringhe con un altro valore.
		
		List<String> nomi = new ArrayList<String>();
		
		nomi.add("Francesco Ilario");
		nomi.add("Rossella");
		nomi.add("Carmela");
		
		System.out.println("Nomi nella lista originale");
		System.out.println(nomi);
		
		nomi.set(0, "Francesco");
		
		System.out.println("Nomi nella lista aggiornata");
		System.out.println(nomi);

		System.out.println("=====================================================");
		
		// Rimuovi il numero 15 da un ArrayList di interi.
		
		List<Integer> numNum = new ArrayList<Integer>();

		numNum.add(101);
		numNum.add(93);
		numNum.add(15);
		
		System.out.println("numNum nella lista originale");
		System.out.println(numNum);
		
		numNum.remove(2);
		
		System.out.println("numNum nella lista aggiornata");
		System.out.println(numNum);

		System.out.println("=====================================================");
		
		// Stampa quanti elementi contiene un ArrayList.
		
		ArrayList<String> colori = new ArrayList<>();
		
		colori.add("bianco");
		colori.add("nero");
		colori.add("verde");
		colori.add("rosso");

		System.out.println("L'array list ha: " + colori.size() + " elementi");

		System.out.println("=====================================================");
		
		// Verifica se un ArrayList contiene il valore "Roma".
		
		List<String> città = new ArrayList<String>();
		
		città.add("Tokio");
		città.add("Londra");
		città.add("Madrid");
		
		//boolean verificaPresenzaCittà = città.contains("Roma");
		
		System.out.println("Controlla se \"Roma\" è nella mia lista: " + città.contains("Roma"));

		System.out.println("=====================================================");
		
		// Svuota un ArrayList e verifica che sia vuoto.
		
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("bianco");
		colours.add("nero");
		colours.add("verde");
		colours.add("rosso");
		colours.add("blu");
		
		System.out.println("colours prima di svuotarlo:");
		System.out.println(colours);
		
		colours.clear();
		
		System.out.println("colours dopo averlo svuotato:");
		System.out.println(colours);
		
		System.out.println("L'array \"colours\" è vuoto? " + colours.isEmpty());

		System.out.println("=====================================================");
		
		// Ordina un ArrayList di numeri in ordine crescente.
		
		List<Integer> listaNumeriDaOrdinare = new ArrayList<Integer>();

		listaNumeriDaOrdinare.add(101);
		listaNumeriDaOrdinare.add(93);
		listaNumeriDaOrdinare.add(85);
		listaNumeriDaOrdinare.add(77);
		listaNumeriDaOrdinare.add(69);
		
		System.out.println("listaNumeriDaOrdinare prima dell'ordinamento:");

		for (Integer numero : listaNumeriDaOrdinare) {
			System.out.println(numero);
		}
		
		Collections.sort(listaNumeriDaOrdinare);

		System.out.println("listaNumeriDaOrdinare dopo l'ordinamento:");

		for (Integer numero : listaNumeriDaOrdinare) {
			System.out.println(numero);
		}

		System.out.println("=====================================================");
		
		// Crea un ArrayList di caratteri e sostituisci 2 elementi con dei nuovi e stampalo.
		
		ArrayList<Character> caratteri = new ArrayList<Character>();
		
		caratteri.add('A');
		caratteri.add('B');
		caratteri.add('C');
		caratteri.add('D');
		caratteri.add('E');
		
		System.out.println("caratteri lista originale:");
		System.out.println(caratteri);
		
		caratteri.set(0, 'X');
		caratteri.set(caratteri.size()-1, 'Y');
		
		System.out.println("caratteri lista aggiornata:");
		System.out.println(caratteri);

		System.out.println("=====================================================");
		
		// Calcola la somma degli interi in un ArrayList.

		List<Integer> numeri = new ArrayList<>();
		
		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		
		int somma = 0;
		
		for(Integer n: numeri) {
			somma += n;
		}

		System.out.println("Somma: " + somma);

		System.out.println("=====================================================");
		
		// Copia tutti gli elementi da una lista String a un’altra.
		
		ArrayList<String> saluti = new ArrayList<>();
		
		saluti.add("buongiorno");
		saluti.add("buon pranzo");
		saluti.add("ciao");
		saluti.add("buon pomeriggio");
		saluti.add("buona sera");
		
		System.out.println("array list \"saluti\" lista originale:");
		System.out.println(saluti);
		
		System.out.println("Faccio il primo backup");		
		ArrayList<String> salutiBackup = new ArrayList<>(saluti);
		
		System.out.println("array list \"salutiBackup\" lista backuppata:");
		System.out.println(salutiBackup);
		
		System.out.println("Faccio il secondo backup");
		ArrayList<String> salutiBackupDue = new ArrayList<>();
		salutiBackupDue.addAll(salutiBackup);
		System.out.println("array list \"salutiBackupDue\" lista backuppata la seconda volta:");
		System.out.println(salutiBackupDue);
		
		salutiBackupDue.add("buona notte");

		System.out.println("array list \"salutiBackupDue\" aggiornata:");
		System.out.println(salutiBackupDue);
		


		
		

		
		
	}

}
