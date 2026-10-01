package avaliacoes.avaliacao01.questao03;

import java.util.ArrayList;
import java.util.List;

public class ListaAlunos {

    static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Ana", 7.0);
        Aluno a2 = new Aluno("Bruno", 8.0);
        Aluno a3 = new Aluno("Carlos", 6.0);
        Aluno a4 = new Aluno("Daniela", 9.0);
        Aluno a5 = new Aluno("Eduardo", 7.5);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.get(1).setNota(9.0);
        alunos.add(1, a4);
        alunos.remove(2);
        alunos.remove(0);
        alunos.add(0, a5);

        Aluno aluno = alunos.get(alunos.size() - 1);

        System.out.println(aluno.getNome() + " - " + aluno.getNota());
    }

}
