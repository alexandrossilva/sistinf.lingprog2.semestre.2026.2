package aquecimento.atividade01;

public class Veiculo {

    private String modelo;          // modelo
    private String placa;           // número de placa
    private String cor;             // cor predominante
    private int quilometragem;      // quilômetros até então rodados pelo veículo

    public Veiculo(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;

        this.quilometragem = 0;      // inicialização de quilometragem
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    // acréscimo de nova quilometragem rodada indicando-se, como parâmetro,
    // nova quantidade de quilômetros
    public void adicionarQuilometragemRodada(int novaQuilometragem) {
        // atualização de quantidade, até então rodada, de quilômetros
        this.quilometragem = this.quilometragem + novaQuilometragem;
    }

}
