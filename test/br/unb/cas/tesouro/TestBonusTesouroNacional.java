package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.BonusTesouroNacional;

public class TestBonusTesouroNacional {

	private static final double TAXA_REFERENCIAL = 1.1;
	public double valorUnitarioAnt = 10;
	BonusTesouroNacional valorUnitario;
	
	@Before
	public void setUp() throws Exception {
		valorUnitario = new BonusTesouroNacional();
	}
	
	@Test
	public void testValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario(valorUnitarioAnt);
		assertEquals(11, precoUnitario, 0.0001);
	}
		
}
