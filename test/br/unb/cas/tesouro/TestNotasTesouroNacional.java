package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
		assertEquals(17.5, valorLiquidoTitulo, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorLiquidoTitulo() {
		double valorLiquidoTitulo = valorUnitario.valorLiquidoTitulo(500.0, 0.035);
		assertNotEquals(10, valorLiquidoTitulo, FORMATER_6);
	}
	
	@Test
	public void testEqualsPrecoUnitarioAmortizacao() {
		double precoUnitarioAmortizacao = valorUnitario.precoUnitarioAmortizacao(3.22, 3.24, 17.5);
		assertEquals(17.391975, precoUnitarioAmortizacao, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsPrecoUnitarioAmortizacao() {
		double precoUnitario = valorUnitario.precoUnitarioAmortizacao(3.22, 3.24, 17.5);
		assertNotEquals(20, precoUnitario, FORMATER_6);
	}
	
	@Test
	public void testEqualsFatorJurosNTN() {
		double fatorJurosNTN = valorUnitario.fatorJurosNTN(130, 30, 0.06);
		assertEquals(0.277177, fatorJurosNTN, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsFatorJurosNTN() {
		double fatorJurosNTN = valorUnitario.fatorJurosNTN(130, 30, 0.06);
		assertNotEquals(1, fatorJurosNTN, FORMATER_6);
	}
	
	@Test
	public void testEqualsJurosNTN() {
		double jurosNTN = valorUnitario.jurosNTN(17.391975308641975, 0.2771777777777778);
		assertEquals(4.820669, jurosNTN, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsJurosNTN() {
		double jurosNTN = valorUnitario.jurosNTN(17.391975, 0.277177);
		assertNotEquals(20, jurosNTN, FORMATER_6);
	}
	

}
