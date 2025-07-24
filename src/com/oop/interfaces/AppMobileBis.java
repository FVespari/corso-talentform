package com.oop.interfaces;

public class AppMobileBis extends PreventivoAbstract implements IRequisitiApp {

	private String mockup;
	private String releaseApp;
	private String multiLanguagesApp;
	private String responsiveApp;
	private String apiServiceApp;
	private int giornateMockup;
	private int giornateReleaseApp;
	private int giornateResponsiveApp;
	private int giornateMultiLanguagesApp;
	private int giornateApiServiceApp;
	private int tariffaGiornaliera;
	
	

	
	
	
		
	public AppMobileBis(String mockup, String releaseApp, String multiLanguagesApp, String responsiveApp,
			String apiServiceApp, int giornateMockup, int giornateReleaseApp, int giornateResponsiveApp,
			int giornateMultiLanguagesApp, int giornateApiServiceApp, int tariffaGiornaliera) {
		super();
		this.mockup = mockup;
		this.releaseApp = releaseApp;
		this.multiLanguagesApp = multiLanguagesApp;
		this.responsiveApp = responsiveApp;
		this.apiServiceApp = apiServiceApp;
		this.giornateMockup = giornateMockup;
		this.giornateReleaseApp = giornateReleaseApp;
		this.giornateResponsiveApp = giornateResponsiveApp;
		this.giornateMultiLanguagesApp = giornateMultiLanguagesApp;
		this.giornateApiServiceApp = giornateApiServiceApp;
		this.tariffaGiornaliera = tariffaGiornaliera;
	}
	
	

	
	
	
	
	@Override
	public String getApiServiceApp() {
		// TODO Auto-generated method stub
		return apiServiceApp;
	}

	@Override
	public String getMockup() {
		// TODO Auto-generated method stub
		return mockup;
	}

	@Override
	public String getReleaseApp() {
		// TODO Auto-generated method stub
		return releaseApp;
	}

	@Override
	public String getMultiLanguagesApp() {
		// TODO Auto-generated method stub
		return multiLanguagesApp;
	}

	@Override
	public String getResponsiveApp() {
		// TODO Auto-generated method stub
		return responsiveApp;
	}

	@Override
	public int getPriceMockup() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateMockup;
	}

	@Override
	public int getPriceReleaseApp() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateReleaseApp;
	}

	@Override
	public int getPriceResponsiveApp() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateResponsiveApp;
	}

	@Override
	public int getPriceMultiLanguagesApp() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateMultiLanguagesApp;
	}

	@Override
	public int getPriceApiServiceApp() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateApiServiceApp;
	}
	
	public int getTotalePreventivo() {
		return getPriceResponsiveApp() + getPriceMockup() + getPriceReleaseApp() + getPriceApiServiceApp() + getPriceMultiLanguagesApp();
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppMobileBis mobile = new AppMobileBis("Grafiche", "Android-ioS", "Italiano-Inglese", "Mobile-Tablet","https://api.service.com", 15, 4, 6, 10, 5, 250);
		
		System.out.println(mobile.getMockup());
		System.out.println(mobile.getReleaseApp());
		System.out.println(mobile.getMultiLanguagesApp());
		System.out.println(mobile.getResponsiveApp());
		System.out.println(mobile.getApiServiceApp());
		System.out.println("Mockup : € " + mobile.getPriceMockup());
		System.out.println("Responsive : € " + mobile.getPriceResponsiveApp());
		System.out.println("MultiLanguages : € " + mobile.getPriceMultiLanguagesApp());
		System.out.println("Api Service : € " + mobile.getPriceApiServiceApp());
		System.out.println("Release App : € " + mobile.getPriceReleaseApp());
	
		System.out.println("Totale Preventivo : € " + mobile.getTotalePreventivo());
		
	}

}
