package aulas.aula04.exemplo03;

public class GerenciadorConta {

    static void main(String[] args) {
        Conta c1 = new Conta(50);
        c1.depositar(500);
        c1.sacar(551);
        System.out.println(c1.getSaldo());
    }

}
