package exercicio07.model;

public class Supervisor extends Funcionario {
	
	static double bonusSupervisor = 5000;

    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario + bonusSupervisor;
        return salario;
    }

}
