package avaliacoes.avaliacao01.questao06;

import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {

    private int quantidadeEleitores;    // quantidade de eleitores
    private List<Integer> votos;   // lista de votos (números de candidatos) registrados

    // construtor com parâmetro para definição de quantidade de eleitores aptos a votar
    public UrnaEletronica(int quantidadeEleitores) throws IllegalArgumentException {
        // quantidade de eleitores em número igual ou inferior a 0...
        if (quantidadeEleitores <= 0) {
            throw new IllegalArgumentException("Quantidade inválida de eleitores!");
        }
        // caso contrário...
        else {
            this.quantidadeEleitores = quantidadeEleitores;
            this.votos = new ArrayList<Integer>();
        }
    }

    // registro de voto, pela inserção de número do candidato votado em lista
    public void registrarVoto(int numVoto) throws IllegalArgumentException, IllegalStateException {
        // se número de candidato estiver abaixo de 0 ou for igual ou acima de 100...
        if (numVoto < 0 || numVoto >= 100) {
            throw new IllegalArgumentException("Número inválido de candidato!");
        }
        // se quantidade de eleitores corresponder à quantidade de votos inseridos em lista...
        else if (quantidadeEleitores == votos.size()) {
            throw new IllegalStateException("Impossibilidade de registro de novo voto!");
        }
        // caso contrário...
        else {
            votos.add(numVoto);
        }
    }

    // cálculo e retorno de percentual de votos de candidato identificado por seu número
    public double getPercentualVotos(int numCandidato) {
        if (votos.isEmpty()) {                    // se lista de votos estiver vazia...
            return 0;                              // retorno de 0 (zero) como percentual
        }
        else {                                    // caso contrário...
            int votosCandidato = 0;                // inicialização de totalizador de votos

            // iteração entre votos inseridos na lista
            for (int i = 0; i < votos.size(); i++) {
                if (votos.get(i) == numCandidato)   // se enésimo voto for do candidato...
                    votosCandidato++;                // incremento de totalizador de votos
            }

            // calculo e retorno de percentual com base em votos do candidato e total de votos
            return votosCandidato * 100.0 / votos.size();
        }
    }

}
