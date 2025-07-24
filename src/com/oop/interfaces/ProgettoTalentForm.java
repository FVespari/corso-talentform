package com.oop.interfaces;

public class ProgettoTalentForm implements ISviluppoUxUi, ISviluppoBackend, ISviluppoMobile {

	// Sviluppo Ux-Ui
	private String usingIde;
	private String usingColor;
	private String usingFont;
	private String formatMockup;
	
	// Sviluppo Backend
	private String documentApi;
	private String usingDB;
	private String usingDesignPattern;
	private String usingTechnology;
	private String apiService;
	private String apiServiceEndPoint;
	
	// Sviluppo Mobile
	private String usingComponents;
	private String usingDependencies;
	private boolean usingCleanArchitecture;
	private String releaseApp;
	private String usingTestingApp;
	
	
	
	
	
	
	
	public String getIde() {
		return usingIde;
	}

	public void setIde(String usingIde) {
		this.usingIde = usingIde;
	}

	public String getColor() {
		return usingColor;
	}

	public void setColor(String usingColor) {
		this.usingColor = usingColor;
	}

	public String getFont() {
		return usingFont;
	}

	public void setFont(String usingFont) {
		this.usingFont = usingFont;
	}

	public String getFormatMockup() {
		return formatMockup;
	}

	public void setFormatMockup(String formatMockup) {
		this.formatMockup = formatMockup;
	}

	public String getDocumentApi() {
		return documentApi;
	}

	public void setDocumentApi(String documentApi) {
		this.documentApi = documentApi;
	}

	public String getUsingDB() {
		return usingDB;
	}

	public void setUsingDB(String usingDB) {
		this.usingDB = usingDB;
	}

	public String getUsingDesignPattern() {
		return usingDesignPattern;
	}

	public void setUsingDesignPattern(String usingDesignPattern) {
		this.usingDesignPattern = usingDesignPattern;
	}

	public String getUsingTechnology() {
		return usingTechnology;
	}

	public void setUsingTechnology(String usingTechnology) {
		this.usingTechnology = usingTechnology;
	}

	public String getApiService() {
		return apiService;
	}

	public void setApiService(String apiService) {
		this.apiService = apiService;
	}

	public String getApiServiceEndPoint() {
		return apiServiceEndPoint;
	}

	public void setApiServiceEndPoint(String apiServiceEndPoint) {
		this.apiServiceEndPoint = apiServiceEndPoint;
	}

	public String getUsingComponents() {
		return usingComponents;
	}

	public void setUsingComponents(String usingComponents) {
		this.usingComponents = usingComponents;
	}

	public String getUsingDependencies() {
		return usingDependencies;
	}

	public void setUsingDependencies(String usingDependencies) {
		this.usingDependencies = usingDependencies;
	}

	public boolean isUsingCleanArchitecture() {
		return usingCleanArchitecture;
	}

	public void setUsingCleanArchitecture(boolean usingCleanArchitecture) {
		this.usingCleanArchitecture = usingCleanArchitecture;
	}

	public String getReleaseApp() {
		return releaseApp;
	}

	public void setReleaseApp(String releaseApp) {
		this.releaseApp = releaseApp;
	}

	public String getUsingTestingApp() {
		return usingTestingApp;
	}

	public void setUsingTestingApp(String usingTestingApp) {
		this.usingTestingApp = usingTestingApp;
	}

	
	
	
	
	
		
	@Override
	public String usingComponents() {
		// TODO Auto-generated method stub
		return usingComponents;
	}

	@Override
	public String usingDependencies() {
		// TODO Auto-generated method stub
		return usingDependencies;
	}

	@Override
	public boolean usingCleanArchitecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String releaseApp() {
		// TODO Auto-generated method stub
		return releaseApp;
	}

	@Override
	public String usingTestingApp() {
		// TODO Auto-generated method stub
		return usingTestingApp;
	}

	@Override
	public String documentApi() {
		// TODO Auto-generated method stub
		return documentApi;
	}

	@Override
	public String usingDB() {
		// TODO Auto-generated method stub
		return usingDB;
	}

	@Override
	public String usingDesignPattern() {
		// TODO Auto-generated method stub
		return usingDesignPattern;
	}

	@Override
	public String usingTechnology() {
		// TODO Auto-generated method stub
		return usingTechnology;
	}

	@Override
	public String apiService() {
		// TODO Auto-generated method stub
		return apiService;
	}

	@Override
	public String apiServiceEndPoint() {
		// TODO Auto-generated method stub
		return apiServiceEndPoint;
	}

	@Override
	public String usingIde() {
		// TODO Auto-generated method stub
		return usingIde;
	}

	@Override
	public String usingColor() {
		// TODO Auto-generated method stub
		return usingColor;
	}

	@Override
	public String usingFont() {
		// TODO Auto-generated method stub
		return usingFont;
	}

	@Override
	public String formatMockup() {
		// TODO Auto-generated method stub
		return formatMockup;
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ProgettoTalentForm uxUi = new ProgettoTalentForm();
		uxUi.setIde("Figma");
		uxUi.setColor("Blue");
		uxUi.setFont("Roboto");
		uxUi.setFormatMockup(".pdf");
		
		System.out.println(
				"Sviluppatore Ux Ui task: " + uxUi.usingIde() 
				+ " - " + uxUi.usingColor() 
				+ " - " + uxUi.usingFont() 
				+ " - " + uxUi.formatMockup()
		);
		
		
		
		ProgettoTalentForm backend = new ProgettoTalentForm();
		backend.setIde("Eclipse");
		backend.setDocumentApi("Swagger");
		backend.setUsingTechnology("Spring");
		backend.setApiService("https://api. service. talentform");
		backend.setApiServiceEndPoint("/home");
		backend.setUsingDesignPattern("MVC");
		
		System.out.println(
				"Sviluppatore Backend task: "  + backend.usingIde() 
				+ " - " + backend.documentApi() 
				+ " - " + backend.usingTechnology() 
				+ " - " + backend.apiService() 
				+ " - " + backend.getApiServiceEndPoint()
				+ " - " + backend.getUsingDesignPattern()
		);
		
		
		
		ProgettoTalentForm mobile = new ProgettoTalentForm();
		mobile.setIde("Android Studio");
		mobile.setUsingTechnology("Flutter");
		mobile.setUsingDependencies("Riverpod");
		mobile.setReleaseApp("Android-ioS");
		mobile.setUsingTestingApp("Flutter Test");
		mobile.setUsingComponents("Stateless Widget and StatefulWidget");
		mobile.setUsingCleanArchitecture(true);
		
		System.out.println(
				"Sviluppatore Mobile task: "  + mobile.usingIde() 
				+ " - " + mobile.usingTechnology() 
				+ " - " + mobile.getUsingDependencies()
				+ " - " + mobile.getReleaseApp()
				+ " - " + mobile.getUsingTestingApp() 
				+ " - " + mobile.getUsingComponents()
				+ " - " + mobile.isUsingCleanArchitecture()
		);
		

		
	}

}
