package exercício1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

import exercício1.Veículo;

public class VeículoTest {
	
	private Veículo veiculoTest;
	
	@Before
	public void setup() {
		veiculoTest = new Veículo("Honda", "Fit", "DKR 6410", "Cinza", 36000, true, 34, 100, 38000);
	}

	@org.junit.Test
	public void AcelerarTest() throws Exception {
		veiculoTest.acelerar();
		assertEquals(120, veiculoTest.getVelocidade());
		veiculoTest.acelerar();
		assertEquals(140, veiculoTest.getVelocidade());
		veiculoTest.acelerar();
		assertEquals(160, veiculoTest.getVelocidade());
	}
	
	@org.junit.Test
	public void abastecerTest()throws Exception{
		veiculoTest.abastecer(10);
		assertEquals(44, veiculoTest.getLitrosCombustivel());
		veiculoTest.abastecer(50);
		assertEquals(44, veiculoTest.getLitrosCombustivel());
		veiculoTest.abastecer(6);
		assertEquals(50, veiculoTest.getLitrosCombustivel());
	}
	
	@org.junit.Test
	public void frearTest()throws Exception{
		veiculoTest.frear();
		assertEquals(80, veiculoTest.getVelocidade());
		veiculoTest.frear();
		assertEquals(60, veiculoTest.getVelocidade());
		veiculoTest.frear();
		assertEquals(40, veiculoTest.getVelocidade());
	}
	
	@org.junit.Test
	public void pintarTest()throws Exception{
		veiculoTest.pintar("Vermelho");
		assertEquals("Vermelho", veiculoTest.getCor());
		veiculoTest.pintar("Prata");
		assertEquals("Prata", veiculoTest.getCor());
		veiculoTest.pintar("Branco");
		assertEquals("Branco", veiculoTest.getCor());
		
	}
	
	@org.junit.Test
	public void ligarTest()throws Exception{
		veiculoTest.ligar();
		assertEquals(true, veiculoTest.isIsLigado());
		
	}

	public void desligarTest()throws Exception{
		veiculoTest.desligar();
		assertEquals(false, veiculoTest.isIsLigado());
	}
}
