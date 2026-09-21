package aulas.aula06.exemplo01;

// Implementação de lista de números reais com capacidade estática
public class ListaReais {

    private double[] elementos;     // array de elementos números reais da lista
    private int tamanho;            // tamanho da lista (quantidade de números reais inseridos)

    // construtor com indicação de capacidade (quantidade máxima de números reais) da lista
    public ListaReais(int capacidade) throws IllegalArgumentException {
        if (capacidade <= 0) {                  // se parâmetro de capacidade for negativo ou zero...
            throw new IllegalArgumentException("Capacidade de lista inválida!");
        }
        else {                                  // caso contrário...
            elementos = new double[capacidade]; // instanciação de novo array
            tamanho = 0;                        // inicialização de tamanho da lista
        }
    }

    // inserção de número real na lista
    public void adicionar(double numero) throws IllegalArgumentException {
        if (tamanho == elementos.length) {  // se quantidade de números reais inseridos corresponder ao tamanho do array
            throw new IllegalStateException("Capacidade máxima da lista atingida!");
        }
        else {                              // caso contrário...
            elementos[tamanho] = numero;    // atribuição de número real considerando-se próximo índice disponível
            tamanho++;                      // atualização da tamanho da lista
        }
    }

    // retorno de enésimo número real na lista
    public double getElemento(int indice) {
        return elementos[indice];
    }

    // retorno de tamanho da lista considerando quantidade atual de números reais inseridos
    public int getTamanho() {
        return tamanho;
    }

    // retorno de string contendo todos números reais separados por espaço
    public String getElementos() {
        String retorno = "";                // inicialização de string vazia

        // bloco de repetição considerando tamanho atual da lista
        for (int i = 0; i < tamanho; i++) {
            retorno += elementos[i] + " ";  // concatenação de string de retorno com enésimo número real da lista
        }

        return retorno;                     // retorno de string
    }

}