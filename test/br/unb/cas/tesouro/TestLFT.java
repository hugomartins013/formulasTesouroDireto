package br.unb.cas.tesouro;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestLFT {

	private LFT lft;
	
	@Before
	public void init(){
		lft = new LFT();
	}
	
	@Test
	public void testValorNominalVNA() {
		
		double resultado = lft.calculaVNA(2,2);
		assertEquals(resultado, 4d, 0.0001d);
		
	}
	
	@Test
	public void testValorNominalC(){
		
		double selic = 1.11d;
		double resultado = lft.calculaC(selic);
		assertEquals(resultado, 2.1100000000000003d, 0.0001d);
	}
	
	@Test
	public void testValorNominalTselic(){
		
		double selick = 2.22d;
		double resultado = lft.calculaTSelic(selick);
		
		assertEquals(resultado, 0.000001d, 0.0001d);
	}
		
}
