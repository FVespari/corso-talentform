package com.oop.classes.intro;

public class BankAccount {

	// ATTRIBUTI DELLA CLASSE
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	
	/* IN QUESTO ESEMPIO NON SERVE IL COSTRUTTORE
	public BankAccount(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
	}
	*/
	
	// METODI DELLA CLASSE - rappresentano le azioni

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}
	
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	
	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BankAccount account = new BankAccount();
		account.setBalance(0);
		account.setFirstDeposit(500);
		account.setFirstDraw(100);
		account.setSecondDeposit(50);
		account.setSecondDraw(100);
		
		System.out.println(account.getTotalAccount());

	}

}
