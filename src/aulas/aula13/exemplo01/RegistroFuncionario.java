package aulas.aula13.exemplo01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegistroFuncionario {

    public static String caminhoArquivo = "funcionarios.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario f = lerFuncionario(scanner);
        salvarFuncionario(f);
    }

    public static Funcionario lerFuncionario(Scanner scanner) {
        System.out.println("DIGITE DADOS DO NOVO FUNCIONÁRIO");
        System.out.print("Nome...........: ");
        String nome =  scanner.nextLine();
        System.out.print("Cargo..........: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário inicial: ");
        double salario = Double.parseDouble(scanner.nextLine());

        Funcionario func = new Funcionario(nome, cargo, salario);

        return func;
    }

    public static void salvarFuncionario(Funcionario func) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(caminhoArquivo, true);
            pw  = new PrintWriter(fw);

            pw.println(func.getNome() + "," + func.getCargo() + "," + func.getSalario());

            pw.close();
            fw.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou não acessível!");
        }
        catch(IOException e) {
            System.out.println("Erro de entrada/saída");
        }
    }

}
