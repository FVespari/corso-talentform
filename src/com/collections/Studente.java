/*
 * Crea una classe Studente con nome e età. 
 * Crea un ArrayList<Studente>, aggiungi 3 studenti e stampali.
 */

package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Studente {
	
	private String nome;
	private int età;

	
	
	public Studente(String nome, int età) {
		super();
		this.nome = nome;
		this.età = età;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getEtà() {
		return età;
	}



	public void setEtà(int età) {
		this.età = età;
	}



	@Override
	public String toString() {
		return "Studente [nome = " + nome + ", età = " + età + "]";
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Studente> studenti = new ArrayList<Studente>();
				
		studenti.add(new Studente("Topolino", 22));
		studenti.add(new Studente("Minnie", 21));
		studenti.add(new Studente("Paperino", 19));
		studenti.add(new Studente("Paperina", 18));
		studenti.add(new Studente("Taz", 27));
		studenti.add(new Studente("Bugs Bunny", 23));
		studenti.add(new Studente("Beep Beep", 25));
		
		System.out.println("Stampo tutti gli studenti:");
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Dato un ArrayList<Studente>, stampa solo quelli con età > 20.
		
		System.out.println("Stampo solo gli studenti con età > 20:");
		
		for (Studente s : studenti) {
			if(s.età > 20) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Dato un ArrayList<Studente>, stampa solo quelli con età > 20. (usando il metodo get)
		
		System.out.println("Stampo solo gli studenti con età > 20: (usando il metodo get)");
		
		for (Studente s : studenti) {
			if(s.getEtà() > 20) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Ordina gli studenti in base all’età crescente.  (soluzione di gruppo)
				
		studenti.sort(Comparator.comparing(Studente:: getEtà));
		
		System.out.println("Stampo solo gli studenti in ordine di età");
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Ordina gli studenti in base al nome in ordine crescente.
				
		studenti.sort(Comparator.comparing(Studente:: getNome));
		
		System.out.println("Stampo solo gli studenti in ordine di nome crescente");
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Ordina gli studenti in base all’età crescente. (soluzione Fabio)
		
		studenti.sort(Comparator.comparingInt(s -> s.getEtà()));
		
		System.out.println("Stampo solo gli studenti in ordine di età (soluzione Fabio)");
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		//Ordina gli studenti in base all’età crescente. (soluzione new Comparator Daniel)
		
		System.out.println("Ordino in base all'età crescente usando il new Comparator e poi stampo");
		
		Collections.sort(studenti, new Comparator<Studente>() {
		    @Override
		    public int compare(Studente s1, Studente s2) {
		    	return Integer.compare(s1.età, s2.età);		// ordine crescente
		    	//return Integer.compare(s2.età, s1.età);		// ordine crescente

		    }
		}
		);
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi tutti gli studenti minori di 20 anni.
		
		System.out.println("Rimuovo tutti gli studenti minori di 20 anni e poi stampo gli studenti rimanenti");
		
		studenti.removeIf(s -> s.età < 20);
		
		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Data una seconda lista di studenti, uniscila alla prima.

		ArrayList<Studente> studentiAggiunti = new ArrayList<Studente>();
		
		studentiAggiunti.add(new Studente("Carmela", 30));
		studentiAggiunti.add(new Studente("Carmelina", 31));
		studentiAggiunti.add(new Studente("Carmeluzza", 32));
		
		studenti.addAll(studentiAggiunti);
				
		System.out.println("Stampo tutto l'arrayList studenti con l'aggiunta degli studenti nuovi");

		for (Studente s : studenti) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Rimuovi i nomi duplicati da un ArrayList<String>.

		List<String> listaNomi = new ArrayList<>(List.of("pippo", "pluto", "topolino", "paperino", "topolino", "archimede", "pippo"));
		Set<String> pulisceDuplicati = new LinkedHashSet<>(listaNomi);
		System.out.println("Stampo tutto l'arrayList listaNomi togliendo le duplicazioni");
		System.out.println(pulisceDuplicati);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Conta quante volte compare "Anna" in una lista.

		List<String> contaNomi = new ArrayList<>(List.of("anna", "pluto", "topolino", "anna", "topolino", "anna", "pippo"));
		
		int contatoreNomeAnna = 0;
		
		for (String s : contaNomi) {
			//if(s.equals("anna"))		//alternativa
			if(s.equalsIgnoreCase("anna"))
				contatoreNomeAnna++;
		}
		
		System.out.println("Quante volte compare \"Anna\" nella lista contaNomi? " + contatoreNomeAnna + " volte.");
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova e stampa lo studente con età minore. (soluzione Francesco)
		
		int etàMinore = studenti.get(0).età;
		int indiceEtàMinore = 0;
		
//		for (Studente s : studenti) {			
//			if(s.età < etàMinore)
//				etàMinore = s.età;
//		}
		
		for (int i = 0; i < studenti.size(); i++) {
			if(studenti.get(i).età < etàMinore) {
				etàMinore = studenti.get(i).età;
				indiceEtàMinore = i;
			}
		}
				
		System.out.println("Lo studente di minore età nell'array studenti al momento è: " + studenti.get(indiceEtàMinore));
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova e stampa lo studente con età minore. (soluzione Danai)
		
		studenti.add(new Studente("Topo Gigio", 18));
		studenti.add(new Studente("Calimero", 19));
				
		studenti.sort(Comparator.comparing(Studente:: getEtà));
		
		System.out.println("Lo studente di minore età nell'array studenti al momento è (versione Danai): " + studenti.get(0));
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova e stampa lo studente con età minore. (risoluzione per Gianfranco) 
		
		ArrayList<Studente> studentiAccademiaGF = new ArrayList<Studente>();
		
		studentiAccademiaGF.add(new Studente("Giulia", 22));
		studentiAccademiaGF.add(new Studente("Cesare", 21));
		studentiAccademiaGF.add(new Studente("Marco", 19));
		studentiAccademiaGF.add(new Studente("Antonio", 18));
		studentiAccademiaGF.add(new Studente("Cicerone", 15));
		
		studentiAccademiaGF.sort(Comparator.comparing(Studente:: getEtà));
		
		System.out.println("Stampo tutti gli studenti:");
		
		for (Studente s : studentiAccademiaGF) {
			System.out.println(s);
		}
		
		System.out.println("Lo studente di minore età nell'array studentiAccademiaGF al momento è (versione Danai): " + studentiAccademiaGF.get(0));
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Trova e stampa lo studente con eta minore. (soluzione Emir)
		Studente studentePiùPiccolo = Collections.min(studenti, Comparator.comparing(Studente:: getEtà));
		System.out.println("Studente con la età minore è (versione Emir): " + studentePiùPiccolo);
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
		
		// Crea un ArrayList<ArrayList<Integer>> contenente 3 liste di interi. Stampale.
		
		ArrayList<ArrayList<Integer>> listaDiListe = new ArrayList<>();

		ArrayList<Integer> lista1 = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> lista2 = new ArrayList<>(List.of(6,7,8,9,10));
		ArrayList<Integer> lista3 = new ArrayList<>(List.of(11,12,13,14,15));
		
		listaDiListe.add(lista1);
		listaDiListe.add(lista2);
		listaDiListe.add(lista3);
		
		for (ArrayList<Integer> l : listaDiListe) {
			System.out.println(l);
		}
		
		
		
		
		
		
	}

}