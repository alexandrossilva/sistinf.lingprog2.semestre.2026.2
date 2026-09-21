package aulas.aula06.exemplo02;

// Instanciação e manipulação de lista de números reais
public class ProgramaLista1 {

    static void main(String[] args) {
        // instanciação de nova lista de números reais a partir de classe genérica
        ListaGenerica<Double> listaReais = new ListaGenerica<Double>(5);

        listaReais.adicionar(2.0);                                          // inserção de primeiro número real em lista
        System.out.println("Lista: " + listaReais.getElementos());      // listagem de números inseridos após 1ª inserção

        listaReais.adicionar(7.4);                                          // inserção de segundo número real em lista
        System.out.println("Lista: " + listaReais.getElementos());      // listagem de números inseridos após 2ª inserção
    }

}
