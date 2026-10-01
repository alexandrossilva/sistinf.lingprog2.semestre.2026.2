package avaliacoes.avaliacao01.questao03;

public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome, double nota) throws IllegalArgumentException {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida");
        }

        this.nota = nota;
    }

    public double getMedia(double outraNota) throws IllegalArgumentException {
        if (outraNota < 0 || outraNota > 10) {
            throw new IllegalArgumentException("Nota inválida");
        }

        return (nota + outraNota) / 2;
    }

}
