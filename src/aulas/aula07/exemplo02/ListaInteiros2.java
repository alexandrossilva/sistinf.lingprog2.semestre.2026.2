package aulas.aula07.exemplo02;

import java.util.LinkedList;
import java.util.List;

public class ListaInteiros2 {

    static void main(String[] args) {
        List<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(7);
        System.out.println("Lista possui o inteiro 2? " + lista.contains(2));
        lista.add(2);
        System.out.println("Lista possui o inteiro 2? " + lista.contains(2));
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("2º Inteiro: " + lista.get(1));
    }

}