//Realizzare una classe CancArrayList che cancelli i numeri pari presenti in un
//ArrayList di interi. Tale classe presenta una sola variabile di istanza private
//ArrayList<Integer> lista, creare quindi un metodo void inserisci(int n) che
//inserisca nell’ArrayList lista il numero intero passato come parametro
//esplicito, creare un metodo void cancLista() che cancelli dall’ArrayList lista
//tutti gli interi pari, implementare infine un metodo String stampa che
//restituisce sottoforma di stringa il contenuto dell’ ArrayList lista.

package com.collections;

import java.util.ArrayList;

public class CancArrayList {
	
	
	
	private ArrayList<Integer> lista;	
	
	
	
	// costruttore che crea, sarebbe come dire ArrayList<Integer> lista = new ArrayList<Integer>();
	public CancArrayList() {
		//super();
		this.lista = new ArrayList<Integer>();
	}
	
	
	
//	public CancArrayList(ArrayList<Integer> lista) {
//		//super();
//		this.lista = lista;
//	}

	
	
	//	creare quindi un metodo void inserisci(int n) che inserisca nell’ArrayList lista il numero intero passato come parametro esplicito
	public void inserisci(Integer n) {
		//lista.add(lista.size(), n);		// in questo modo passo anche l'indice
		lista.add(n);		
	}
	
	
	
	//creare un metodo void cancLista() che cancelli dall’ArrayList lista tutti gli interi pari
	public void cancLista() {
		lista.removeIf(pippo -> pippo % 2 == 0);
	}
	
	
	
	//creare un metodo void cancLista() che cancelli dall’ArrayList lista tutti gli interi pari (Versione Due)
	public void cancListaVersioneDue() {
		for(int i = lista.size()-1 ; i>-1; i--)	{
			if(lista.get(i) %2 == 0)
				lista.remove(i);
		}
	}
	
	
	
	//creare un metodo void cancLista() che cancelli dall’ArrayList lista tutti gli interi pari (Versione Tre)
	public void cancListaVersioneTre() {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) %2 == 0) {
				lista.remove(i);
				i--;
			}
		}
	}
	
	
	
	//implementare infine un metodo String stampa che restituisce sottoforma di stringa il contenuto dell’ ArrayList lista.
	@Override
	public String toString() {
		//return "CancArrayList [lista = " + lista + "]";
		return "CancArrayList lista = " + lista;
	}
	
	
	
}