package com.controllo.esempio;

public class EserciziEsempio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int n1 = 10;
        
        if (n1 %2 == 0) {					// MODULO = RESTO DIVISIONE --> 10/2=5 RESTO 0
			System.out.println("pari");
		} else {
			System.out.println("dispari");
		}

        System.out.println("----------------------------------------------------------------------------------");
        
        int anno = 2024;
        
        if((anno %4 == 0 && anno %100 != 0) || (anno %400 == 0)) {
        	System.out.println("Anno bisestile");
        } else {
        	System.out.println(("anno non bisestile"));
        }

        	/*
        	Per determinare se un anno è bisestile, si seguono queste regole: 
        	se l'anno è divisibile per 4, è un anno bisestile; 
        	tuttavia, se l'anno è anche divisibile per 100, non è bisestile a meno che non sia anche divisibile per 400. 
        	In altre parole, un anno è bisestile se è divisibile per 4, ma non per 100, a meno che non sia anche divisibile per 400. 
        	Ad esempio, il 2000 era bisestile perché divisibile per 400, ma il 2100 non lo sarà perché, pur essendo divisibile per 100, 
        	non lo è per 400.
        	*/

        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * DATO UN NUMERO STAMPA DIVISIBILE PER 2 O 3, SOLO PER 2, SOLO PER 3 OPPURE CON NESSUNO
         */
        
        
        int n2 = 12;
        
        if (n2 %2 == 0 && n2 %3 == 0) {
			System.out.println("numero divisibile sia per 2 che per 3");
		} else if (n2 %2 == 0) {
			System.out.println("numero divisibile solo per 2 ma non per 3");
		} else if (n2 %3 == 0){
			System.out.println("numero divisibile solo per 3 ma non per 2");
		} else {
			System.out.println("numero non divisibile per 2 o per 3");
		}
 
        System.out.println("----------------------------------------------------------------------------------");

        /*
         * CONFRONTA TRE NUMERI E STAMPA IL MAGGIORE
         */
        
        int a = 1;
        int b = 3;
        int c = 3;
        
        if (a>=b && a>=c) {
			System.out.println("a " + a + " è il maggiore");
			System.out.println("Il numero maggiore è: " + a);
		} else if (b>=a && b>=c){
			System.out.println("b " + b + " è il maggiore");
			System.out.println("Il numero maggiore è: " + b);
		} else {
			System.out.println("c " + c + " è il maggiore");
			System.out.println("Il numero maggiore è: " + c);
		}
        
        System.out.println("----------------------------------------------------------------------------------");
  
        /*
         * CALCOLA IL PREZZO FINALE CON SCONTO: SE>100€, SCONTO 10%; SE >500€; SCONTO 20%
         */
        
        double prezzo = 650.00;
        double prezzoFinale = 0.00;
        
        if (prezzo > 100 && prezzo < 500) {
        	prezzoFinale = prezzo - (prezzo * 0.10);
        	System.out.println("Prezzo iniziale: " + prezzo + " ### Prezzo finale: " + prezzoFinale);
		} else {
        	prezzoFinale = prezzo - (prezzo * 0.20);
        	System.out.println("Prezzo iniziale: " + prezzo + " ### Prezzo finale: " + prezzoFinale);
		}
       
        // if più efficiente
        if (prezzo > 500) {
        	prezzoFinale = prezzo - (prezzo * 0.20);
        	System.out.println("Prezzo iniziale: " + prezzo + " ### Prezzo finale: " + prezzoFinale);
		} else if (prezzo > 100){
        	prezzoFinale = prezzo - (prezzo * 0.10);
        	System.out.println("Prezzo iniziale: " + prezzo + " ### Prezzo finale: " + prezzoFinale);
		}

        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * VERIFICA SE UNA PASSWORD È LUNGA ALMENO 8 CARATTERI E CONTIENE ALMENE UNA CIFRA
         */
        
        String password = "abcde12345";
        boolean almenoUnaCifra = password.matches(".*\\d.*");
        
        if(password.length() >= 8 && almenoUnaCifra) { // .matches(".*\\d.*") verifica che ci sia almeno una cifra
        	System.out.println("password valida");
        } else {
        	System.out.println("password NON valida");
        }
     
        /*
         * DATO UN NUMERO, STAMPA SE È CIFRA SINGOLA(0-9), A DUE CIFRE O SUPERIORE
         */
        
        int x = 100;
        
        if (x >= 0 && x <= 9) {
        	System.out.println("una cifra");
		} else if (x > 9 && x <= 99 ) {
			System.out.println("due cifre");
		} else {
			System.out.println("più di due cifre");
		}
			
        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * USA UNO SWITCH PER STAMPARE IL NOME DEL MESE E CON IF STAMPA SE HA 31 O 30 GIORNI versione corretta da Danai
         */
        
        int numMese = 3;
        String nomeMese = "";
        //int giorniMese = 0;
        
        switch (numMese) {
		case 1: {
			nomeMese = "Gennaio";
			break;
		}
		case 2: {
			nomeMese = "Febbraio";
			break;
		}
		case 3: {
			nomeMese = "Marzo";
			break;
		}
		case 4: {
			nomeMese = "Aprile";
			break;
		}
		case 5: {
			nomeMese = "Maggio";
			break;
		}
		case 6: {
			nomeMese = "Giugno";
			break;
		}
		case 7: {
			nomeMese = "Luglio";
			break;
		}
		case 8: {
			nomeMese = "Agosto";
			break;
		}
		case 9: {
			nomeMese = "Settembre";
			break;
		}
		case 10: {
			nomeMese = "Ottobre";
			break;
		}
		case 11: {
			nomeMese = "Novembre";
			break;
		}
		case 12: {
			nomeMese = "Dicembre";
			break;
		}
		default:
			nomeMese = "";
		}
        
        if(nomeMese == "Gennaio" || nomeMese == "Marzo"  || nomeMese == "Maggio"  || nomeMese == "Luglio" || nomeMese == "Agosto" || nomeMese == "Ottobre"  || nomeMese == "Dicembre" ) {
        	System.out.println("Il mese di " + nomeMese + " conta 31 giorni");
        } else if (nomeMese == "Aprile"  || nomeMese == "Giugno"  || nomeMese == "Settembre" || nomeMese == "Novembre"){
        	System.out.println("Il mese di " + nomeMese + " conta 30 giorni");
        } else {
        	System.out.println("È stato inserito il mese di Febbraio o un numero meso non valido");
        }
        
        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * USA UNO SWITCH PER STAMPARE IL NOME DEL MESE E CON IF STAMPA SE HA 31 O 30 GIORNI versione TRONCA
         */
        
        switch (numMese) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
			System.out.println("Numero di giorni 31");
			break;
		}
		case 4: case 6: case 9: case 11: {
			System.out.println("Numero di giorni 30");
			break;
		}
		case 2: {
			System.out.println("Numero di giorni 28 o 29");
			break;
		}
		default:
			System.out.println("Mese non valido");
		}

        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * DATO UN VOTO IN LETTERE(A,B,C, ECC..), STAMPA CON SWITCH IL VALORE NUMERICO EQUIVALENTE versione 1
         */
        
        char voto = 'a';
        
        switch (voto) {
		case 'a': {
			System.out.println("Voto 10");
			break;
		}
		case 'b': {
			System.out.println("Voto 8");
			break;
		}
		case 'c': {
			System.out.println("Voto 6");
			break;
		}
		case 'd': {
			System.out.println("Voto 5");
			break;
		}
		default:
			System.out.println("Voto non valido");
			break;
		}
        
        System.out.println("----------------------------------------------------------------------------------");
        
        /*
         * DATO UN VOTO IN LETTERE(A,B,C, ECC..), STAMPA CON SWITCH IL VALORE NUMERICO EQUIVALENTE versione 2
         */
        
        char voto2 = 'x';
        int valVoto = 0;
        
        switch (voto2) {
		case 'a': {
			valVoto = 10;
			System.out.println("Voto: " + valVoto);
			break;
		}
		case 'b': {
			valVoto = 8;
			System.out.println("Voto: " + valVoto);
			break;
		}
		case 'c': {
			valVoto = 6;
			System.out.println("Voto: " + valVoto);
			break;
		}
		case 'd': {
			valVoto = 5;
			System.out.println("Voto: " + valVoto);
			break;
		}
		default:
			System.out.println("Voto non valido");
			break;
		}
        
        System.out.println("----------------------------------------------------------------------------------");

        //Parlando di alberi di Natale...di DANAI
		int height = 10;
		
		
		for (int i = 1; i <= height; i++) {
			
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			
			for (int k= 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println(); //vai alla prossima linea
		}
		
		int trunkWidth = 3;
		int trunkHeight = 3;
		int padding = (2 * height - 1) / 2;
		
		for (int i = 1; i <= trunkHeight; i++) {
			for (int j = 1; j < padding; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= trunkWidth; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
        
        
        
	}

}