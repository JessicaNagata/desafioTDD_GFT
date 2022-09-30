package questao03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PersonagemTest {
	ArrayList <Personagem> personagens = new ArrayList<>();
	Guerreiro guerreiro;
	Guerreiro guerreiro1;
	Mago mago1;
	Mago mago2;


		@Before
		public void setup() {
			
			guerreiro = new Guerreiro("He-man", 100, 20, 50.f, 200, 50, 10);
			mago1 = new Mago ("Harry Potter", 100, 20, 50.f, 200, 50, 5);
			guerreiro1 = new Guerreiro ("He-man", 100, 20, 50.f, 200, 50, 10);
			mago2 = new Mago("Satorou Gojo",100, 20, 50f, 150, 50, 20);
			personagens.add(guerreiro);
			personagens.add(guerreiro1);
			personagens.add(mago1);
			personagens.add(mago2);
		}
		
	@Test
	public void quantidade_personagens_tenho_na_lista() throws Exception{
	  assertEquals(4, personagens.size());
	}

	@Test
	public void verifica_ivlUp_mago() throws Exception{
		int vida = mago1.getVida(); int mana = mago1.getMana(); int inteligencia = mago1.getInteligencia();
		float xP = mago1.getXP(); int forca = mago1.getForca(); int level = mago1.getLevel();
		
		mago1.IvLUp();
		vida++; mana +=2;  inteligencia +=2; xP ++; forca++; level++;
	   assertEquals(vida , mago1.getVida()); 
	   assertEquals(mana, mago1.getMana());
	   assertEquals(inteligencia, mago1.getInteligencia());
	   assertTrue(xP == mago1.getXP());
	   assertEquals(forca, mago1.getForca());
	   assertEquals(level, mago1.getLevel());
	  
	}

	@Test
	public void verifica_ivlUp_guerreiro() throws Exception{
		int vida = guerreiro.getVida(); int mana = guerreiro.getMana(); int inteligencia = guerreiro.getInteligencia();
		float xP = guerreiro.getXP(); int forca = guerreiro.getForca(); int level = guerreiro.getLevel();
		
		guerreiro.IvLUp();
		vida+=2; mana ++;  inteligencia ++; xP ++; forca+=2; level++;
	   assertEquals(vida , guerreiro.getVida()); 
	   assertEquals(mana, guerreiro.getMana());
	   assertEquals(inteligencia, guerreiro.getInteligencia());
	   assertTrue(xP == guerreiro.getXP());
	   assertEquals(forca, guerreiro.getForca());
	   assertEquals(level, guerreiro.getLevel());
	}
	@Test
	public void verifica_se_personagem_aprendeu_magia() throws Exception{
		mago1.aprenderMagia("Casulo de areia");
		assertEquals(1, mago1.getMagia().size());
		
	}


	@Test
	public void verifica_se_personagem_aprendeu_habilidade() throws Exception{
		guerreiro.apredenderHabilidade("Ataque visual");
		assertEquals(1, guerreiro.getHabilidade().size());
	}
}
