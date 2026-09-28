package temp.listas.lista04.questao06.resp;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionarAumentoSalarial(double aumento) throws IllegalArgumentException {
        if (aumento <= 0) {
            throw new IllegalArgumentException("Aumento inválido!");
        }
        else {
            salario = salario + aumento;
        }
    }

    public void reajustarSalario(double percentual) throws IllegalArgumentException {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual inválido!");
        }
        else {
            double aumento = percentual / 100 * salario;
            salario = salario + aumento;
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

}
