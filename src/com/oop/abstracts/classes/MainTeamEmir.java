package com.oop.abstracts.classes;

public class MainTeamEmir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PreventivoEmir webApp = new PreventivoEmir();

		webApp.setTotaleGiorniAnalista(20);
		webApp.setTotaleGiorniDesignerUiUx(15);
		webApp.setTotaleGiorniDevBackend(90);
		webApp.setTotaleGiorniDevFrontend(30);
		webApp.setTotaleGiorniDevMobile(90);
		webApp.setTotaleGiorniDevOps(10);
		webApp.setTotaleGiorniDba(30);

		webApp.setPrezoGiorniAnalista(200);
		webApp.setPrezoGiorniDesignerUiUx(150);
		webApp.setPrezoGiorniDevBackend(250);
		webApp.setPrezoGiorniDevFrontend(250);
		webApp.setPrezoGiorniDevMobile(250);
		webApp.setPrezoGiorniDevOps(300);
		webApp.setPrezoGiorniDba(350);

		System.out.println("Totale Analista: €" + webApp.getTotaleAnalista());
		System.out.println("Totale Designer: €" + webApp.getTotaleDesignerUiUx());
		System.out.println("Totale DevBack: €" + webApp.getTotaleDevBackend());
		System.out.println("Totale DevFront: €" + webApp.getTotaleDevFrontend());
		System.out.println("Totale DevMobile: €" + webApp.getTotaleDevMobile());
		System.out.println("Totale DevOps: €" + webApp.getTotaleDevOps());
		System.out.println("Totale Ddba: €" + webApp.getTotaleDba());

		System.out.println("----------------------------------------");

		System.out.println("Totale preventivo: €" + webApp.costoProgetto());
		
	}

}
