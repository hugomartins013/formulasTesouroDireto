package formulasTesouroDireto;

public class NotasTesouroNacional {
	public double valorEmissao = 500;
	public double percentualAmortizacao = 0.035;
	public double USSa = 3.22;
	public double USSb = 3.24;
	public double precoUnitarioAmortizacao;
	public double valorLiquidoTitulo;
	public int dataPagamentoAtual = 130;
	public int dataPagamentoAnterior = 30;
	public double taxaJuros = 0.06;
	public int mesJuros = 6;
	public double fatorJurosNTN;
	public double jurosNTN;
	public double valorNominalAtualizadoNTN;
	public double jurosVNA;
	public double fatorJurosVNA;

	
	
	public double valorLiquidoTitulo(double valorEmissao, double percentualAmortizacao) {
		valorLiquidoTitulo = valorEmissao*percentualAmortizacao;
		return valorLiquidoTitulo;
	}

	public double precoUnitarioAmortizacao(double USSa, double USSb, double valorLiquidoTitulo) {
		precoUnitarioAmortizacao = (USSa/USSb)*valorLiquidoTitulo;
		return precoUnitarioAmortizacao;
	}

	public double fatorJurosNTN(int dataPagamentoAtual, int dataPagamentoAnterior, double taxaJuros) {
		fatorJurosNTN = (dataPagamentoAtual - dataPagamentoAnterior)/360.0 - (taxaJuros/100.0);
		return fatorJurosNTN;
	}

	public double jurosNTN(double precoUnitarioAmortizacao, double fatorJurosNTN) {
		jurosNTN = precoUnitarioAmortizacao * fatorJurosNTN;
		return jurosNTN;
	}

	public double valorNominalAtualizadoNTN(double USSa, double USSb) {
		valorNominalAtualizadoNTN = (USSa/USSb)*1000;
		return valorNominalAtualizadoNTN;
	}

	public double jurosVNA(double valorNominalAtualizadoNTN, double fatorJurosNTN) {
		jurosVNA = valorNominalAtualizadoNTN * fatorJurosNTN;
		return jurosVNA;
	}

	public double fatorJurosVNA(int taxaJuros, double mesJuros) {
		fatorJurosVNA = ((taxaJuros/100.0)*(mesJuros/12.0));
		return fatorJurosVNA;
	}


}
