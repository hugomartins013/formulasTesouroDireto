package br.unb.cas.tesouro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import formulasTesouroDireto.LetrasTesouroNacional;

public class TestLetrasTesouroNacional {
	
	private LetrasTesouroNacional precoUnitario;
	public static double FORMATER_6 = 0.000001d;
	
	@Before
	public void setUp() throws Exception {
		precoUnitario = new LetrasTesouroNacional();
	}

	@Test
	public void testEqualsPrecoUnitario() {
		double precoUnitarioLTN = precoUnitario.precoUnitarioLTN(10.22);
		assertEquals(990.451836, precoUnitarioLTN, FORMATER_6);
	}
	
	@Test
	public void testNotEqualsPrecoUnitario() {
		double precoUnitarioLTN = precoUnitario.precoUnitarioLTN(10.22);
		assertNotEquals(11, precoUnitarioLTN, FORMATER_6);
	}

}
