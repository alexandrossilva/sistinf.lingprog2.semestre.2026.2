package avaliacoes.avaliacao01.questao01;

public class Estoque {

    private int quantidade;

    public Estoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inicial inválida");
        }

        this.quantidade = quantidade;
    }

    public void retirar(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        if (quantidade > this.quantidade) {
            throw new IllegalStateException("Estoque insuficiente");
        }

        this.quantidade -= quantidade;
    }

    public void adicionar(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.quantidade += quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

}