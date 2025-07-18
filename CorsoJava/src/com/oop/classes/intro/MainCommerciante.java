package com.oop.classes.intro;

public class MainCommerciante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Commerciante reddito = new Commerciante();
		
		reddito.setRedditoAnnuoLordo(125000);
		reddito.setCoeffRedd(40);
		reddito.setTassaInps(3500);
		reddito.setTassaIrpef(15);
		
		System.out.println("REDDITO MENSILE ANNUO: € " + reddito.getRedditoNettoMensile());
		
		
		
	}

}