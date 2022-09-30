package exercicio07.test;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import exercicio07.model.Funcionario;
import exercicio07.model.Gerente;
import exercicio07.model.Supervisor;
import exercicio07.model.Vendedor;

public class Desafio07Test {
	
	Gerente gerenteTest;
	Supervisor supervisorTest;
	Vendedor vendedorTest;
	
	ArrayList <Funcionario> funcionariosTest = new ArrayList<>();
	
	@Before
	public void setup() {
		funcionariosTest.add(gerenteTest = new Gerente("Nadir de Oliveira Santos", 47, 2950));
		funcionariosTest.add(supervisorTest = new Supervisor("Paulo Almeira", 38, 2350));
		funcionariosTest.add(vendedorTest = new Vendedor("Ana Lima", 25, 2300));
		
	}
	
	@Test
	public void calculaBonificacaoTest() throws Exception {
		assertEquals(12950, gerenteTest.bonificacao(2950));
		assertEquals(7350, supervisorTest.bonificacao(2350));
		assertEquals(5300, vendedorTest.bonificacao(2300));
	}
	
	@Test
	public void confereQtdDeFuncionariosLista() throws Exception {
		assertEquals(3, funcionariosTest.size());
	}
	

}
