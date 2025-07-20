package com.enumeration.esempio;

import java.util.Scanner;

public class EnumEsempiDue {
	
	enum Taglia {
		SMALL, MEDIUM, LARGE, XLARGE, XXLARGE
	}

	enum Colors {
		BLUE, RED, WHITE, BLACK, BROWN, YELLOW, GREEN, ORANGE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea un array di Taglia enum e stampalo.
		/*
		 * Taglia[] tshirt = { Taglia.SMALL, Taglia.MEDIUM, Taglia.LARGE, Taglia.XLARGE,
		 * Taglia.XXLARGE };
		 * 
		 * for (Taglia i : tshirt) { System.out.println("posizione: " + i.ordinal() +
		 * " - " + i); }
		 */

		/*
		 * Chiedi all'utente di inserire più colori finché non digita "fine", e verifica
		 * se il colore esiste nell'enum.
		 */

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisce un colore: (per usciere digita -fine-)");
		String input;

		do {
			input = tastiera.nextLine().toUpperCase();
			if (input.equals("FINE"))
				break;
			try {
				Colors c = Colors.valueOf(input);
				System.out.println("hai selezionato " + c);
			} catch (IllegalArgumentException e) {
				System.out.println("colore non riconosciuto");
			}

		} while (true);
		tastiera.close();
		
	}

}
