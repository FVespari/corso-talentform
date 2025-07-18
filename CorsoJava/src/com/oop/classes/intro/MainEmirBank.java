package com.oop.classes.intro;

public class MainEmirBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmirBank ebUno = new EmirBank();
		
		ebUno.setBalance(500);
		ebUno.setFirstDeposit(200);
		ebUno.setFirstDraw(100);
		ebUno.setSecondDeposit(300);
		ebUno.setSecondDraw(300);
		ebUno.setImpostaBollo(35);
		ebUno.setCanoneAnnuo(5);
		
		System.out.println("Total account first deposit: " + ebUno.getFirstDeposit());
		System.out.println("Total account after first draw: " + ebUno.getFirstDraw());
		
		System.out.println("Total account second deposit: " + ebUno.getSecondDeposit());
		System.out.println("Total account after second draw: " + ebUno.getSecondDraw());
		
		System.out.println("Total canone annuo: " + ebUno.getTotalCanonePagamento());
		
		System.out.println("Total account: " + ebUno.getTotalImpostaBollo());
		
		System.out.println("Total account meno imposta bollo: " + ebUno.getTotalAccount());

	}

}