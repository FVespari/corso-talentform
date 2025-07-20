package com.oop.classes.intro;

public class AccountEsempioMio {
	
	// MODEL DELLA CLASSE (INIZIO)
	
	// ATTRIBUTI O PROPRIETÀ DELLA CLASSE
	
	int balance;
	int firstDeposit;
	int firstDraw;
	
	// COSTRUTTORE DELLA CLASSE - serve a prendere gli attributi della classe in ingressso e poterli referenziarli (identificarli)
	
	public AccountEsempioMio(int balance, int firstDeposit, int firstDraw) {	// DICHIARAZIONE DEL COSTRUTTORE
																	// PARAMETRI
		super(); // SERVE SOLO PER EREDITARIETÀ
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
	}

	// METODI DELLA CLASSE (INIZIO)
	
	public int getBalance() {	// METODO GET DI LETTURA
		return balance;
	}

	
	
	public void setBalance(int balance) {	// METODO SET DI SCRITTURA
		this.balance = balance;
	}

	
	
	public int getFirstDeposit() {
		return firstDeposit;
	}

	
	
	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	
	
	public int getFirstDraw() {
		return firstDraw;
	}

	
	
	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	// METODI DELLA CLASSE (FINE)
	
	// MODEL DELLA CLASSE (FINE)

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREAZIONE DELL'OGGETTO DELLA CLASSE E INVOCAZIONE DI ATTRIBUTI O METODI DELLA CLASSE
		
		AccountEsempioMio accountUno = new AccountEsempioMio(0, 300, 100);	// INIZIALIZZAZIONE DEL COSTRUTTORE
														// ARGOMENTI
		
		System.out.println(accountUno.getFirstDeposit());	// STAMPA DEI METODI DELLA CLASSE
		System.out.println(accountUno.getFirstDraw());


	}
	
	



}
