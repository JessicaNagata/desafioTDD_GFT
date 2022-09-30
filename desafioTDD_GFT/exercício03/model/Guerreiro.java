package questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
public List<String> habilidade = new ArrayList<String>();
	
	public Guerreiro(String nome, int vida, int mana, float xP, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xP, inteligencia, forca, level);

	}

	@Override
	public void IvLUp() {
		Vida += 2;
		Mana++;
		XP++;
		Inteligencia++;
		Forca += 2;
		Level++;
	}

	public double attack() {

		 Random random = new Random();
		return (this.getForca() * this.getLevel()) + random.nextInt(301);
	}

	public void apredenderHabilidade(String habilidade) {
      this.habilidade.add(habilidade)
;	}

	public ArrayList<String> getHabilidade(){
		return (ArrayList<String>) this.habilidade;
	}
}
