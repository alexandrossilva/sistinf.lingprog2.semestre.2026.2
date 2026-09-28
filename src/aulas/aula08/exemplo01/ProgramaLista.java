package aulas.aula08.exemplo01;

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
        System.out.println(lista);
    }

}
