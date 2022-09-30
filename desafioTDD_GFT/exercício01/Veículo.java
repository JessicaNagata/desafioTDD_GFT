package exercício1;

public class Veículo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public Veículo() {
    }
    
    public Veículo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isIsLigado() {
        return isLigado;
    }

    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        setVelocidade(this.velocidade + 20);
    }

    public String abastecer(int combustivel) {
        if (getLitrosCombustivel() + combustivel <= 60) {
            setLitrosCombustivel(this.litrosCombustivel + combustivel);
            return "Abastecimento realizado com sucesso!\nTotal de litros no tanque: " + getLitrosCombustivel() + ".";
        } else {
            return "Atenção! O tanque tem um total de " + ( 60 - getLitrosCombustivel()) + " litro(s) de capacidade disponível para o abastecimento.";
        }
    }

    public void frear() {
        setVelocidade(this.velocidade - 20);
    }

    public void pintar(String cor) {
        setCor(cor);
    }

    public String ligar() {
        if (this.isLigado == false) {
            this.isLigado = true;
            return "Prontinho! O veículo ligou.";
        } else {
            return "O veículo já está ligado!";
        }
    }

    public String desligar() {
        if (this.isLigado == true && this.velocidade == 0) {
            this.isLigado = false;
            return "Prontinho! O veículo desligou.";
        } else {
            return "O veículo já está desligado, ou encontra-se em movimento!";
        }
    }

    
    @Override
    public String toString() {
        return "Veículo Completo" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nCor: " + cor + "\nKm: " + km + "\nLigado?: " + isLigado + "\nLitros de combustível: " + litrosCombustivel + "\nVelocidade: " + velocidade + "\nPreço: R$ " + preco;
    }

}
