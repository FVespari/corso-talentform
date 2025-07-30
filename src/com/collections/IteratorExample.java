package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();

		names.add("valentino");
		names.add("paolo");
		names.add("marco");
		names.add("anna");
		names. remove("valentino");

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String students = it.next();
			System.out.println(students);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Stampa tutti gli elementi di una lista
		
		List<String> mignons = new ArrayList<String>();

		mignons.add("pesca");
		mignons.add("babà");
		mignons.add("aragostina");
		mignons.add("cannolo");
		
		Iterator<String> ite = mignons.iterator();

		while (ite.hasNext()) {
			String mignon = ite.next();
			System.out.println(mignon);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Conta il numero di elementi
		
		ArrayList<String> automobili = new ArrayList<String>();

		automobili.add("Lancia Stratos");
		automobili.add("Fiat 131 Racing");
		automobili.add("Fiat Ritmo 131 Abarth");
		automobili.add("Alfa Romeo Alfa Sud");
		
		Iterator<String> itAuto = automobili.iterator();

		int contaAuto = 0;
		
		while (itAuto.hasNext()) {
			itAuto.next();
			contaAuto++;
		}
		
//		itAuto = automobili.iterator();
//		
//		automobili.add("Pagani");
//		automobili.add("McLaren");
//		automobili.add("Ferrari");
//		
//		while (itAuto.hasNext()) {
//			itAuto.next();
//			contaAuto++;
//		}
		
		System.out.println("Quante auto ci sono nel garage? " + contaAuto);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Somma tutti gli elementi
		
		ArrayList<Integer> paperone = new ArrayList<Integer>();

		paperone.add(10);
		paperone.add(20);
		paperone.add(30);
		paperone.add(40);
		paperone.add(50);
		
		Iterator<Integer> itPaperino = paperone.iterator();

		int quiQuoQua = 0;
		
		while (itPaperino.hasNext()) {
			quiQuoQua += itPaperino.next();
		}
		
		System.out.println("Quanti paperini ci sono nella BatMobile? " + quiQuoQua);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Dati una lista di interi trova il numero massimo
		
		ArrayList<Integer> numeri = new ArrayList<Integer>();

		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(9);
		numeri.add(18);
		numeri.add(32);
		
		Iterator<Integer> iter = numeri.iterator();
		
		int max = iter.next();

		while (iter.hasNext()) {
			int n = iter.next();
			if(n > max)
				max = n;
		}

		System.out.println("Il numero massimo della lista numeri è: " + max);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Dati una lista di interi trova il numero massimo
		
		ArrayList<Integer> listaNumeri = new ArrayList<Integer>();

		listaNumeri.add(1);
		listaNumeri.add(2);
		listaNumeri.add(3);
		listaNumeri.add(-9);
		listaNumeri.add(18);
		listaNumeri.add(32);
		
		Iterator<Integer> itera = listaNumeri.iterator();
		
		int min = itera.next();

		while (itera.hasNext()) {
			int n = itera.next();
			if(n < min)
				min = n;
		}
		
		System.out.println("Il numero minimo della lista listaNumeri è: " + min);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Verifica se un elemento è presente
		
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Lancia Stratos");
		cars.add("Fiat 131 Racing");
		cars.add("Fiat Ritmo 131 Abarth");
		cars.add("Alfa Romeo Alfa Sud");
		
		Iterator<String> itCars = cars.iterator();
		
		String autoDaCercare = "Fiat 131 Racing";
		
		boolean autoTrovata = false;

		while (itCars.hasNext()) {
			if(itCars.next().equals(autoDaCercare)) {
				autoTrovata = true;
				break;
			}
		}
		
		System.out.println("autoTrovata? " + autoTrovata);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Copia tutti gli elementi in una nuova lista utilizzando iterator
		
		ArrayList<String> marchiTech = new ArrayList<String>();

		marchiTech.add("Xiaomi");
		marchiTech.add("Apple");
		marchiTech.add("Samsung");
		marchiTech.add("OnePlus");
		marchiTech.add("NothingPhone");
		
		ArrayList<String> marchiTechBackup = new ArrayList<String>();
		
		Iterator<String> itTech = marchiTech.iterator();
		
		while (itTech.hasNext()) {
			marchiTechBackup.add(itTech.next());
			}
		
		System.out.println("marchiTechBackup: " + marchiTechBackup);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Conta quanti numeri sono pari
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(-9);
		numbers.add(18);
		numbers.add(32);
		
		Iterator<Integer> iteraNumbers = numbers.iterator();
		
		int contaPari = 0;

		while (iteraNumbers.hasNext()) {
			if(iteraNumbers.next() % 2 == 0)
				contaPari++;
		}
		
		System.out.println("Conteggio numeri pari: " + contaPari);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Concatena tutte le stringhe in una frase
		
		ArrayList<String> frase = new ArrayList<String>();

		frase.add("Ciao");
		frase.add("come");
		frase.add("stai?");
		frase.add("Spero");
		frase.add("tutto bene.");
		
		Iterator<String> iterafrase = frase.iterator();
		
		String stringaConcatenata = "";
		
		while (iterafrase.hasNext()) {
			stringaConcatenata += iterafrase.next() + " ";
		}
		
		System.out.println("Frase completa: " + stringaConcatenata.trim());
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Moltiplica ogni numero per 2 e salva in nuova lista
		
		ArrayList<Integer> numeriInteri = new ArrayList<Integer>();

		numeriInteri.add(1);
		numeriInteri.add(2);
		numeriInteri.add(3);
		numeriInteri.add(4);
		numeriInteri.add(5);
		numeriInteri.add(6);
		numeriInteri.add(7);
		
		ArrayList<Integer> numeriInteriMoltiplicatiPerDue = new ArrayList<Integer>();

		Iterator<Integer> iteraNumeriInteri = numeriInteri.iterator();

		while (iteraNumeriInteri.hasNext()) {
			numeriInteriMoltiplicatiPerDue.add(iteraNumeriInteri.next() * 2);
		}
		
		System.out.println("Originale ArrayList di numeriInteri: " + numeriInteri);
		System.out.println();
		System.out.println("Nuovo ArrayList di numeriInteri moltiplicati per 2: " + numeriInteriMoltiplicatiPerDue);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi tutti gli elementi minori di 10 da un set
		
		HashSet<Integer> setNumeri = new HashSet<>(List.of(1, 11, 2, 22, 3));
		
		System.out.println("Originale ArrayList di setNumeri: " + setNumeri);
		
		Iterator<Integer> iteraSetNumeri = setNumeri.iterator();
		
		while (iteraSetNumeri.hasNext()) {
			if(iteraSetNumeri.next() < 10)
				iteraSetNumeri.remove();
		}

		System.out.println("Nuovo ArrayList di setNumeri senza minori di 10: " + setNumeri);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Conta quante parole iniziano con "a"
		
		ArrayList<String> aggettivi = new ArrayList<String>();

		aggettivi.add("antico");
		aggettivi.add("nuovo");
		aggettivi.add("bizzarro");
		aggettivi.add("simpatico");
		aggettivi.add("amichevole");
		
		Iterator<String> iteraAggettivi = aggettivi.iterator();
		
		int conta = 0;
		
//		while (iteraAggettivi.hasNext()) {
//			String vocabolo = iteraAggettivi.next();
//			if(vocabolo.charAt(0) == 'a')
//				conta++;
//		}
		
//		while (iteraAggettivi.hasNext()) {
//			if(iteraAggettivi.next().charAt(0) == 'a')
//				conta++;
//		}
		
		while (iteraAggettivi.hasNext()) {
			if(iteraAggettivi.next().startsWith("a")){
				conta++;
			}
		}
		
		System.out.println("Quanti aggettivi iniziano per 'a'? " + conta);
		
	}

}
