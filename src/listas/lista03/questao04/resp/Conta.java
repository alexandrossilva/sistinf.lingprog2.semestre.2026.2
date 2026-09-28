package temp.listas.lista03.questao04.resp;

public class Conta {

    private double saldo;        // saldo corrente
    private double limite;       // limite (indicativo de valor negativo máximo admitido para o saldo)

    // método construtor de inicialização de saldo mínimo
    public Conta(double limite) {
        this.saldo = 0;           // inicialização de saldo atual (corrente) com 0 (zero)
        this.limite = limite;
    }

    // retorno de valor atual do limite
    public double getLimite() {
        return limite;
    }

    // retorno de valor atual do saldo corrente
    public double getSaldo() {
        return saldo;
    }

    // operação de registro de depósito em conta, com atualização de saldo corrente
    public void depositar(double deposito) {
        saldo += deposito;
    }

    // operação de registro de saque em conta, com atualização de saldo corrente
    public void sacar(double saque) throws IllegalStateException {
        // se saldo, após débito, resultar em valor abaixo de limite negativo...
        if (saldo - saque < -limite) {
            throw new IllegalStateException("Saldo inferior ao limite negativo!");   // exceção
        }
        // caso contrário...
        else {
            saldo -= saque;         // atualização de saldo subtraindo-se valor sacado
        }
    }

}
