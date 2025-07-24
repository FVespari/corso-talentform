package com.regular.expression;

import java.util.regex.Pattern;

public class PatternEsempio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("\\d");

		String elenco = "1. Juventus, 2. Roma, 3. Napoli, 4. Atalanta, 5. Lazio";

		String[] elencoArray = p.split(elenco);
		
		for (int i = 1; i < elencoArray. length; i++) {
			System. out.println(i + elencoArray[i].replaceAll(",", ""));
		}
		
		// Scrivi un'espressione regolare per verificare se una stringa contiene solo lettere (maiuscole e minuscole).
		
		String stringaDaVerificare = "QWErty";
		System.out.println(stringaDaVerificare.matches("[a-zA-Z]+$"));

		
		// Controlla se una stringa contiene solo cifre numeriche.
        
		String nome = "12233445";
		System.out.println(nome.matches("\\d+$"));
		
		// Verifica se una stringa è un'email valida del tipo nome@dominio.com.
		
		String email = "nome@dominio.com";
		System.out.println(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$"));
		System.out.println(email.matches("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}"));
		
		//Verifica se una password contiene almeno una maiuscola, una minuscola, un numero e almeno 8 caratteri.
		
		System.out.println("verifica password:");
		String passwordEsempio = "1Av-8%io";
		System.out.println(passwordEsempio.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,})"));
		
		System.out.println("==================================================================================");

		System.out.println("verifica password (Danai):");
		String passwordDanai = "AfghAPS7";
		boolean regexDanai = passwordDanai.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
		System.out.println(regexDanai);

		
		
	}

}
