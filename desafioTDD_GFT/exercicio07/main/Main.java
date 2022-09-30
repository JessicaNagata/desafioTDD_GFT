package exercicio07.main;

import exercicio07.model.Funcionario;
import exercicio07.model.Gerente;
import exercicio07.model.Supervisor;
import exercicio07.model.Vendedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String nome = null;
    static int idade = 0;
    static double salario = 0;
    

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        int opt = 0;

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        while (opt != 5) {
            System.out.println("=============== FUNCIONÁRIOS / RELATÓRIO ===============\n"
                    + "\n 1- Adicionar Gerente"
                    + "\n 2- Adicionar Supervisor "
                    + "\n 3- Adicionar Vendedor "
                    + "\n 4- Gerar relatório de funcionários "
                    + "\n 5- Sair \n\n");
            opt = ler.nextInt();

            if (opt == 0) {
                System.exit(0);
            }

            switch (opt) {
                case 1:
                    coletaDados();
                    Funcionario gerente = new Gerente(nome, idade, salario);
                    funcionarios.add(gerente);
                    break;

                case 2:
                    coletaDados();
                    
                    Funcionario supervisor = new Supervisor(nome, idade, salario);
                    funcionarios.add(supervisor);
                    break;

                case 3:
                    coletaDados();
                    Funcionario vendedor = new Vendedor(nome, idade, salario);
                    funcionarios.add(vendedor);
                    break;

                case 4:
                	imprimeRelatorio(funcionarios);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida, digite novamente.");
            }
        }
    }

    public static void coletaDados() {

        Scanner ler = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        nome = ler.nextLine();

        System.out.print("Idade: ");
        idade = ler.nextInt();

        System.out.print("Salário: R$");
        salario = ler.nextDouble();
    }
   
    
    public static void imprimeRelatorio(ArrayList<Funcionario> funcionarios) {
    	System.out.println("_______________RELATÓRIO DE FUNCIONÁRIOS_______________\n");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).toString());
    }
    }
}
