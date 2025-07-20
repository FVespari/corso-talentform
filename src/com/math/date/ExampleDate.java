package com.math.date;

//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;

import java.time.*;
import java.time.temporal.*;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

public class ExampleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data odierna
		
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);
				
		System.out.println("---------------------------------------------");
		
		// Crea e stampa una data: 1 gennaio 2025.
		
		LocalDate data = LocalDate.of(2025, 1, 1);
		System.out.println(data);
		
		System.out.println("---------------------------------------------");

		// Aggiungi 30 giorni alla data corrente e stampa la nuova data.

		LocalDate future = oggi.plusDays(30);
		System.out.println("Data tra 30 giorni: " + future);
		
		System.out.println("---------------------------------------------");

		// Stampa il numero di giorni tra oggi e il 25 dicembre 2025.

		LocalDate today = LocalDate.now();
		LocalDate christmas = LocalDate.of(2025, 12, 25);
		long giorniMancantiANatale= ChronoUnit.DAYS.between(today,christmas);
		System.out.println("Mancano " + giorniMancantiANatale + " giorni a Natale");

		System.out.println("---------------------------------------------");
		
		// Controlla se il 1 gennaio 2000 è una data passata.
		
		LocalDate oggiOggi = LocalDate.now();
		LocalDate dataDaTestare = LocalDate.of(2020, 1, 1);
		boolean dataNelPassato = dataDaTestare.isBefore(oggiOggi);
		System.out.println("01/01/2020 è nel passato? " + dataNelPassato);
		
		//		long differenzaGiorni = ChronoUnit.DAYS.between(oggiOggi,dataDaTestare);
		
		//System.out.println(differenzaGiorni);
		
		//		if(differenzaGiorni < 0) {
		//			System.out.println(dataDaTestare + " è una data passata");
		//		} else {
		//			System.out.println(dataDaTestare + " è una data futura");
		//		}
		
		System.out.println("---------------------------------------------");
		
		//Stampa l’anno, il mese e il giorno dalla data di oggi.
		
		LocalDate oggiToday = LocalDate.now();
		System.out.println("Giorno: " + oggiToday.getYear());
		System.out.println("Mese: " + oggiToday.getMonth());
		System.out.println("Mese: " + oggiToday.getMonthValue());
		System.out.println("Anno: " + oggiToday.getDayOfMonth());
		
		System.out.println("---------------------------------------------");
		
		//Controlla se l’anno della data odierna è bisestile.
		
		LocalDate oja = LocalDate.now();
		boolean annoBisesto = oja.isLeapYear();
		System.out.println("L'anno " + oja.getYear() + " è bisestile? " + annoBisesto);
		
		System.out.println("---------------------------------------------");
		
		//Dalla data di nascita 2000-04-15, calcola l’età attuale.
		
		LocalDate dataNascita = LocalDate.of(2004, 4, 15);
		LocalDate oggiNow = LocalDate.now();
		Period eta = Period.between(dataNascita, oggiNow);
		System.out.println("Età: " + eta.getYears() + " anni.");
		
		System.out.println("---------------------------------------------");
		
		//Stampa il giorno della settimana per il 4 luglio 2025.
		
		LocalDate dataInIngresso = LocalDate.of(2025, 7, 4);
		DayOfWeek giornoSettimana = dataInIngresso.getDayOfWeek();
		System.out.println("Il " + dataInIngresso + " era:" + giornoSettimana);
		
		System.out.println("---------------------------------------------");
		
		//Stampa oggi e i prossimi 4 giorni consecutivi.
		
		LocalDate consecutivi = LocalDate.now();
		
		for (int giorniConsetutivi = 0; giorniConsetutivi < 5; giorniConsetutivi++) {
			System.out.println(consecutivi.plusDays(giorniConsetutivi));
		}
		
		System.out.println("---------------------------------------------");
		
		//Stampa la data e l’ora correnti usando LocalDateTime

		LocalDateTime dataOraNow = LocalDateTime.now();
		System.out.println("Data e ora attuali: " + dataOraNow);
		
		System.out.println("---------------------------------------------");
		
		//Aggiungi 2 ore e 30 minuti alla data corrente utilizzando LocalDateTime
		
		LocalDateTime adesso = LocalDateTime.now();
		LocalDateTime sommaOreMinuti = adesso.plusHours(2).plusMinutes(30);
		System.out.println("Ora attuale: " + adesso);
		System.out.println("2 ore e 30 minuti dopo adesso: " + sommaOreMinuti);
		
		System.out.println("---------------------------------------------");
		
		//Calcola i minuti tra 14:15 e 16:45.
		
		long minuti = ChronoUnit.MINUTES.between(LocalTime.of(14,15), LocalTime.of(16,45));
		System.out.println("Minuti trascorsi: " + minuti);
		
		System.out.println("---------------------------------------------");
		
		//Formatta la data 2025-03-10 nel formato 10/03/2025.
		
		LocalDate date = LocalDate.of(2025,03,10);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("La data 2025-03-10 nel formato italiano: " + date.format(formatter));

		System.out.println("---------------------------------------------");
		
		//Trova il numero di giorni tra 2025-01-01T00:00 e la data corrente.

		LocalDateTime dataOrario = LocalDateTime.of(2025, 01, 01, 0, 0);
		LocalDateTime dataOraAdesso =  LocalDateTime.now();
		long giorni = ChronoUnit.DAYS.between(dataOrario, dataOraAdesso);
		System.out.println("Il numero di giorni tra 2025-01-01T00:00 e oggi è: " + giorni);

		System.out.println("---------------------------------------------");
		
		//Stampa il nome del mese corrente in italiano (maiuscolo).

		String meseItaliano = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
		System.out.println("Siamo nel mese di: " + meseItaliano.toUpperCase());

		System.out.println("---------------------------------------------");
		
		//Calcola la differenza tra 2000-04-01 e oggi in anni e mesi.

		LocalDate dataScelta = LocalDate.of(2000, 04, 01);
		LocalDate dataTodayOggi = LocalDate.now();
		Period anniMesiGiorniBetween = Period.between(dataScelta, dataTodayOggi);
		System.out.println(anniMesiGiorniBetween);
		System.out.println("Differenza in anni/mesi: " + anniMesiGiorniBetween.getYears() + " anni e " + anniMesiGiorniBetween.getMonths() + " mesi");

		System.out.println("---------------------------------------------");
		
		//Mostra l’ora attuale a Tokyo usando ZonedDateTime.
		
		ZonedDateTime oraTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Data-Ora di Tokio: " + oraTokyo);
		System.out.println("Ora di Tokio: " + oraTokyo.toLocalTime());
		
		ZonedDateTime oraNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Data-Ora di Tokio: " + oraNewYork);
		System.out.println("Ora di NewYork: " + oraNewYork.toLocalTime());

		System.out.println("---------------------------------------------");
		
		//Stampa l’ultimo giorno del mese in corso.
		
		LocalDate questoGiorno = LocalDate.now();
		LocalDate ultimoDelMese = questoGiorno.withDayOfMonth(questoGiorno.lengthOfMonth());
		System.out.println("Ultimo giorno del mese attuale: " + ultimoDelMese);

		System.out.println("---------------------------------------------");
		
		//Dato un giorno qualsiasi, trova il giorno lavorativo successivo (lunedì-venerdì).
				
		LocalDate questoGiornoQui = LocalDate.of(2025, 07, 11);
		LocalDate prossimoGiornoLavorativo = LocalDate.of(2025, 07, 11);
				
		do {
			prossimoGiornoLavorativo = prossimoGiornoLavorativo.plusDays(1);
		} while (prossimoGiornoLavorativo.getDayOfWeek() == DayOfWeek.SATURDAY || prossimoGiornoLavorativo.getDayOfWeek() == DayOfWeek.SUNDAY);
				
		System.out.println("Il prossimo giorno lavorativo dopo il " + questoGiornoQui + " è: " + prossimoGiornoLavorativo);

		System.out.println("---------------------------------------------");
		
		//Trova la differenza in ore tra Roma e New York in questo momento.
		
		ZonedDateTime roma = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		long differenza = ChronoUnit.HOURS.between(roma, newYork);
		
		System.out.println("La differenza in ore tra Roma e New_York è: " + differenza);
		
		System.out.println("---------------------------------------------");
		
		//Trova la differenza in ore tra Roma e New York in questo momento
		
//				Instant now = Instant.now();
//
//		        ZonedDateTime newYork = now.atZone(ZoneId.of("America/New_York"));
//		        ZonedDateTime roma = now.atZone(ZoneId.of("Europe/Rome"));
//		        
//		        ZoneOffset offsetNewYork = newYork.getOffset();
//		        ZoneOffset offsetRoma = roma.getOffset();
//		            
//		        int differenza = offsetRoma.getTotalSeconds() / 3600 - offsetNewYork.getTotalSeconds() / 3600;
//		        
//		        System.o
//		System.out.println("La differenza in ore tra Roma e New York è " + differenza);
//		//import java.time.ZoneOffset;
		

	}

}
