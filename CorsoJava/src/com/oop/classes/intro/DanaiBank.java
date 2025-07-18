package com.oop.classes.intro;

public class DanaiBank {
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	public int thirdDeposit;
	public int thirdDraw;
	public int impostaBollo;
	public int canoneAnnuo;
	
	
	
	public DanaiBank(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw, int thirdDeposit,
			int thirdDraw, int impostaBollo, int canoneAnnuo) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.thirdDeposit = thirdDeposit;
		this.thirdDraw = thirdDraw;
		this.impostaBollo = impostaBollo;
		this.canoneAnnuo = canoneAnnuo;
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



	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}



	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}



	public int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}



	public int getThirdDeposit() {
		return getSecondDraw() + thirdDeposit;
	}



	public int getThirdDraw() {
		return getThirdDeposit() - thirdDraw;
	}



	public int getImpostaBollo() {
		return getThirdDraw() - impostaBollo;
	}



	public int getCanoneAnnuo() {
		return getImpostaBollo() * canoneAnnuo / 100;
	}
	
	
	
	public int getTotalAccount() {
		return getImpostaBollo() - getCanoneAnnuo();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
