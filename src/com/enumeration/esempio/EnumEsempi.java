package com.enumeration.esempio;

/*
		Esercizi Enums:
		
		1- Crea un enum chiamato Giorno con i giorni della settimana. Stampa tutti i valori usando un ciclo for.
		2- Crea un enum Stagione con quattro valori. Usa switch per stampare un messaggio diverso per ogni stagione.
		3- Chiedi all’utente il giorno della settimana e verifica se è lavorativo.
		4- Confronta due valori di un enum Livello.
		5- Stampa tutti i nomi e le posizioni (ordinal) di un enum Taglia.
		6- Crea un array di Taglia enum e stampalo.
		7- Chiedi all'utente di inserire più colori finché non digita "fine", e verifica se il colore esiste nell'enum.
 */

public class EnumEsempi {
	
	enum Days {
		LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
	}

	enum Seasons {
		SPRING, SUMMER, AUTUMN, WINTER
	}

	enum Livello {
		BASE, INTERMEDIO, AVANZATO
	}

	enum Taglia {
		SMALL, MEDIUM, LARGE, XLARGE, XXLARGE
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un enum chiamato Giorno con i giorni della settimana. Stampa tutti i
		 * valori usando un ciclo for.
		 */

		for (Days days : Days.values()) {
			System.out.print(days + "/");
		}

		System.out.println("");

		/*
		 * Crea un enum Stagione con quattro valori. Usa switch per stampare un
		 * messaggio diverso per ogni stagione.
		 */

		System.out.println("----------------------------------------------");
		Seasons seasons = Seasons.SUMMER;

		switch (seasons) {
		case SPRING:
			System.out.println("ci sono i fiori");
			break;
		case SUMMER:
			System.out.println("fa tanto caldo");
			break;
		case AUTUMN:
			System.out.println("le foglie cadono");
			break;
		case WINTER:
			System.out.println("fa freddo");
			break;
		default:
			System.out.println("invalid option");
		}

		System.out.println("----------------------------------------------");
		/*
		 * Chiedi all’utente il giorno della settimana e verifica se è lavorativo.
		 */
		/*
		 * Scanner tastiera = new Scanner(System.in);
		 * System.out.println("Inserisce un giorno della settimana:"); String giorno =
		 * tastiera.nextLine();
		 * 
		 * try { Days day = Days.valueOf(giorno); if (day == Days.SABATO || day ==
		 * Days.DOMENICA) { System.out.println("È weekend."); } else {
		 * System.out.println("È un giorno lavorativo."); } } catch
		 * (IllegalArgumentException e) { System.out.println("Giorno non valido."); }
		 */

		System.out.println("----------------------------------------------");
		/*
		 * Confronta due valori di un enum Livello.
		 */
		Livello sette = Livello.INTERMEDIO;
		Livello dieci = Livello.AVANZATO;

		if (sette.ordinal() < dieci.ordinal()) {
			System.out.println(sette + " è inferiore a: " + dieci);
		}

		System.out.println("----------------------------------------------");
		/*
		 * Stampa tutti i nomi e le posizioni (ordinal) di un enum Taglia.
		 */
		for (Taglia taglia : Taglia.values()) {
			System.out.println(taglia + " - posizione: " + taglia.ordinal());
		}	
		
	}

}
