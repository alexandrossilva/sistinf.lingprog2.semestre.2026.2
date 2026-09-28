package aulas.aula08.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class ProgramaLista {

    static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        System.out.println(lista.size());
        lista.add(7);
        System.out.println(lista.isEmpty());
        lista.add(5);
        System.out.println(lista.contains(2));
        System.out.println(lista.contains(7));

        System.out.println("Lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
