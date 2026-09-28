package temp.listas.lista04.questao07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaFuncionarios {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<Funcionario>();
        int op;

        do {
            System.out.println();
            menu();
            System.out.print("Próxima operação: ");
            op = Integer.parseInt(input.nextLine());

            switch (op) {
                case 1: adicionarFuncionario(lista, input); break;
                case 2: listarFuncionarios(lista); break;
                case 3: consultarSomaSalarios(lista, input);
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("|--------- OPERAÇÕES --------|");
        System.out.println("| 0 -> Encerrar              |");
        System.out.println("| 1 -> Cadastrar Funcionário |");
        System.out.println("| 2 -> Listar Funcionários   |");
        System.out.println("| 3 -> Listar Soma Salarial  |");
        System.out.println("|----------------------------|");
    }

    public static void adicionarFuncionario(List<Funcionario> lista, Scanner input) {
        System.out.println("INFORME OS DADOS DO FUNCIONÁRIO");
        System.out.print("Nome.........: ");
        String nome = input.nextLine();
        System.out.print("Cargo........: ");
        String cargo = input.nextLine();
        System.out.print("Salário em R$: ");
        double salario = Double.parseDouble(input.nextLine());

        Funcionario f = new Funcionario(nome, cargo, salario);

        lista.add(f);
        System.out.println("FUNCIONÁRIO ADICIONADO!");
    }

    public static void listarFuncionarios(List<Funcionario> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há funcionários cadastrados!");
        }
        else {
            System.out.println("Funcionários:");
            for (int i = 0; i<lista.size();i++) {
                Funcionario f = lista.get(i);
                System.out.println(f.getNome() + ", com salário de R$ " + f.getSalario());
            }
        }
    }

    public static void consultarSomaSalarios(List<Funcionario> lista, Scanner input) {
        System.out.print("Informe cargo para o qual seja consultar soma de salários de respectivos funcionários: ");
        String cargo = input.nextLine();

        double somaSalarial = getSomaSalarios(lista, cargo);

        System.out.println("Soma de salários: " + somaSalarial);
    }

    // obtenção e retorno de soma de salários de funcionários da lista que ocupam determinado cargo
    public static double getSomaSalarios(List<Funcionario> listaFunc, String cargo) {
        double somaSalarios = 0;                        // inicialização de totalizador

        // iteração entre funcionários da lista de acordo com tamanho dela
        for (int i = 0; i < listaFunc.size(); i++) {
            Funcionario f = listaFunc.get(i);                   // obtenção de enésimo funcionário
            // se cargo parametrizado for nulo ou idêntico ao cargo do funcionário...
            if (cargo == null || f.getCargo().equalsIgnoreCase(cargo)) {
                somaSalarios = somaSalarios + f.getSalario();   // acréscimo, ao totalizador, do salário dele
            }
        }

        return somaSalarios;                                    // retorno de totalizador
    }

}