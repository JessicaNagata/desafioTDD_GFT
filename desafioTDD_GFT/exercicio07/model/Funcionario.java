package exercicio07.model;

public abstract class Funcionario {

    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonificacao(double salario) {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome()
                + "\nIdade: " + this.getIdade()
                + "\nSalário: R$" + this.getSalario()
                + "\nBonificação: R$" + (this.bonificacao(this.getSalario()) - this.getSalario())
                + "\nSalário total: R$" + this.bonificacao(this.getSalario())
                + ("\n____________________________________________________\n");
    }

}
