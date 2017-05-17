package br.unb.cas.tesouro;

public class NTNB {
	
	public static double VN = 1d;
	public static double IPCAT = 0.000001d;
	public static double IPCAT0 = 0.000001d;
	public static double IPCAT1 = 0.000245d;
	public static double DC = 1d;
	public static double DCT = 1d;
	public static double N = 1d;
	public static double I = 1d;
	public static double DCP = 0.0001d;
	
	public double calculaFator (){
		return (Math.pow((IPCAT1 / IPCAT0), DC / DCT));
	}
	
	public double calculaVNA(){
		return calculaFator() * ((IPCAT / IPCAT0) * VN);
	}
	
	public double calculaFatorJuros(){
		return Math.pow((Math.pow((I / 100) + 1, N / 12)),DCP / DCT);
	}

	public double calculaJuros(){
		return calculaVNA() * (calculaFator() - 1);
	}
}
