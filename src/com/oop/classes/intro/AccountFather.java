package com.oop.classes.intro;

public class AccountFather {

	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	
	
	
	public AccountFather(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
	}



	public int getFirstDeposit() {
		return balance + firstDeposit;
	}
	
	
	
	public int getFirstDraw() {
		return getFirstDeposit() + firstDraw;
	}
	
	
	
	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}
	
	
	
	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
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



	class AccountSon extends AccountFather {
		
		private String nameAccount;

		public AccountSon(String nameAccount, int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
			super(balance, firstDeposit, firstDraw, secondDeposit, secondDraw);
			this.nameAccount = nameAccount;
		}
	
		@Override
		public int getFirstDeposit() {
			return balance + firstDeposit;
		}
		
		@Override
		public int getFirstDraw() {
			return getFirstDeposit() + firstDraw;
		}
		
		@Override
		public int getSecondDeposit() {
			return getFirstDraw() + secondDeposit;
		}
		
		@Override
		public int getTotalAccount() {
			return getSecondDeposit() - secondDraw;
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountFather f = new AccountFather(0, 600, 50, 100, 50);

		System.out.println(f.getTotalAccount());

	}

	
	
}









