package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.BonusTesouroNacional;
import formulasTesouroDireto.NotasTesouroNacional;

public class TestNotasTesouroNacional {
	
	private NotasTesouroNacional valorUnitario;
	public static double FORMATER_6 = 0.000001d;
	
	@Before
	public void setUp() throws Exception {
		valorUnitario = new NotasTesouroNacional();
	}
	
	@Test
	public void testEqualsValorLiquidoTitulo() {
		double valorLiquidoTitulo = valorUnitario.valorLiquidoTitulo(500.0, 0.035);
		assertEquals(11, valorLiquidoTitulo, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorLiquidoTitulo() {
		double valorLiquidoTitulo = valorUnitario.valorLiquidoTitulo(500.0, 0.035);
		assertNotEquals(10, valorLiquidoTitulo, FORMATER_6);
	}
	
	@Test
	public void testEqualsPrecoUnitarioAmortizacao() {
		double precoUnitarioAmortizacao = valorUnitario.precoUnitarioAmortizacao(3.22, 3.24, 17.5);
		assertEquals(11, precoUnitarioAmortizacao, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsPrecoUnitarioAmortizacao() {
		double precoUnitario = valorUnitario.precoUnitarioAmortizacao(3.22, 3.24, 17.5);
		assertNotEquals(10, precoUnitario, FORMATER_6);
	}

}
