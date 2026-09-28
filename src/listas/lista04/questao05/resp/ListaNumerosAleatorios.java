package temp.listas.lista04.questao05.resp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

        System.out.println(listaNum);           // listagem de números da lista

        consultarIntervalo(listaNum);           //  consulta de intervalo com base em número da lista
    }

    // consulta, a partir de dados de entrada padrão, de inteiros da lista que pertençam a determinado intervalo
    public static void consultarIntervalo(List<Integer> listaNum) {
        // instanciação de objeto Scanner associado à entrada padrão (teclado)
        Scanner input = new Scanner(System.in);

        // entrada, pelo usuário, de intervalo numérico
        System.out.print("Digite dois inteiros que representam intervalo numérico: ");
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());

        // obtenção e listagem de soma dos inteiros da lista que estejam em intervalo
        int soma = getSomaNumerosIntervalo(listaNum, a, b);
        System.out.printf("Soma de números do intervalo [%d %d]: %d", a, b, soma);
    }

    // obtenção e retorno de soma de inteiros inseridos em lista que pertençam a determinado intervalo
    public static int getSomaNumerosIntervalo(List<Integer> listaNum, int limiteInf, int limiteSup) {
        int soma = 0;       // inicialização de totalizador

        // iteração entre números da lista de acordo com tamanho dela
        for (int i = 0; i < listaNum.size(); i++) {
            int n = listaNum.get(i);                    // obtenção de enésimo inteiro
            if (n >= limiteInf &&  n <= limiteSup) {    // se enésimo inteiro pertencer à intervalo...
                soma = soma + listaNum.get(i);          // acréscimo, ao totalizador, de enésimo inteiro
            }
        }

        return soma;                                    // retorno de totalizador
    }

}