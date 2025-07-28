package com.collections;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Integer> listaInteri = new ArrayList<>();
		
		CancArrayList cal = new CancArrayList();		//	-->> 	ArrayList<Integer> lista = new ArrayList<Integer>();
		
		System.out.println(cal.toString());
		
		cal.inserisci(13);
		
		System.out.println(cal.toString());
		
		cal.inserisci(9);
		cal.inserisci(8);
		cal.inserisci(7);
		cal.inserisci(6);
		cal.inserisci(5);
		
		System.out.println(cal.toString());
		
		cal.cancLista();
		
		System.out.println(cal.toString());
		
		cal.inserisci(2);
		cal.inserisci(4);
		cal.inserisci(6);
		cal.inserisci(8);
		cal.inserisci(10);
		
		System.out.println(cal.toString());
		
		cal.cancLista();
		
		System.out.println(cal.toString());

	}

}
