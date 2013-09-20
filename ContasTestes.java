package contasTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Contas;

public class ContasTestes {

	Contas umNumero;
	
	@Before
	public void setUp() throws Exception {
		umNumero = new Contas();
	}
	
	
	//Quadrado
	@Test	
	public void testaQuadradoZero(){
		assertEquals(0.0,umNumero.calculaQuadrado(0.0),0.00001);
	}
	@Test
	public void testaQuadradoPequeno(){
		assertEquals(0.0001,umNumero.calculaQuadrado(0.01),0.00001);
	}
	
	@Test
	public void testaQuadradoPequenoNegativo(){
		assertEquals(0.0001,umNumero.calculaQuadrado(-0.01),0.00001);
	}
	
	@Test
	public void testaQuadradoGrande(){
		assertEquals(10000.0,umNumero.calculaQuadrado(100.0),0.1);
	}
	
	@Test
	public void testaQuadradoGrandeNegativo(){
		assertEquals(10000,umNumero.calculaQuadrado(-100),0.1);
	}
	
	
	//Cubo
	@Test
	public void testaCuboZero(){
		assertEquals(0.0,umNumero.calculaCubo(0.0),0.0000001);
	}
	
	@Test
	public void testaCuboPequeno(){
		assertEquals(0.000001,umNumero.calculaCubo(0.01),0.0000001);
	}
	
	@Test
	public void testaCuboPequenoNegativo(){
		assertEquals(-0.000001,umNumero.calculaCubo(-0.01),0.0000001);
	}
	
	@Test
	public void testaCuboGrande(){
		assertEquals(1000000.0,umNumero.calculaCubo(100.0),0.1);
	}
	
	@Test
	public void testaCuboGrandeNegativo(){
		assertEquals(-1000000.0,umNumero.calculaCubo(-100.0),0.1);
	}
	
	
	
	/*
	 * Método da apostila
	@Test
	public void testaQuadrado(){
		
		Contas umNumero = new Contas();
		double numero = 0.0;
		double quadrado = 0.0;
		if (umNumero.calculaQuadrado(numero) != quadrado)
			System.out.println("Não funciona para 0");
		
		numero = 0.01;
		quadrado = 0.0001;
		if (umNumero.calculaQuadrado(numero) != quadrado)
			System.out.println("Não funciona para 0.01");
		
		numero = -0.01;
		quadrado = 0.0001;
		if (umNumero.calculaQuadrado(numero) != quadrado)
			System.out.println("Não funciona para -0.01");
		
		numero = 100.0;
		quadrado = 10000.0;
		if (umNumero.calculaQuadrado(numero) != quadrado)
			System.out.println("Não funciona para 100");
		
		numero = -100;
		quadrado = 10000.0;
		if(umNumero.calculaQuadrado(numero) != quadrado)
			System.out.println("Não funciona para -100");
		
		System.out.println("Fim dos testes");
		
	}
	*/
	

}
