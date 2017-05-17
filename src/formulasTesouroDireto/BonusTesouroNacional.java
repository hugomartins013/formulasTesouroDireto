package formulasTesouroDireto;

public class BonusTesouroNacional {

	public static final double TAXA_REFERENCIAL = 1.1;
	public double valorUnitarioAnt = 10;
	public double valorUnitarioAt;
	public int mesAtualizacao;
	
	
	public double precoUnitario(double valorUnitarioAnt) {
		valorUnitarioAt = TAXA_REFERENCIAL*valorUnitarioAnt;
		return valorUnitarioAt;
	}

}
