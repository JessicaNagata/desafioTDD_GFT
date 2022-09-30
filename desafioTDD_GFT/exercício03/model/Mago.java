package questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
public List<String> magia = new ArrayList<String>();

	
	public Mago(String nome, int vida,int mana, float xP, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xP, inteligencia, forca, level);
		
	}
@Override
	public void IvLUp() {
	Vida++;
     Mana+=2;
     XP++;
     Inteligencia+=2;
     Forca++;
     Level++;
	}

	public double attack() {
		Random random = new Random();
		return (this.getInteligencia()* this.getLevel()) + random.nextInt(301);
	}
	public void aprenderMagia(String magia) {
        this.magia.add(magia);
      
	}
	//aqui ele retorna a lista completa
	public ArrayList<String> getMagia(){
		return (ArrayList<String>) this.magia;
	}
}
