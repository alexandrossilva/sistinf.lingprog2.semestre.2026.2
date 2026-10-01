package avaliacoes.avaliacao01.questao01;

public class SimulacaoAtualizacaoEstoque {

    public static void main(String[] args) {
        Estoque est = null;

        try {
            est = new Estoque(20);

            est.retirar(5);
            est.adicionar(10);
            est.retirar(30);

            System.out.println(est.getQuantidade());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro de argumento");

        } catch (IllegalStateException e) {
            System.out.println("Erro de estado");
        }

        System.out.println(est.getQuantidade());
    }

}
