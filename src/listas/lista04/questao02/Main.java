package temp.listas.lista04.questao02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 20 == 0) {
                numeros.remove(i);
            }
        }

        System.out.println(numeros);
    }

}
