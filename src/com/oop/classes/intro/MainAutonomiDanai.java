package com.oop.classes.intro;

public class MainAutonomiDanai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FreelancerDanai fld = new FreelancerDanai(55000, 67, 26, 15);
		System.out.println("Stipendio Mensile Freelancer: " + fld.getStipendioMensile());
		
		ArtigianoDanai artd = new ArtigianoDanai(75000, 67, 0, 15, 3500, 15000, 24, 0);
		System.out.println("Stipendio Mensile Artigiano: " + artd.getStipendioMensileArtigiano());
		
		CommercianteDanai cmd = new CommercianteDanai(200000, 40, 0, 15, 3500, 15000, 24, 0);
		cmd.stipendioMensileCommerciante();
		
	}

}