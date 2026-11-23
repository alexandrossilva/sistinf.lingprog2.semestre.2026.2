package aquecimento.atividade02;

public class GerenciadorNumeros {

    static void main(String[] args) {
        ListaInteiros l1 = new ListaInteiros(5);
        System.out.println("Lista: " + l1.getElementos());
        l1.adicionar(7);
        System.out.println("Lista após inserção de 1º inteiro: " + l1.getElementos());
        l1.adicionar(2);
        l1.adicionar(9);
        System.out.println("Lista após inserção de mais dois inteiros: " + l1.getElementos());
        l1.adicionar(1);
        l1.adicionar(3);
        System.out.println("Lista após inserção de 4º e 5º inteiros: " + l1.getElementos());
        l1.adicionar(30);
        System.out.println("Lista após inserção de 6º inteiro: " + l1.getElementos());
    }

}
