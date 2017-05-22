package br.unb.cas.tesouro;

import org.junit.Test;

import formulasTesouroDireto.LFTA;

import static org.junit.Assert.*;

import org.junit.Before;

public class TestLFTA {

	private LFTA lfta;
	public static double FORMATER_6 = 0.000001d;
	public static double FORMATER_7 = -2.0004879999930996d;
	
	@Before
	public void init(){
		lfta = new LFTA();
	}
	
	@Test
	public void testValorNominalVNA() {
		
		double resultado = lfta.calculaVNA(2,2);
		assertEquals(resultado, FORMATER_7, FORMATER_6);
		
	}
	
	@Test
	public void testNotValorNominalVNA() {
		
		double resultado = lfta.calculaVNA(2,2);
		assertNotEquals(resultado, 1000, FORMATER_6);
		double resultadoTest2 = lfta.calculaVNA(2,2);
		assertNotEquals(resultado, -2.000486d, FORMATER_6);
		
	}
		
}
