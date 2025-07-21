package com.oop.classes.intro;

public class MainAutonomi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HR hrUno = new HR(56000, 67, 26, 15);
		System.out.println(hrUno.getStipendioMensile());
		
		MobileDeveloper md = new MobileDeveloper(67000, 67, 26, 15, "Flutter");
		System.out.println(md.getStipendioMensile());


	}

}
