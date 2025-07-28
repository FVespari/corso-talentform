package com.collections;

import java.util.Scanner;

public class MainPurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Purse myPurse = new Purse();
		boolean add = false;
		
		System.out.println("inserisci nomi (digita fine per terminare)");
		
		while(!add) {
			String moneta = input.nextLine().trim();
			if(moneta.equals("0")) {
				add = true;
			}else {
				myPurse.addCoin(moneta);
			}
		}
		
		System.out.println("ciclo terminato");
	
	    System.out.println(myPurse.stampa());

	    input.close();

	}

}
