package com.oop.classes.intro;

public class MainFreelancerFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FreelancerFV fl = new FreelancerFV();
		
		fl.setRedditoAnnuoLordo(200000);
		fl.setCoeffRedditività(67);
		fl.setAliquotaInps(26);
		fl.setAliquotaIrpef(15);
		
		System.out.println("Reddito mensile netto: " + fl.getStipendioMensileNetto() + " €");

	}

}