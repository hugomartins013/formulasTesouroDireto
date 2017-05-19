package br.unb.cas.tesouro;

import org.junit.Test;

import formulasTesouroDireto.NTNB;

import static org.junit.Assert.*;

import org.junit.Before;

public class TestNTNB {
	private NTNB ntnb;
	public static double FORMATER_6 = 0.000001d;
	public static double FORMATER_5 = 1.0000000829194273d;
	
	@Before
	public void init(){
		ntnb = new NTNB();
	}
	
	@Test
	public void testValorNominalVNA() {
		double resultado = ntnb.calculaVNA();
		assertEquals(resultado, 245d, FORMATER_6);
		
	}
	
	@Test
	public void testFator(){
			double resultado = ntnb.calculaFator();
			assertEquals(resultado, 245d, FORMATER_6);
		
	}
	
	@Test
	public void testJuros(){
		double resultado = ntnb.calculaJuros();
		assertEquals(resultado, 59780d, FORMATER_6);
	}
	
	@Test
	public void testFatorJuros(){
		double resultado = ntnb.calculaFatorJuros();
		assertEquals(resultado, FORMATER_5, FORMATER_6);
	}
	
	

}
