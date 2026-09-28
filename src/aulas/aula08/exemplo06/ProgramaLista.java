package aulas.aula08.exemplo06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProgramaLista {

    static void main(String[] args) {
        List<Funcionario> lista = new LinkedList<Funcionario>();

        Funcionario f1 = new Funcionario("Alex", "Engenheiro de Dados", 15000);
        Funcionario f2 = new Funcionario("Maria", "Analista de Suporte", 2000);
        Funcionario f3 = new Funcionario("Paulo", "Arquiteto de Soluções em Nuvem", 20000);

        lista.add(f1);
        lista.add(0, f2);
        lista.add(f3);

        listarFuncionarios(lista);
    }

    public static void listarFuncionarios(List<Funcionario> lista) {
        System.out.println("Funcionários:");
        for (int i = 0; i<lista.size();i++) {
            Funcionario f = lista.get(i);
            System.out.println(f.getNome() + ", com salário de R$ " + f.getSalario());
        }
    }

}
