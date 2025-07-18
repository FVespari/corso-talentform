package com.oop.classes.intro;

public class MainArtigiano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// NON DEVO CREARE LA VARIABILE DI TIPO Artigiano IN QUANTO I METODI SONO STATICI NELLA CLASSE Artigiano
		
		Artigiano.setRedditoAnnuoLordo(85000);
		Artigiano.setCoeffRedd(67);
		Artigiano.setImportoInps(3500);
		Artigiano.setAliquotaIrpef(15);
		
		System.out.println("REDDITO MENSILE ANNUO: € " + Artigiano.getRedditoNettoMensile());

	}

}
