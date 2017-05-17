package br.unb.cas.tesouro;

public class LFT {
	
	private double vnb = 0.000001f;
	
	public double calculaVNA(double vnb, double c){
		return vnb * c;
	}

	public double getVNB(){
		return vnb;
	}
	
	public double calculaC(double taxaSelic){
		return 1 + taxaSelic ;
	}
	
	public double calculaTSelic(double tSelick){
		return Math.pow((tSelick / 100f)+1, 1d/252d) - 1;
	}
}
