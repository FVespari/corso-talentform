package com.oop.classes.intro;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(1500, 160, 20);
		
		System.out.println("Totale stipendio mensile: € " + e.getStipendio());
		System.out.println("Totale ore mensili lavorate: " + e.getOreLavorate());
		System.out.println("Totale retribuzione oraria: " + e.getRetribuzioneOraria());


	}

}
