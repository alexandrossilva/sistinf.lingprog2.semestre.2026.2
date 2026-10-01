package avaliacoes.avaliacao01.questao04;

import java.util.LinkedList;
import java.util.List;

public class ListaContas {

    static void main(String[] args) {
        List<Conta> contas = new LinkedList<Conta>();

        Conta c1 = new Conta(101, 500);
        Conta c2 = new Conta(102, 300);
        Conta c3 = new Conta(103, 800);
        Conta c4 = new Conta(104, 600);
        Conta c5 = new Conta(105, 700);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.get(0).depositar(100);
        contas.add(1, c4);
        contas.get(2).sacar(200);
        contas.remove(0);
        contas.add(0, c5);
        contas.remove(2);

        Conta conta = contas.get(contas.size() / 2);

        System.out.println(conta);
    }

}
