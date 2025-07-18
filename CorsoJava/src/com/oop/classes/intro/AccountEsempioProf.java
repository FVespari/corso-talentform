package com.oop.classes.intro;

public class AccountEsempioProf {

	// MODEL DELLA CLASSE

	// ATTRIBUTI O PROPRIETA' DELLA CLASSE

	int balance;
	int firstDeposit;
	int firstDraw;

	// COSTRUTTORE DELLA CLASSE

	public AccountEsempioProf(int balance, int firstDeposit, int firstDraw) { // DICHIARAZIONE DEL COSTRUTTORE
																	// PARAMETRI

		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
	}

	public int getFirstDeposit() { // METODO GET DI LETTURA
		return firstDeposit;
	}

	public void setFirstDeposit(int firstDeposit) { // METODO SET DI SCRITTURA
		this.firstDeposit = firstDeposit;
	}

	public int getFirstDraw() {
		return firstDraw;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// FINE MODEL DELLA CLASSE

	public static void main(String[] args) {

		// CREAZIONE DELL'OGGETTO DELLA CLASSE E INVOCAZIONE DI ATTRIBUTI O METODI DELLA
		// CLASSE

		AccountEsempioProf account = new AccountEsempioProf(0, 300, 100); // INIZIALIZZAZIONE DEL COSTRUTTORE
													// ARGOMENTI
		
		account.setBalance(0);
		account.setFirstDeposit(300);  // METODI
		account.setFirstDraw(100);

		System.out.println(account.getFirstDeposit());  // STAMPA DEI METODI DELLA CLASSE
		System.out.println(account.getFirstDraw());
		
	}

}
