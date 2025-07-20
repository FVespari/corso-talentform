package com.oop.classes.intro;

public class MainMotorino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorino modelloUno = new Motorino("Rosso", 0.0f, "MBK Booster", false);
		
		System.out.println(modelloUno.toString());
		
		modelloUno.accelera(50.0f);
		
		modelloUno.setAntifurto(true);
		
		modelloUno.accelera(1.0f);
		
		System.out.println(modelloUno.toString());
		
	}

}
