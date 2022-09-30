package exercicio07.model;

public class Gerente extends Funcionario {
	
	static double bonusGerente = 10000;

    public Gerente() {
    }

    public Gerente(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario + bonusGerente;
        return salario;
    }

}
