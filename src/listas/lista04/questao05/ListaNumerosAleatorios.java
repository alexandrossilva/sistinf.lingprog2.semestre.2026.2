package temp.listas.lista04.questao05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaNumerosAleatorios {

    public static void main(String[] args) {
        int max = 1000;     // valor máximo para geração de números inteiros positivos
        int qtd = 50;       // quantidade de números a serem gerados e inseridos em lista
        List<Integer> listaNum = new ArrayList<Integer>();
        Random geradorNum = new Random();

        // geração de números em quantidade definida anteriormente
        for (int i = 0; i <= qtd; i++) {
            // inserção, em lista, de enésimo número pseudoaleatório (um valor entre 1 e máximo)
            listaNum.add(geradorNum.nextInt(max) + 1);
        }

        System.out.println(listaNum);
    }

}