package formulasTesouroDireto;

public class LFTA extends LFT {

	public static double VE = 0.000001d;
	public static double P = 0.000001d;
	public static double N = 0.000001d;
	public static double TAC = 0.000245d;
	public static double DU = 0.000001d;
	public static double DUT = 0.000001d;
	
	
	@Override
	public double calculaVNA(double vnb, double c){
		return ((c * VE * Math.pow((1 + TAC / 100), DU/DUT)) - 
				(c * VE * Math.pow((1 + TAC), DU/DUT))* 
				(1 / P - N));
	}
		
}
