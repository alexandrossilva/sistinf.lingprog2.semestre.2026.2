package aulas.aula07.exemplo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaInteiros3 {

    static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>(2);
        lista.add(1);
        lista.add(7);
        lista.add(2);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("2º Inteiro: " + lista.get(1));

        Iterator<Integer> iterator = lista.iterator();

        System.out.println("Listagem de inteiros:");
        for (Integer inteiro : lista) {
            System.out.println(inteiro);
        }
    }

}