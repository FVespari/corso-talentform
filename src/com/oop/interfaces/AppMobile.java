package com.oop.interfaces;

public class AppMobile implements IRequisitiApp, IPreventivo {

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

	public AppMobile(String mockup, String releaseApp, String multiLanguagesApp, String responsiveApp,
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
	public String getApiServiceApp() {
		// TODO Auto-generated method stub
		return apiServiceApp;
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

//		AppMobile am = new AppMobile("Grafiche", "Android - iOS", "Italiano - Inglese", "Mobile - Tablet");
//		
//		System.out.println(am.getMockup());
//		System.out.println(am.getReleaseApp());
//		System.out.println(am.getMultiLanguagesApp());
//		System.out.println(am.getResponsiveApp());
		
		AppMobile am = new AppMobile("Grafiche", "Android-ioS", "Italiano-Inglese", "Mobile-Tablet","https://api.service.com", 15, 4, 6, 10, 5, 250);
		
		System.out.println(am.getMockup());
		System.out.println(am.getReleaseApp());
		System.out.println(am.getMultiLanguagesApp());
		System.out.println(am.getResponsiveApp());
		System.out.println(am.getApiServiceApp());
		System.out.println("Mockup : €" + am.getPriceMockup());
		System.out.println("Responsive : €" + am.getPriceResponsiveApp());
		System.out.println("MultiLanguages : €" + am.getPriceMultiLanguagesApp());
		System.out.println("Api Service : €" + am.getPriceApiServiceApp());
		System.out.println("Release App : €" + am.getPriceReleaseApp());
	
		System.out.println("Totale Preventivo : €" + am.getTotalePreventivo());
		
	}





}
