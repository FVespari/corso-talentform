package com.collections;

import java.util.HashMap;

public class RegioniMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, RegioneModel> regioni = new HashMap<>();
		
		regioni.put("010", new RegioneModel("PIEMONTE", 45.073, 7.680));
		regioni.put("020", new RegioneModel("VALLE D'OSTA", 45.737, 7.320));
		regioni.put("030", new RegioneModel("LOMBARDIA", 45.466, 9.190));
		regioni.put("041", new RegioneModel("PROVINCIA AUTONOMA BOLZANO", 46.498, 11.354));
		regioni.put("042", new RegioneModel("PROVINCIA AUTONOMA TRENTO", 46.066, 11.121));
		regioni.put("050", new RegioneModel("VENETO", 45.438, 12.327));
		regioni.put("060", new RegioneModel("FRIULI-VENEZIA GIULIA", 45.649, 13.776));
		regioni.put("070", new RegioneModel("LIGURIA", 44.405, 8.933));
		regioni.put("080", new RegioneModel("EMILIA-ROMAGNA", 44.494, 11.342));
		regioni.put("090", new RegioneModel("TOSCANA", 43.771, 11.255));
		regioni.put("100", new RegioneModel("UMBRIA", 43.112, 12.389));
		regioni.put("110", new RegioneModel("MARCHE", 43.617, 13.518));
		regioni.put("120", new RegioneModel("LAZIO", 41.893, 12.483));
		regioni.put("130", new RegioneModel("ABRUZZO", 42.351, 13.398));
		regioni.put("140", new RegioneModel("MOLISE", 41.561, 14.659));
		regioni.put("150", new RegioneModel("CAMPANIA", 40.851, 14.268));
		regioni.put("160", new RegioneModel("PUGLIA", 41.117, 16.871));
		regioni.put("170", new RegioneModel("BASILICATA", 40.639, 15.805));
		regioni.put("180", new RegioneModel("CALABRIA", 38.905, 16.594));
		regioni.put("190", new RegioneModel("SICILIA", 37.507, 14.507 ));
		regioni.put("200", new RegioneModel("SARDEGNA", 39.223, 9.121));

		for (String codReg : regioni.keySet()) {
			System.out.println("Codice Regione: " + codReg + " = " + regioni.get(codReg));
		}
		
	}

}
