package temp.listas.lista04.questao04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Teclado", 120.00));
        produtos.add(new Produto("Mouse", 80.00));
        produtos.add(new Produto("Monitor", 900.00));
        produtos.add(new Produto("Webcam", 250.00));
        produtos.add(new Produto("Headset", 180.00));

        produtos.remove(1);

        double total = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);

            if (produto.getPreco() >= 200.00) {
                total += produto.getPreco();
                System.out.println(produto.getDescricao());
            }
        }

        System.out.println("Total: R$ " + total);
    }

}
