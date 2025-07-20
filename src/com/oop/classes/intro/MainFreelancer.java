package com.oop.classes.intro;

public class MainFreelancer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Freelancer reddito = new Freelancer(65000, 67, 26, 15);

		System.out.println(reddito.getTassaInps());
		System.out.println(reddito.getTassaIrpef());
		System.out.println(reddito.getUtileTasse());
		System.out.println("REDDITO ANNUO NETTO: " + reddito.getRedditoAnnuoNetto());
		
		
		
	}

}
