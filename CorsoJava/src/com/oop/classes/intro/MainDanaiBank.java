package com.oop.classes.intro;

public class MainDanaiBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DanaiBank dbConto = new DanaiBank(500, 200, 100, 100, 200, 300, 300, 35, 10);
		
		System.out.println("Total account first deposit: " + dbConto.getFirstDeposit());
		System.out.println("Total account first draw: " + dbConto.getFirstDraw());
		
		System.out.println("Total account second deposit: " + dbConto.getSecondDeposit());
		System.out.println("Total account second draw: " + dbConto.getSecondDraw());
		
		System.out.println("Total account third deposit: " + dbConto.getThirdDeposit());
		System.out.println("Total account third draw: " + dbConto.getThirdDraw());
		
		System.out.println("Total account after imposta bollo: " + dbConto.getImpostaBollo());
		System.out.println("Total account after canone annuo: " + dbConto.getCanoneAnnuo());
		
		System.out.println("Total account: " + dbConto.getTotalAccount());
	}

}
