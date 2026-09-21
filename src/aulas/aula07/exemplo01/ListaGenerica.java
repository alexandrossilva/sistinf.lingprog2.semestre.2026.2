package aulas.aula07.exemplo01;

// Implementação de lista genérica com capacidade estática
public class ListaGenerica<E> {

    private E[] elementos;                      // array de elementos da lista
    private int tamanho;                        // tamanho da lista (quantidade de elementos inseridos)

    // construtor com indicação de capacidade (quantidade máxima de elementos) da lista
    public ListaGenerica(int capacidade) throws IllegalArgumentException {
        if (capacidade <= 0) {                          // se parâmetro de capacidade for negativo ou zero...
            throw new IllegalArgumentException("Capacidade de lista inválida!");
        }
        else {                                          // caso contrário...
            elementos = (E[])new Object[capacidade];    // instanciação de novo array
            tamanho = 0;                                // inicialização de tamanho da lista
        }
    }

    // inserção de elemento na lista
    public void adicionar(E elem) throws IllegalArgumentException {
        if (tamanho == elementos.length) {  // se quantidade de elementos inseridos corresponder ao tamanho do array
            throw new IllegalStateException("Capacidade máxima da lista atingida!");
        }
        else {                              // caso contrário...
            elementos[tamanho] = elem;      // atribuição de elemento considerando-se próximo índice disponível
            tamanho++;                      // atualização da tamanho da lista
        }
    }

    // retorno de enésimo elemento na lista
    public E getElemento(int indice) {
        return elementos[indice];
    }

    // retorno de tamanho da lista considerando quantidade atual de elementos inseridos
    public int getTamanho() {
        return tamanho;
    }

    // retorno de string contendo todos os elementos separados por espaço
    public String getElementos() {
        String retorno = "";                // inicialização de string vazia

        // bloco de repetição considerando tamanho atual da lista
        for (int i = 0; i < tamanho; i++) {
            retorno += elementos[i] + " ";  // concatenação de string de retorno com enésimo elemento da lista
        }

        return retorno;                     // retorno de string
    }

}