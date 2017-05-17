package br.unb.cas.tesouro;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestLFT {

	@Test
	public void testValorNominalVNA() {
		
//		float resultado = minhaClasse.calculaVNA(vnb,c);
		double resultado = 0d;
		assertEquals(resultado, 1f);
		
	}
	
	@Test
	public void testValorNominalC(){
		
		float c = 1.11f;
//		double resultado = minhaClasse.calculaC(taxaSelic);
	}
	
	@Test
	public void testValorNominalTselic(){
		
		float selick = 2.22f;
//		double resultado = minhaClasse.calculaSelic(selick);
		double resultado = 0d;
		assertEquals(resultado, 0.004056d);
	}
		
}
