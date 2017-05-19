package formulasTesouroDireto;


public class BonusTesouroNacional {
	public double taxaReferencial = 1.1;
	public double taxaJuros = 0.06;
	public double juros;
	public double valorUnitarioAnt = 10;
	public double valorUnitarioAt = 11;
	public int mesAtualizacao = 6;
	public double fatorJuros;
	public int quantidade = 5;
	public double valorPrincipal;
	
	public double precoUnitario(double valorUnitarioAnt) {
		valorUnitarioAt = taxaReferencial*valorUnitarioAnt;
		return valorUnitarioAt;
	}

	public double fatorJuros(double taxaJuros, double mesAtualizacao) {
		fatorJuros = (Math.pow((1+ (taxaJuros/100)), (mesAtualizacao/12)) -1);
		return fatorJuros;
	}
	
	public double juros(double fatorJuros, double valorUnitarioAt) {
		juros = fatorJuros * valorUnitarioAt;
		return juros;
	}
	
	public double valorPrincipal(double valorUnitarioAt, double quantidade) {
		valorPrincipal = valorUnitarioAt * quantidade;
		return valorPrincipal;
	}
	
}
