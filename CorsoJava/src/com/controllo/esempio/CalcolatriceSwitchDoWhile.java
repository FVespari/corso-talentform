package com.controllo.esempio;

import java.util.Scanner;

public class CalcolatriceSwitchDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);		

        while (true) {
            System.out.print("Inserisci l'operazione (+, -, *, /) oppure 'e' per uscire: ");
            char operazione = sc.next().charAt(0);

            if (operazione == 'e' || operazione == 'E') {
                System.out.println("Uscita dal programma. Arrivederci!");
                break;
            }

            // Controllo se l'operazione è valida
            if (operazione != '+' && operazione != '-' && operazione != '*' && operazione != '/') {
                System.out.println("Operazione non valida. Usa solo +, -, *, / o 'e' per uscire.");
                continue;
            }

            // Inserimento dei numeri
            System.out.print("Inserisci il primo numero: ");
            double numero1 = sc.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            double numero2 = sc.nextDouble();

            double risultato = 0;
            boolean operazioneValida = true;

            switch (operazione) {
                case '+':
                    risultato = numero1 + numero2;
                    break;
                case '-':
                    risultato = numero1 - numero2;
                    break;
                case '*':
                    risultato = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        risultato = numero1 / numero2;
                    } else {
                        System.out.println("Errore: divisione per zero non consentita.");
                        operazioneValida = false;
                    }
                    break;
            }

            if (operazioneValida) {
                System.out.println("Risultato: " + risultato);
            }
        }

        sc.close();
        
	}

}





