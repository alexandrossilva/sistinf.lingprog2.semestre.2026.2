package aulas.aula08.exemplo05;

import java.util.ArrayList;
import java.util.List;

public class ProgramaLista {

    static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<Funcionario>();

        Funcionario f1 = new Funcionario("Alex", "Engenheiro de Dados", 15000);
        Funcionario f2 = new Funcionario("Maria", "Analista de Suporte", 2000);
        Funcionario f3 = new Funcionario("Paulo", "Arquiteto de Soluções em Nuvem", 20000);

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);

        System.out.println("Lista: " + lista);
    }

}
