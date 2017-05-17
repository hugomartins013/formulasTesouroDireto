package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.BonusTesouroNacional;

public class TestBonusTesouroNacional {

	public double valorUnitarioAnt = 10;
	public double valorUnitarioAt = 11;
	BonusTesouroNacional valorUnitario;
	
	@Before
	public void setUp() throws Exception {
		valorUnitario = new BonusTesouroNacional();
	}
	
	@Test
	public void testEqualsValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario(valorUnitarioAnt);
		assertEquals(11, precoUnitario, 0.0001);
	}
	
	@Test
	public void testNotEqualsValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario(valorUnitarioAnt);
		assertNotEquals(10, precoUnitario, 0.0001);
	}
	
	@Test
	public void testEqualsJuros() {
		double precoUnitario = valorUnitario.juros(valorUnitarioAt);
		assertEquals(0, precoUnitario, 0.0001);
	}
	
	@Test
	public void testNotEqualsJuros() {
		double precoUnitario = valorUnitario.juros(valorUnitarioAt);
		assertNotEquals(0, precoUnitario, 0.0001);
	}
	
		
}
