package com.oop.classes.intro;

public class MainMotorino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("======================================================================");
		System.out.println("Motorino (padre)");
		System.out.println("======================================================================");
		
		Motorino modelloUno = new Motorino("Rosso", 0.0f, "MBK Booster", false);
		
		System.out.println(modelloUno.toString());
		
		modelloUno.accelera(50.0f);
		
		modelloUno.setAntifurto(true);
		
		modelloUno.accelera(1.0f);
		
		System.out.println(modelloUno.toString());
		
		System.out.println("======================================================================");
		System.out.println("Motorino Immatricolato (figlio)");
		System.out.println("======================================================================");
		
		MotorinoImmatricolato motoImmaUno = new MotorinoImmatricolato("Arancione", 10, "Aprilia RS Replica", false, 150, "CZ 12345");
		
		System.out.println("ToString della classe figlio MotorinoImmatricolato: " + motoImmaUno.toString());
		
		motoImmaUno.accelera(160);
		
		System.out.println("ToString della classe figlio MotorinoImmatricolato dopo prima accelerazione: " + motoImmaUno.toString());
		
		motoImmaUno.setVelocità(60);
		
		System.out.println("ToString della classe figlio MotorinoImmatricolato dopo la decelerazione: " + motoImmaUno.toString());

		motoImmaUno.accelera(25);
		
		System.out.println("ToString della classe figlio MotorinoImmatricolato dopo seconda accelerazione: " + motoImmaUno.toString());
		
		
		
	}

}
