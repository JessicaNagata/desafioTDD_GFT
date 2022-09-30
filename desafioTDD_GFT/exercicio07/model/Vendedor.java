package exercicio07.model;

public class Vendedor extends Funcionario {
	
	static double bonusVendedor = 3000;

    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario + bonusVendedor;
        return salario;
    }

}
