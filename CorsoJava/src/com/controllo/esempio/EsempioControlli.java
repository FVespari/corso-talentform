package com.controllo.esempio;

public class EsempioControlli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 9;
		
		if(day == 1) {
			System.out.println("Lunedì");
		} else if (day == 2) {
			System.out.println("Martedì");
		} else if (day == 3) {
			System.out.println("Mercoledì. Resisti! Manca ancora un po' per il fine settimana.");
		} else if (day == 4) {
			System.out.println("È solo Giovedì.");
		} else if (day == 5) {
			System.out.println("It's Friday again!");
		} else if (day == 6 || day == 7) {
			System.out.println("It's Saturday, Sunday, what?");
		} else {
			System.out.println("Day = " + day + " non corrisponde ad un giorno della settimana.");
		}
		
	}

}
