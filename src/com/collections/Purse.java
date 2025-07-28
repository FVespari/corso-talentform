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
		return "QUESTO E IL PURSE" + monete;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
