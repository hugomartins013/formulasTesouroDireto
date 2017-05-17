package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.BonusTesouroNacional;

public class TestBonusTesouroNacional {

	BonusTesouroNacional valorUnitario;
	
	@Before
	public void setUp() throws Exception {
		valorUnitario = new BonusTesouroNacional();
	}
	
	@Test
	public void testValorUnitario() {
		double precoUnitario = valorUnitario.precoUnitario();
		assertEquals(0, precoUnitario, 0.0001);
	}
		
}
