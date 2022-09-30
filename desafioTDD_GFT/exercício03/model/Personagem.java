package questao03;

public class Personagem {
	protected String Nome;
	protected int Vida =0;
	protected int Mana =0;
	protected float XP = 0;
	protected int Inteligencia = 0;
	protected int Forca = 0;
	protected int Level = 0;
	protected static int totalPersonagens = 0;
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getVida() {
		return Vida;
	}

	public void setVida(int vida) {
		Vida = vida;
	}
	
	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}


	public float getXP() {
		return XP;
	}

	public void setXP(float xP) {
		XP = xP;
	}

	public int getInteligencia() {
		return Inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}

	public int getForca() {
		return Forca;
	}

	public void setForca(int forca) {
		Forca = forca;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public Personagem(String nome, int vida,  int mana, float xP, int inteligencia, int forca, int level) {
		
		Nome = nome;
		Vida = vida;
		Mana = mana;
		XP = xP;
		Inteligencia = inteligencia;
		Forca = forca;
		Level = level;
		totalPersonagens++;
		
	}

	public void IvLUp() {
		
	}
}
