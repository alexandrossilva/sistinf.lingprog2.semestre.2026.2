package aulas.aula06.exemplo02;

// Instanciação e manipulação de lista de objetos
public class ProgramaLista3 {

    static void main(String[] args) {
        // instanciação de nova lista a partir de classe genérica
        ListaGenerica lista = new ListaGenerica(5);

        lista.adicionar(5);                                         // inserção de inteiro em lista
        System.out.println("Lista: " + lista.getElementos());       // listagem de elementos inseridos após 1ª inserção

        lista.adicionar(7.5);                                       // inserção de número real em lista
        System.out.println("Lista: " + lista.getElementos());       // listagem de elementos inseridos após 2ª inserção

        Funcionario f = new Funcionario("Alexandro","Professor",5000);
        lista.adicionar(f);                                              // inserção de funcionário em lista

        System.out.println("Lista de elementos");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + lista.getElemento(i));
        }
    }

}
