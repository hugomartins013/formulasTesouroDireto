package br.unb.cas.tesouro;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class TestLFTA {

	private LFTA lfta;
	
	@Before
	public void init(){
		lfta = new LFTA();
	}
	
	@Test
	public void testValorNominalVNA() {
		
		double resultado = lfta.calculaVNA(2,2);
		assertEquals(resultado, -2.0004879999930996d, 0.0001d);
		
	}
		
}
