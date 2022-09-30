package exercício2.model;

import java.util.List;

public class Loja {

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videogames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videogames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videogames = videogames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideogames() {
        return videogames;
    }

    public void setVideogames(List<VideoGame> videogames) {
        this.videogames = videogames;
    }

    public void listaLivros() {
        System.out.println("-----------------------------------------------------------------------------");
        if (livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A loja " + getNome() + " possui estes livros para venda: ");
            for (Livro item : livros) {
                System.out.println("Título: " + item.getNome() + ", preço: R$ " + item.getPreco() + ", quantidade: " + item.getQtd()+ " em estoque.");
            };
        }
    }

    public void listaVideoGames() {
        System.out.println("-----------------------------------------------------------------------------");
        if (videogames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("A loja " + getNome() + " possui estes video-games para venda: ");
            for (VideoGame item : videogames) {
                System.out.println("Vídeo-game: " + item.getModelo() + ", preço: R$ " + item.getPreco() + ", quantidade: " + item.getQtd()+ " em estoque.");
            };
        }
    }

    public Double calculaPatrimonio() {
        double patrimonioTotal = 0;
        
        System.out.println("-----------------------------------------------------------------------------");
        
        for (Livro item : livros) {
            patrimonioTotal = patrimonioTotal + (item.getPreco() * item.getQtd());
        };
        for (VideoGame item : videogames) {
           patrimonioTotal = patrimonioTotal + (item.getPreco() * item.getQtd());
        };
        
        System.out.println("O patrimônio da loja: " + getNome() + " é de: R$ " + patrimonioTotal);
        
        return patrimonioTotal;
    }
}
