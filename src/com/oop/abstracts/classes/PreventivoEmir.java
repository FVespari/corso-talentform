package com.oop.abstracts.classes;

public class PreventivoEmir extends ProgettoEmir {
	
	private int totaleGiorniAnalista;
	private int totaleGiorniDesignerUiUx;
	private int totaleGiorniDevFrontend;
	private int totaleGiorniDevBackend;
	private int totaleGiorniDevMobile;
	private int totaleGiorniDevOps;
	private int totaleGiorniDba;

	private int prezoGiorniAnalista;
	private int prezoGiorniDesignerUiUx;
	private int prezoGiorniDevFrontend;
	private int prezoGiorniDevBackend;
	private int prezoGiorniDevMobile;
	private int prezoGiorniDevOps;
	private int prezoGiorniDba;

	@Override
	public int getTotaleAnalista() {
		return totaleGiorniAnalista * prezoGiorniAnalista;
	}

	@Override
	public int getTotaleDesignerUiUx() {
		return totaleGiorniDesignerUiUx * prezoGiorniDesignerUiUx;
	}

	@Override
	public int getTotaleDevFrontend() {
		return totaleGiorniDevFrontend * prezoGiorniDevFrontend;
	}

	@Override
	public int getTotaleDevBackend() {
		return totaleGiorniDevBackend * prezoGiorniDevBackend;
	}

	@Override
	public int getTotaleDevMobile() {
		return totaleGiorniDevMobile * prezoGiorniDevMobile;
	}

	@Override
	public int getTotaleDevOps() {
		return totaleGiorniDevOps * prezoGiorniDevOps;
	}

	@Override
	public int getTotaleDba() {
		return totaleGiorniDba * prezoGiorniDba;
	}

	@Override
	public int costoProgetto() {
		return getTotaleAnalista() + getTotaleDesignerUiUx() + getTotaleDevBackend() + getTotaleDevFrontend()
				+ getTotaleDevMobile() + getTotaleDevOps() + getTotaleDba();
	}

	// setters

	public void setTotaleGiorniAnalista(int totaleGiorniAnalista) {
		this.totaleGiorniAnalista = totaleGiorniAnalista;
	}

	public void setTotaleGiorniDesignerUiUx(int totaleGiorniDesignerUiUx) {
		this.totaleGiorniDesignerUiUx = totaleGiorniDesignerUiUx;
	}

	public void setTotaleGiorniDevFrontend(int totaleGiorniDevFrontend) {
		this.totaleGiorniDevFrontend = totaleGiorniDevFrontend;
	}

	public void setTotaleGiorniDevBackend(int totaleGiorniDevBackend) {
		this.totaleGiorniDevBackend = totaleGiorniDevBackend;
	}

	public void setTotaleGiorniDevMobile(int totaleGiorniDevMobile) {
		this.totaleGiorniDevMobile = totaleGiorniDevMobile;
	}

	public void setTotaleGiorniDevOps(int totaleGiorniDevOps) {
		this.totaleGiorniDevOps = totaleGiorniDevOps;
	}

	public void setPrezoGiorniAnalista(int prezoGiorniAnalista) {
		this.prezoGiorniAnalista = prezoGiorniAnalista;
	}

	public void setPrezoGiorniDesignerUiUx(int prezoGiorniDesignerUiUx) {
		this.prezoGiorniDesignerUiUx = prezoGiorniDesignerUiUx;
	}

	public void setPrezoGiorniDevFrontend(int prezoGiorniDevFrontend) {
		this.prezoGiorniDevFrontend = prezoGiorniDevFrontend;
	}

	public void setPrezoGiorniDevBackend(int prezoGiorniDevBackend) {
		this.prezoGiorniDevBackend = prezoGiorniDevBackend;
	}

	public void setPrezoGiorniDevMobile(int prezoGiorniDevMobile) {
		this.prezoGiorniDevMobile = prezoGiorniDevMobile;
	}

	public void setPrezoGiorniDevOps(int prezoGiorniDevOps) {
		this.prezoGiorniDevOps = prezoGiorniDevOps;
	}

	public void setPrezoGiorniDba(int prezoGiorniDba) {
		this.prezoGiorniDba = prezoGiorniDba;
	}

	public void setTotaleGiorniDba(int totaleGiorniDba) {
		this.totaleGiorniDba = totaleGiorniDba;
	}

}
