/*
 * Realizzare una classe Purse (“borsellino”), che simula una raccolta di monete.
 * Per semplicità, si memorizzeranno solo i nomi delle monete in un
 * ArrayList<String>.
 * Fornire i seguenti metodi: un construttore che che crea un oggetto Purse vuoto,
 * un metodo public void addCoin(String coinName) che inserisce una moneta al purse
 * e un metodo toString che stampa le monete presenti nel borsellino, nel formato
 * seguente: Purse[Quarter, Dime, Nickel, Dime].
 */

package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Purse {
	
	private ArrayList<String> monete;

	// costruttore
	public Purse() {
		this.monete = new ArrayList<>();
	}

	// metodo addcoin
	public void addCoin(String moneteName) {
		monete.add(moneteName);
	}

	// metodo stampa
	public String stampa() {
		return "QUESTO E IL PURSE: " + monete;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		Purse listaMonete = new Purse();

		System.out.println("Inserisci una moneta");
		System.out.println("Per uscire del programa digita x");

		boolean exit = false;

		while (!exit) {
			String moneta = scan.nextLine();

			if (moneta.equalsIgnoreCase("x")) {
				exit = true;
			} else {
				listaMonete.addCoin(moneta);
			}
		}

		System.out.println(listaMonete.stampa());
		scan.close();

	}

}
