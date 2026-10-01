package avaliacoes.avaliacao01.questao05;

import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {

    private int quantidadeEleitores;    // quantidade de eleitores
    private List<Integer> votos;   // lista de votos (números de candidatos) registrados

    // construtor com parâmetro para definição de quantidade de eleitores aptos a votar
    public UrnaEletronica(int quantidadeEleitores) {
        this.quantidadeEleitores = quantidadeEleitores;
        this.votos = new ArrayList<Integer>();
    }

    // registro de voto, pela inserção de número do candidato votado em lista
    public void registrarVoto(int numVoto) {
        votos.add(numVoto);
    }

}
