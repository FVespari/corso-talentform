package com.collections;

import java.util.HashMap;

public class HashMapEsempi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> images = new HashMap<Integer, String>();
		
		images.put(1, "auto.png");
		images.put(2, "pesca.png");
		images.put(3, "cane.png");
		
		System.out.println("Images map is : " + images.size());

		System.out.println(images);

		if (images.containsKey(1)) {
			// Mapping
			String img = images.get(2);

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"pesca\" is : " + img);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Crea un HashMap che associa un nome a un'età. Inserisci tre coppie e stampale.
		
		HashMap<String, Integer> personaggi = new HashMap<String, Integer>();
		
		personaggi.put("Alfredo", 23);
		personaggi.put("Battista", 22);
		personaggi.put("Calogero", 21);
		
		System.out.println(personaggi);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Stampa l’età di "Calogero" dal HashMap.
		
		System.out.println("L'età di Calogero è: " + personaggi.get("Calogero") + " anni");
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi "bottiglia" dal dizionario.
		
		HashMap<Integer, String> dizionario = new HashMap<Integer, String>();
		
		dizionario.put(1, "bottiglia");
		dizionario.put(2, "tappeto");
		dizionario.put(3, "penna");
		
		System.out.println("HashMap prima");
		System.out.println(dizionario);
		
		dizionario.remove(1);
		
		System.out.println("HashMap dopo");
		System.out.println(dizionario);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Controlla se "tappeto" è presente.
		
		System.out.println("tappeto è presente in dizionario? " + dizionario.containsValue("tappeto"));
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Stampa tutte le chiavi del HashMap.
		
		System.out.println("Stampo le attuali key del dizionario: " + dizionario.keySet());
		
		System.out.println("Stampo le attuali key del dizionario tramite forEach:");

		for (Integer chiave : dizionario.keySet()) {
			System.out.println(chiave);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Stampa ggni nome con la rispettiva età
		
		System.out.println(personaggi.keySet());
		
		for(String name : personaggi.keySet()) {
			System.out.println(name + ": " + personaggi.get(name));
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Crea una HashMap<Integer, Integer> dove la chiave è un numero da 1 a 5 e il valore è il suo quadrato.
		
		HashMap<Integer, Integer> quadrati = new HashMap<Integer, Integer>();
		
		int lughezzaQuadrati = 7;
		
		for (int i = 1; i <= lughezzaQuadrati; i++) {
			quadrati.put(i, i*i);
		}
		
		System.out.println(quadrati);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova la persona con l’età massima.
		
		HashMap<String, Integer> persone = new HashMap<String, Integer>();
		
		persone.put("Alfredo", 23);
		persone.put("Battista", 27);
		persone.put("Calogero", 21);
		
		int etàMax = persone.get("Alfredo");
		String saggio = ""; 
		
		for(String name : persone.keySet()) {
			if(persone.get(name) > etàMax) {
				etàMax = persone.get(name);
				saggio = name;
			}		
		}
		
		System.out.println("La persona più saggia è: " + saggio);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Data una mappa di persone aggiungi "Sara" solo se non è già presente.
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		people.put("Alfredo", 23);
		people.put("Battista", 27);
		people.put("Calogero", 21);
		people.put("Sara", 25);
		
		System.out.println("HashMap people prima: " + people);
		
		if(!people.keySet().contains("Sara")) {
			people.put("Sara", 33);
		}
		
		System.out.println("HashMap people dopo: " + people);

		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Data una mappa di persone aggiungi "Sara" solo se non è già presente. (soluzione Fabio)
		
		HashMap<String, Integer> personas = new HashMap<String, Integer>();
		
		personas.put("Genoveffa", 23);
		personas.put("Sebastiana", 27);
		personas.put("Marcella", 21);
		
		System.out.println("HashMap personas prima: " + personas);
		
		personas.putIfAbsent("Sara", 33);
		
		System.out.println("HashMap personas prima: " + personas);
		
	}

}
