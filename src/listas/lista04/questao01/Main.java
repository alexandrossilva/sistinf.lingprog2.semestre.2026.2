package temp.listas.lista04.questao01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        for (int i = 2; i < 6; i++) {
            lista.add(0, i);
        }

        int n = lista.size() / 2;
        lista.add(n, 9);

        int w = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > w)
                w = lista.get(i);
        }

        System.out.println(w);
    }

}