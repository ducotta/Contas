package contasTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Contas;
import contas.ContasNaoConfiavel;

public class ContasNaoConfiavelTestes {
	
	ContasNaoConfiavel umNumero;
	Contas resultado;

	@Before
	public void setUp() throws Exception {
		umNumero = new ContasNaoConfiavel();
		resultado = new Contas();
	}
	
	
	//Quadrado
	@Test
	public void testeQuadradoZero(){
		assertEquals(resultado.calculaQuadrado(0.0),umNumero.calculaQuadrado2(0.0),0.00001);
	}

	@Test
	public void testeQuadradoPequeno(){
		assertEquals(resultado.calculaQuadrado(0.01),umNumero.calculaQuadrado2(0.01),0.00001);
	}
	
	@Test
	public void testeQuadradoPequenoNegativo(){
		assertEquals(resultado.calculaQuadrado(-0.01),umNumero.calculaQuadrado2(-0.01),0.00001);
	}
	
	@Test
	public void testeQuadradoGrande(){
		assertEquals(resultado.calculaQuadrado(100.0),umNumero.calculaQuadrado2(100.0),0.1);
	}

	@Test
	public void testeQuadradoGrandeNegativo(){
		assertEquals(resultado.calculaQuadrado(-100.0),umNumero.calculaQuadrado2(-100.0),0.1);
	}
	
	
	//Cubo
	@Test
	public void testeCuboZero(){
		assertEquals(resultado.calculaCubo(0.0),umNumero.calculaCubo2(0.0),0.0000001);
	}
	
	@Test
	public void testeCuboPequeno(){
		assertEquals(resultado.calculaCubo(0.01),umNumero.calculaCubo2(0.01),0.0000001);
	}
	
	@Test
	public void testeCuboPequenoNeguativo(){
		assertEquals(resultado.calculaCubo(-0.01),umNumero.calculaCubo2(-0.01),0.000001);
	}
	
	@Test
	public void testeCuboGrande(){
		assertEquals(resultado.calculaCubo(100.0),umNumero.calculaCubo2(100.0),0.1);
	}
	
	@Test
	public void testeCuboGrandeNegativo(){
		assertEquals(resultado.calculaCubo(-100.0),umNumero.calculaCubo2(-100.0),0.1);
	}
}
