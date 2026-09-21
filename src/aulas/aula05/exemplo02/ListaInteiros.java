package aulas.aula05.exemplo02;

// Implementação de lista de inteiros com capacidade estática
public class ListaInteiros {

    private int[] elementos;    // array de elementos inteiros da lista
    private int tamanho;        // tamanho da lista (quantidade de inteiros inseridos)

    // construtor com indicação de capacidade (quantidade máxima de inteiros) da lista
    public ListaInteiros(int capacidade) {
        elementos = new int[capacidade];    // instanciação de novo array
        tamanho = 0;                        // inicialização de tamanho da lista
    }

    // inserção de inteiro na lista
    public void adicionar(int numero) {
        elementos[tamanho] = numero;        // atribuição de inteiro considerando-se próximo índice disponível
        tamanho++;                          // atualização da tamanho da lista
    }

    // retorno de enésimo inteiro na lista
    public int getElemento(int indice) {
        return elementos[indice];
    }

    // retorno de tamanho da lista considerando quantidade atual de inteiros inseridos
    public int getTamanho() {
        return tamanho;
    }

    // retorno de string contendo todos inteiros separados por espaço
    public String getElementos() {
        String retorno = "";            // inicialização de string vazia

        // bloco de repetição considerando tamanho atual da lista
        for (int i = 0; i < tamanho; i++) {
            retorno += elementos[i] + " ";  // concatenação string de retorno com enésimo inteiro da lista
        }

        return retorno;                 // retorno de string
    }

}