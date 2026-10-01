package avaliacoes.avaliacao01.questao02;

public class ProgramaAluno {

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Carlos", 8);
            aluno.setNota(9);
            System.out.println(aluno.getMedia(7));
            aluno.setNota(11);
            System.out.println(aluno.getMedia(10));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa encerrado");
    }

}
