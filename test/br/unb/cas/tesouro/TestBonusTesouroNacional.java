package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.BonusTesouroNacional;

public class TestBonusTesouroNacional {

	private BonusTesouroNacional valorUnitario;
	public static double FORMATER_6 = 0.000001d;
	
	@Before
	public void setUp() throws Exception {
		valorUnitario = new BonusTesouroNacional();
	}
	
	@Test
	public void testEqualsValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario(10);
		assertEquals(11, precoUnitario, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario(10);
		assertNotEquals(10, precoUnitario, FORMATER_6);
	}
	
	@Test
	public void testEqualsFatorJuros() {
		double fatorJuros = valorUnitario.fatorJuros(0.06, 6);
		assertEquals(0.000299, fatorJuros, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsFatorJuros() {
		double fatorJuros = valorUnitario.fatorJuros(0.06, 6);
		assertNotEquals(1, fatorJuros, FORMATER_6);
	}
	
	@Test
	public void testEqualsJuros() {
		double juros = valorUnitario.juros(0.06, 11);
		assertEquals(0.66, juros, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsJuros() {
		double juros = valorUnitario.juros(0.06, 11);
		assertNotEquals(0, juros, FORMATER_6);
	}
		
	@Test
	public void testEqualsValorPrincipal() {
		double valorPrincipal = valorUnitario.valorPrincipal(11, 5);
		assertEquals(55, valorPrincipal, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsValorPrincipal() {
		double valorPrincipal = valorUnitario.valorPrincipal(11, 5);
		assertNotEquals(50, valorPrincipal, FORMATER_6);
	}
}
