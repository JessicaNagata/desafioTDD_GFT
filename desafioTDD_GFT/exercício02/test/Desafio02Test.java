package exercício2.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Before;

import exercício2.model.Livro;
import exercício2.model.Loja;
import exercício2.model.VideoGame;

public class Desafio02Test {

	
	Livro livroTestTema, livroTestTema2, livroTestEducativo;
	VideoGame videoGameTest, videoGameTest2, videoGameTest3;
	Loja lojaTest;
	
	ArrayList<Livro>livrosTest = new ArrayList<>();
	ArrayList<VideoGame>gamesTest = new ArrayList<>();
	
	@Before
	public void setup() {
		
	livrosTest.add(livroTestTema = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300));
	livrosTest.add(livroTestTema2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500));
	livrosTest.add(livroTestEducativo = new Livro("Java POO", 20, 50, "GFT", "educativo", 500));
	
	gamesTest.add(videoGameTest = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false));
	gamesTest.add(videoGameTest2 = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true));
	gamesTest.add(videoGameTest3 = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false));
	
	lojaTest = new Loja("nomeDaLoja", "cnpjDaLoja", livrosTest, gamesTest);
	
	}
	
	@org.junit.Test
	public void calculaImpostoLivroTest() throws Exception {
		assertEquals(4, livroTestTema.calculaImposto(), 0.0001);
		assertEquals(6, livroTestTema2.calculaImposto(), 0.0001);
		assertEquals(0, livroTestEducativo.calculaImposto(), 0.0001); //Livro Educativo
	}
	
	@org.junit.Test
	public void calculaImpostoVideoGameTest() throws Exception {
		assertEquals(810, videoGameTest.calculaImposto(), 0.0001);
		assertEquals(250, videoGameTest2.calculaImposto(), 0.0001);//VideoGame usado
		assertEquals(675, videoGameTest3.calculaImposto(), 0.0001);
	}
	
	@org.junit.Test
	 public void deveCalcularPatrimonio(){
	        assertEquals(941800.0, lojaTest.calculaPatrimonio(), 0.00001);
	 }
	 }
