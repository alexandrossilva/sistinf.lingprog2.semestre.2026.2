package temp.listas.lista03.questao05;

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
    public void depositar(double deposito) throws IllegalArgumentException {
        // se parâmetro referente ao depósito conter valor negativo ou igual a 0 (zero)...
        if (deposito <= 0) {
            throw new IllegalArgumentException("Saque com valor não positivo!");    // exceção
        }
        // caso contrário...
        else {
            saldo += deposito;              // atualização de saldo subtraindo-se valor sacado
        }
    }

    // operação de registro de saque em conta, com atualização de saldo corrente
    public void sacar(double saque) throws IllegalStateException, IllegalArgumentException {
        // se parâmetro referente ao saque conter valor negativo ou igual a 0 (zero)...
        if (saque <= 0) {
            throw new IllegalArgumentException("Saque com valor não positivo!");    // exceção
        }
        // caso contrário, caso contrário, se saldo, após débito, resultar em valor abaixo de limite negativo...
        else if (saldo - saque < -limite) {
            throw new IllegalStateException("Saldo inferior ao limite negativo!");  // exceção
        }
        // caso contrário...
        else {
            saldo -= saque;         // atualização de saldo subtraindo-se valor sacado
        }
    }

}