package aulas.aula06.exemplo02;

// Instanciação e manipulação de lista de números reais
public class ProgramaLista2 {

    static void main(String[] args) {
        // instanciação de nova lista de inteiros a partir de classe genérica
        ListaGenerica<Integer> listaInteiros = new ListaGenerica<Integer>(5);

        listaInteiros.adicionar(5);                                         // inserção de novo inteiro em lista
        System.out.println("Lista: " + listaInteiros.getElementos());       // listagem de inteiros inseridos após 1ª inserção

        listaInteiros.adicionar(7);                                         // inserção de segundo inteiro em lista
        System.out.println("Lista: " + listaInteiros.getElementos());       // listagem de inteiros inseridos após 2ª inserção
    }

}
