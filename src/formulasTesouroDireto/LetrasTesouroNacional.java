package formulasTesouroDireto;

public class LetrasTesouroNacional {
	
	public double taxaIndicativa = 10.22;
	public double precoUnitario;
	
	public double precoUnitarioLTN(double taxaIndicativa) {
		precoUnitario = (1000/(Math.pow(1 + taxaIndicativa, 1.0/252.0)));
		return precoUnitario;
	}

}
