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
	public void testNotValorNominalVNA() {
		
		double resultado = lft.calculaVNA(2,2);
		assertNotEquals(resultado, 5d, FORMATER_6);
		double resultadoTest1 = lft.calculaVNA(2,2);
		assertNotEquals(resultadoTest1, 10d, FORMATER_6);
	}
	
	@Test
	public void testValorNominalC(){
		
		double selic = 1.11d;
		double resultado = lft.calculaC(selic);
		assertEquals(resultado, FORMATER_8, FORMATER_6);
	}
	
	@Test
	public void testNotValorNominalC(){
		
		double selic = 1.11d;
		double resultado = lft.calculaC(selic);
		assertNotEquals(resultado, 10000, FORMATER_6);
		double resultadoTest3 = lft.calculaC(selic);
		assertNotEquals(resultadoTest3, 2.11000563d, FORMATER_6);
	}
	
	@Test
	public void testValorNominalTselic(){
		
		double selick = 2.22d;
		double resultado = lft.calculaTSelic(selick);
		
		assertEquals(resultado, FORMATER_6, 0.0001d);
	}
	
	@Test
	public void testNotValorNominalTselic(){
		
		double selick = 2.22d;
		double resultado = lft.calculaTSelic(selick);
		assertNotEquals(resultado, 10001, 0.0001d);
		double resultadoTest4 = lft.calculaTSelic(selick);
		assertNotEquals(resultadoTest4, 0.000326d, 0.0001d);
	}
		
}
