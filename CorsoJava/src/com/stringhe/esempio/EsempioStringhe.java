package com.stringhe.esempio;

public class EsempioStringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "---Lorem ipsum dolor sit    ";
		System.out.println("La stringa inserita è lunga: " + txt.length() + " caratteri.");
		System.out.println("La stringa inserita è lunga: " + txt.trim().length() + " caratteri, senza spazi a destra e a sinistra.");
		
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		System.out.println(txt.replace("u", "UUU"));
		System.out.println(txt.toUpperCase().replace("L", "0000000"));

		System.out.println("     ");
		
		String txt2 = "FrancescoVespariNatoACatanzaro";
		//////////////"0123456789";	
		//////////////"123456789";	
		System.out.println("Substring solo begin: " + txt2.substring(4));
		System.out.println("Substring usando indice zero: " + txt2.substring(0));
		System.out.println("Substring usando indice uno: " + txt2.substring(1));
		System.out.println("Substring begin/end: " + txt2.substring(2,7));
		System.out.println("Substring begin/end con zero e uno: " + txt2.substring(0,1));
		System.out.println("Substring begin/end con uno e due: " + txt2.substring(1,2));
		System.out.println("Substring begin/end da 0 a 9: " + txt2.substring(0,9) + " --> restituisce 9 caratteri totali");

		String testo = """
			    Questa è una stringa
			    su più righe
			    in Java 15 o superiore.
			    """;
		
		System.out.println("     ");
		
		System.out.println(testo);
		
		System.out.println("     ");
		
		String txt3 = "FrancescoVespariNatoACatanzaro";
		//////////////"0123456789";	

		System.out.println("Substring begin/end con zero e uno: " + txt3.substring(0,1));
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		StringBuilder txt4 = new StringBuilder("testo di prova da testare");
		txt4.append(" -CON testo alternativo");
		
		System.out.println(txt4);
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		StringBuilder color = new StringBuilder("red");
		color.insert(1, "blue");
		System.out.println(color);
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		StringBuilder car = new StringBuilder("Alfa Romeo");
		car.delete(1, 3);
		System.out.println(car);
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		StringBuilder sport = new StringBuilder("automobilismo");
		sport.reverse();
		System.out.println(sport);
		
	}
	
}