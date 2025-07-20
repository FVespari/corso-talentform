package com.oop.classes.intro;

public class MainMacchina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=============================================================");
		System.out.println("=============================================================");
		System.out.println("=============================================================");

		Car lanciaDelta = new Car(1, 6);
		System.out.println(lanciaDelta.toString());
		lanciaDelta.addGas(45);
		lanciaDelta.calcolaConsumo(100);
		System.out.println(lanciaDelta.toString());
		
		System.out.println("=============================================================");
		System.out.println("=============================================================");
		System.out.println("=============================================================");

		Car ferrariRoma = new Car(1, 3);
		System.out.println(ferrariRoma.toString());
		ferrariRoma.addGas(45);
		ferrariRoma.calcolaConsumo(100);
		System.out.println(ferrariRoma.toString());
		
		
		
		System.out.println("======================P=R=O=V=A===================");

		

	}

}
