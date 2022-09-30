package exercício1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String marca;
        String modelo;
        String placa;
        String cor;
        float km;
        boolean isLigado = false;
        int litrosCombustivel;
        int velocidade;
        double preco;
        String temp;
        String opt = "";
        Veículo carro = null;

        while (!opt.equals(9)) {

            opt = JOptionPane.showInputDialog("=============== Veículos ===============\n\n 1- Criar veículo"
                    + "\n\n 2- Acelerar "
                    + "\n\n 3- Abastecer "
                    + "\n\n 4- Frear "
                    + "\n\n 5- Pintar "
                    + "\n\n 6- Ligar "
                    + "\n\n 7- Desligar "
                    + "\n\n 8- Imprimir dados do veículo "
                    + "\n\n 9- Sair \n\n");

            if (opt == null) {
                System.exit(0);
            }

            switch (opt) {
                case "1":
                    marca = JOptionPane.showInputDialog(null, "Marca: ");
                    modelo = JOptionPane.showInputDialog(null, "Modelo: ");
                    placa = JOptionPane.showInputDialog(null, "Placa: ");
                    cor = JOptionPane.showInputDialog(null, "Cor: ");
                    km = Float.parseFloat(JOptionPane.showInputDialog(null, "Km: "));

                    do {
                        temp = JOptionPane.showInputDialog(null, "O veículo está ligado?\n1 - SIM\n2 - NÃO ");
                        if ("1".equals(temp)) {
                            isLigado = true;
                        } else if ("2".equals(temp)) {
                            isLigado = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                        }
                    } while (!"1".equals(temp) && !"2".equals(temp));

                    do {
                        litrosCombustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Litros de combustível no tanque: "));
                        if (litrosCombustivel > 60) {
                            JOptionPane.showMessageDialog(null, "Limite de litragem ultrapassado, tente novamente!");
                        }
                    } while (litrosCombustivel > 60);

                    velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidade: "));
                    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço do veículo: R$"));

                    carro = new Veículo(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);

                    break;

                case "2":
                    carro.acelerar();
                    break;

                case "3":
                    litrosCombustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos litros? "));
                    JOptionPane.showMessageDialog(null, carro.abastecer(litrosCombustivel));
                    break;

                case "4":
                    if (carro.getVelocidade() > 0) {
                        carro.frear();
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possivel frear, o carro está parado.");
                    }
                    break;

                case "5":
                    cor = JOptionPane.showInputDialog(null, "Cor para a pintura: ");
                    carro.pintar(cor);
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, carro.ligar());
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, carro.desligar());
                    break;

                case "8":
                    if (carro == null) {
                        JOptionPane.showMessageDialog(null, "Não existe veículo cadastrado!");
                    } else {
                        JOptionPane.showMessageDialog(null, carro.toString());
                    }
                    break;

                case "9":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}
