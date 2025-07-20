package com.oop.classes.intro;

public class EmirBank {
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	public int impostaBollo;
	public int canoneAnnuo;
	
	
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
		return getSecondDeposit() - secondDraw;
	}
	
	
	
	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}



	public int getImpostaBollo() {
		return impostaBollo;
	}



	public void setImpostaBollo(int impostaBollo) {
		this.impostaBollo = impostaBollo;
	}



	public int getCanoneAnnuo() {
		return canoneAnnuo;
	}



	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}
	
	
	
	public int getTotalImpostaBollo() {
		return getSecondDraw() - impostaBollo;
	}
	
	
	
	public int getTotalCanonePagamento() {
		return getTotalImpostaBollo() * canoneAnnuo / 100;
	}
	
	
	public int getTotalAccount() {
		return getTotalImpostaBollo() - getTotalCanonePagamento();
	}
	
	
}
