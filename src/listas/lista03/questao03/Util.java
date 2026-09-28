package temp.listas.lista03.questao03;

import temp.listas.lista03.questao01.Triangulo;

public class Util {

    static void main(String[] args) {
        final int QTD    = 5;                    // quantidade de objetos
        Triangulo[] t    = new Triangulo[QTD];   // array de objetos
        int qtdExcecoes = 0;                     // totalizador de exceções

        for (int i = 0; i < QTD; i++) {
            try {
                switch(i) {
                    case 0: t[i] = new Triangulo(50, 60, 70); break;
                    case 1: t[i] = new Triangulo(75, t[i - 1].getMediaAngulos(), 45); break;
                    case 2: t[i] = new Triangulo(t[i - 1].getAngulo2() + 45, 70, 5); break;
                    case 3: t[i] = new Triangulo(60, 45, t[i - 1].getAngulo3() + 20); break;
                    case 4: t[i] = new Triangulo(120, 110, 135);
                }
            }
            catch(IllegalArgumentException e) {
                qtdExcecoes++;                     // atualização de totalizador
            }
        }

        // listagem de objeto indicado por totalizador de exceções
        System.out.println(t[qtdExcecoes]);
    }

}
