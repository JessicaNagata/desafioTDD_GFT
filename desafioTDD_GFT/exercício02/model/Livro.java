package exercício2.model;

public class Livro extends Produto{
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public double calculaImposto() {
        double impostoCalculado = 0;
        
        if(!"educativo".equals(getTema())){
        impostoCalculado = getPreco()* 0.10;
            System.out.println("R$ " + impostoCalculado + " de impostos sobre o livro " + getNome() + ".");
        }else{
            System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
        }
        return impostoCalculado;
    }
    

}
