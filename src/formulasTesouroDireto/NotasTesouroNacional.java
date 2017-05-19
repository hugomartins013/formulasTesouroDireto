package formulasTesouroDireto;

public class NotasTesouroNacional {
	public double valorEmissao = 500;
	public double percentualAmortizacao = 0.035;
	public double USSa = 3.22;
	public double USSb = 3.24;
	public double precoUnitarioAmortizacao;
	public double valorLiquidoTitulo;

	
	
	public double valorLiquidoTitulo(double valorEmissao, double percentualAmortizacao) {
		valorLiquidoTitulo = valorEmissao*percentualAmortizacao;
		return valorLiquidoTitulo;
	}

	public double precoUnitarioAmortizacao(double USSa, double USSb, double valorLiquidoTitulo) {
		precoUnitarioAmortizacao = (USSa/USSb)*valorLiquidoTitulo;
		return precoUnitarioAmortizacao;
	}

}
