package com.controllo.esempio;

import java.util.Scanner;

public class CalcolatriceIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCOLATRICE SVILUPPATA CON IF-ELSE ===");
        System.out.println("Operazioni disponibili: +, -, *, /");
        
        // Input del primo numero da console
        System.out.print("Inserisci il primo numero: ");
        double numero1 = sc.nextDouble();
        
        // Input del segno dell'operazione da console
        System.out.print("Inserisci l'operazione (+, -, *, /): ");
        char operazione = sc.next().charAt(0);
        
        // Input del secondo numero da console
        System.out.print("Inserisci il secondo numero: ");
        double numero2 = sc.nextDouble();
        
        double risultato = 0;
        boolean isOperazioneValid = true;
                
        if(operazione == '+') {
        	risultato = numero1 + numero2;
        } else if(operazione == '-') {
        	risultato = numero1 - numero2;
        } else if(operazione == '*') {
        	risultato = numero1 * numero2;
        } else if(operazione == '/') {
        	if(numero2 == 0) {
        		System.out.println("Non è possibile dividere un numero per zero!");
        	}
        	risultato = numero1 / numero2;
        } else {
        	isOperazioneValid = false;
        	System.out.println("Operazione non consentita");
        }

        if(isOperazioneValid) {
        	System.out.println(numero1 + " " + operazione + " " + numero2 + " = " + risultato);
        }
        
        sc.close();

	}

}
