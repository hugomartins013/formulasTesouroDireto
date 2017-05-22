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
	public void testNotValorNominalVNA() {
		double resultado = ntnb.calculaVNA();
		assertNotEquals(resultado, 5000d, FORMATER_6);
		double resultadoTest5 = ntnb.calculaVNA();
		assertNotEquals(resultadoTest5, 24556d, FORMATER_6);
		
	}
	
	@Test
	public void testFator(){
			double resultado = ntnb.calculaFator();
			assertEquals(resultado, 245d, FORMATER_6);
		
	}
	
	public void testNotFator(){
		double resultado = ntnb.calculaFator();
		assertNotEquals(resultado, 6000d, FORMATER_6);
		double resultadoTest7 = ntnb.calculaFator();
		assertNotEquals(resultadoTest7, 24545d, FORMATER_6);
	
	}
	
	@Test
	public void testJuros(){
		double resultado = ntnb.calculaJuros();
		assertEquals(resultado, 59780d, FORMATER_6);
	}
	
	@Test
	public void testNotJuros(){
		double resultado = ntnb.calculaJuros();
		assertNotEquals(resultado, 50867d, FORMATER_6);
		double resultadoTest7 = ntnb.calculaJuros();
		assertNotEquals(resultadoTest7, 59870d, FORMATER_6);
	}
	
	@Test
	public void testFatorJuros(){
		double resultado = ntnb.calculaFatorJuros();
		assertEquals(resultado, FORMATER_5, FORMATER_6);
	}
	
	@Test
	public void testNotFatorJuros(){
		double resultado = ntnb.calculaFatorJuros();
		assertNotEquals(resultado, 80000, FORMATER_6);
		double resultadoTest8 = ntnb.calculaFatorJuros();
		assertNotEquals(resultadoTest8, 1.9194273d, FORMATER_6);
	}
	
	

}
