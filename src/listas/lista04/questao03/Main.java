package temp.listas.lista04.questao03;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Aluno> alunos = new LinkedList<Aluno>();

        Aluno a = new Aluno("Ana");
        Aluno b = new Aluno("Bruno");
        Aluno c = new Aluno("Carlos");
        Aluno d = new Aluno("Daniel");

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);

        alunos.remove(1);

        alunos.add(1, new Aluno("Eduardo"));

        alunos.remove(2);

        System.out.println(alunos);
    }

}
