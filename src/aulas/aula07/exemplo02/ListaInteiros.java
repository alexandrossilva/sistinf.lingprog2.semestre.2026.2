package aulas.aula07.exemplo02;

import java.util.ArrayList;
import java.util.Collection;

public class ListaInteiros {

    static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<Integer>(2);
        lista.add(1);
        lista.add(7);
        lista.add(2);
        System.out.println(lista);
    }

}