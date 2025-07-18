package com.oop.classes.intro;

public class BankAccountConCostruttoreV1 {

	// ATTRIBUTI DELLA CLASSE
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	
	
	public BankAccountConCostruttoreV1(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
	}
	
	// METODI DELLA CLASSE - rappresentano le azioni

	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public int getSecondDraw() {
		return secondDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountConCostruttoreV1 accountConCostruttore1 = new BankAccountConCostruttoreV1(0, 0, 0, 0, 0);
		
		accountConCostruttore1.setBalance(0);
		accountConCostruttore1.setFirstDeposit(500);
		accountConCostruttore1.setFirstDraw(100);
		accountConCostruttore1.setSecondDeposit(50);
		accountConCostruttore1.setSecondDraw(100);
		
		System.out.println(accountConCostruttore1.getTotalAccount());
		
	}

}
