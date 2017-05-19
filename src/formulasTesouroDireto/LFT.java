package formulasTesouroDireto;

public class LFT {
	
	private double vnb = 0.000001f;
	public static double N = 1d;
	public static double D = 1d;
	
	public double calculaVNA(double vnb, double c){
		return vnb * c;
	}

	public double getVNB(){
		return vnb;
	}
	
	public double calculaC(double taxaSelic){
		return (N * D *(1 + taxaSelic));
	}
	
	public double calculaTSelic(double tSelick){
		return Math.pow((tSelick / 100f)+1, 1d/252d) - 1;
	}
}
