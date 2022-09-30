package exercício2.model;

public class VideoGame extends Produto{
    private String marca;
    private String modelo;
    private Boolean isUsado;

    public VideoGame() {
    }


    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, Boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
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

    public Boolean getIsUsado() {
        return isUsado;
    }

    public void setIsUsado(Boolean isUsado) {
        this.isUsado = isUsado;
    }

    @Override
    public double calculaImposto() {
        double impostoCalculado = 0;
        
        if(getIsUsado() == true){
        impostoCalculado = getPreco()* 0.25;
        System.out.println("Imposto " + getNome() + " " + getModelo() + " usado, R$ " + impostoCalculado + ".");
        }else{
        impostoCalculado = getPreco()* 0.45;
        System.out.println("Imposto " + getNome() + " " + getModelo() + ", R$ " + impostoCalculado + ".");
        }
        return impostoCalculado;
    }
}
