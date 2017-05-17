package formulasTesouroDireto;


public class BonusTesouroNacional {
	public static final double TAXA_REFERENCIAL = 1.1;
	public static final double TAXA_JUROS = 0.6;
	public double valorUnitarioAnt = 10;
	public int mesAtualizacao = 6;
	public double valorUnitarioAt;
	public double fatorJuros;
	public double juros;
	
	public double precoUnitario(double valorUnitarioAnt) {
		valorUnitarioAt = TAXA_REFERENCIAL*valorUnitarioAnt;
		return valorUnitarioAt;
	}

	public double fatorJuros() {
		fatorJuros = (Math.pow((1+ (TAXA_JUROS/100)), (mesAtualizacao/12)) -1);
		return fatorJuros;
	}
	
	public double juros(double fatorJuros, double valorUnitarioAt) {
		juros = fatorJuros * valorUnitarioAt;
		return juros;
	}
	
}
