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

		//	con clear svuoto la lista	
		
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
				
	}

}
