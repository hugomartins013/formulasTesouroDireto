package br.unb.cas.tesouro;

import org.junit.Test;

import formulasTesouroDireto.LFT;

import static org.junit.Assert.*;

import org.junit.Before;

public class TestLFT {

	private LFT lft;
	public static double FORMATER_6 = 0.000001d;
	public static double FORMATER_8 = 2.1100000000000003d;
	
	@Before
	public void init(){
		lft = new LFT();
	}
	
	@Test
	public void testValorNominalVNA() {
		
		double resultado = lft.calculaVNA(2,2);
		assertEquals(resultado, 4d, FORMATER_6);
		
	}
	
	@Test
	public void testValorNominalC(){
		
		double selic = 1.11d;
		double resultado = lft.calculaC(selic);
		assertEquals(resultado, FORMATER_8, FORMATER_6);
	}
	
	@Test
	public void testValorNominalTselic(){
		
		double selick = 2.22d;
		double resultado = lft.calculaTSelic(selick);
		
		assertEquals(resultado, FORMATER_6, 0.0001d);
	}
		
}
