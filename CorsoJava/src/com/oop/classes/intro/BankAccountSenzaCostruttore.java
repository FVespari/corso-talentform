package com.oop.classes.intro;

public class BankAccountSenzaCostruttore {

	// ATTRIBUTI DELLA CLASSE
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	
	
	// METODI DELLA CLASSE

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



//	SOSTITUITO DA getTotalAccount()
//	public int getSecondDraw() {
//		return secondDraw;
//	}




	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}




	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountSenzaCostruttore bankAccount = new BankAccountSenzaCostruttore();
		
		bankAccount.setBalance(0);
		bankAccount.setFirstDeposit(300);
		bankAccount.setFirstDraw(100);
		bankAccount.setSecondDeposit(50);
		bankAccount.setSecondDraw(10);
		
		System.out.println("SALDO FINALE IN €: " + bankAccount.getTotalAccount());
		
		

	}

}
