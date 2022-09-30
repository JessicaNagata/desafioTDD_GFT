package exc04_05_06;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
	
	//Exercicio 04
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	

	public ListaPessoas(List<Pessoa> lista) {
		this.lista = lista;
	}

	public ListaPessoas() {

	}

	public String pessoaMaisVelha() {
		String maisVelho = null;
		int maior = 0;
	    for (int i = 0; i < lista.size(); i++) {
	        if (lista.get(i).getIdade() > maior) {
	            maior = lista.get(i).getIdade();
	             maisVelho = lista.get(i).getNome();
	        }
	    }
	    return maisVelho;
	}
	//exercicio 05
	public int excluirMenoresDeIdade() {
		

        int menorIdade = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdade() < 18) {
                menorIdade = lista.get(i).getIdade();
                lista.remove(i);
            }
        }
        return lista.size();
       
	}
	//Exercicio 06
	public boolean encontrarObjetoJessica() {
		boolean objetoEncontrado = true ;
		for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals("Jessica")) {
            	objetoEncontrado = true;
            }else objetoEncontrado = false;
		}
		return objetoEncontrado;
	}
	public int idadeDoObjetoSeEleExistir() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals("Jessica")) {
            	
                return lista.get(i).getIdade();
                
            }
        }
		return 0;
	}

	
 }


