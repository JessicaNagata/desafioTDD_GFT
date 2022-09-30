package exc04_05_06_teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import exc04_05_06.ListaPessoas;
import exc04_05_06.Pessoa;

public class ListaPessoasTest {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	private Pessoa pessoa = new Pessoa();
	private ListaPessoas lp;
	@Before
	public void setup() {
		lp = new ListaPessoas(lista);
	
		lista.add(new Pessoa("João", 15));
		lista.add(new Pessoa("Leandro", 21));
		lista.add(new Pessoa("Paulo", 17));
		lista.add(new Pessoa("Jessica", 18));
	}
	 @Test public void deveRetornarPessoaMaisVelha() throws Exception {
		 String nomeEsperado = lp.pessoaMaisVelha();
		 
		  assertEquals("Leandro", nomeEsperado);
	 }
	 
	 @Test
		public void deveMostrarQuantidadeDePessoasAntesDaExclusao() throws Exception {
	        
	        assertEquals(4, lista.size() );
	}
	 
	  @Test
	public void deveExcluirPessoasMenoresDeIdade() throws Exception {
			 int quantidadeEsperado = lp.excluirMenoresDeIdade();
			 
			  assertEquals(2, quantidadeEsperado );
	}
	  @Test
	public void deveEncontrarObjeto() throws Exception {
		  boolean resultadoEsperado = lp.encontrarObjetoJessica();
		  
		  assertEquals(true, resultadoEsperado);
		
	}
	  @Test
	public void deveEncontrarObjetoERetornarIdadeDoObjeto() throws Exception {
		  int idadeEsperada = lp.idadeDoObjetoSeEleExistir();
		  
		  assertEquals(18, idadeEsperada);
	}

}
