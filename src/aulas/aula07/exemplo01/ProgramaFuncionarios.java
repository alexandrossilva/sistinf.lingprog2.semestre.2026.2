package aulas.aula07.exemplo01;

// Instanciação e manipulação de lista de objetos
public class ProgramaFuncionarios {

    static void main(String[] args) {
        // instanciação de nova lista a partir de classe genérica
        ListaGenerica<Funcionario> lista = new ListaGenerica<Funcionario>(5);

        Funcionario f1 = new Funcionario("Alexandro","Professor",5000);
        lista.adicionar(f1);                                              // inserção de funcionário em lista

        System.out.println("Lista de elementos");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + lista.getElemento(i));
        }
    }

}
