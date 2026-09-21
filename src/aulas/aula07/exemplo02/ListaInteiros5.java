package aulas.aula07.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class ListaInteiros5 {

    static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>(2);
        lista.add(1);
        lista.add(7);
        lista.add(2);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("4º Inteiro: " + lista.get(3));

        System.out.println("Listagem de inteiros:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição " + (i + 1) + ": " + lista.get(i));
        }
    }

}