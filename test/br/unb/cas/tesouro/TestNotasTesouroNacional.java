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
	
	@Test
	public void testEqualsValorNominalAtualizadoNTN() {
		double valorNominalAtualizadoNTN = valorUnitario.valorNominalAtualizadoNTN(3.22, 3.24);
		assertEquals(993.827160, valorNominalAtualizadoNTN, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorNominalAtualizadoNTN() {
		double valorNominalAtualizadoNTN = valorUnitario.valorNominalAtualizadoNTN(3.22, 3.24);
		assertNotEquals(1000, valorNominalAtualizadoNTN, FORMATER_6);
	}
	
	@Test
	public void testEqualsFatorJurosVNA() {
		double fatorJurosVNA = valorUnitario.fatorJurosVNA(6, 0.06);
		assertEquals(0.0003, fatorJurosVNA, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsFatorJurosVNA() {
		double fatorJurosVNA = valorUnitario.fatorJurosVNA(6, 0.06);
		assertNotEquals(1, fatorJurosVNA, FORMATER_6);
	}
	
	@Test
	public void testEqualsJurosVNA() {
		double jurosVNA = valorUnitario.jurosVNA(993.827160494, 0.0003);
		assertEquals(0.298148, jurosVNA, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsJurosVNA() {
		double jurosVNA = valorUnitario.jurosVNA(993.827160494, 0.0003);
		assertNotEquals(300, jurosVNA, FORMATER_6);
	}
	
	@Test
	public void testEqualsValorNominalAtualizadoA6() {
		double valorNominalAtualizadoA6 = valorUnitario.valorNominalAtualizadoA6(3.22, 3.24);
		assertEquals(993.827160, valorNominalAtualizadoA6, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorNominalAtualizadoA6() {
		double valorNominalAtualizadoA6 = valorUnitario.valorNominalAtualizadoA6(3.22, 3.24);
		assertNotEquals(1000, valorNominalAtualizadoA6, FORMATER_6);
	}
	
	@Test
	public void testEqualsFatorJurosA6() {
		double fatorJurosA6 = valorUnitario.fatorJurosA6(6, 0.06);
		assertEquals(0.0003, fatorJurosA6, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsFatorJurosA6() {
		double fatorJurosA6 = valorUnitario.fatorJurosA6(6, 0.06);
		assertNotEquals(1, fatorJurosA6, FORMATER_6);
	}
	
	@Test
	public void testEqualsJurosA6() {
		double jurosA6 = valorUnitario.jurosA6(993.827160494, 0.0003);
		assertEquals(0.298148, jurosA6, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsJurosA6() {
		double jurosA6 = valorUnitario.jurosA6(993.827160494, 0.0003);
		assertNotEquals(300, jurosA6, FORMATER_6);
	}

}
