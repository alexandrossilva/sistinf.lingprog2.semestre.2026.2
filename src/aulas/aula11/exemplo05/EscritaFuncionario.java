package aulas.aula11.exemplo05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Escrita de dados de funcionários em arquivo de texto usando a classe PrintWriter
public class EscritaFuncionario {

    static void main(String[] args) {
        String caminhoArquivo = "funcionarios.txt";     // caminho do arquivo no qual serão realizadas operações de escrita
        PrintWriter fluxo = null;                       // fluxo de escrita
        Scanner scanner = new Scanner(System.in);       // scanner de fluxo de entrada padrão (teclado)

        try {
            Funcionario func = lerFuncionario(scanner); // leitura de dados de funcionário e retorno de respectivo objeto

            // criação de fluxo de escrita baseado em caminho de arquivo definido anteriormente (conteúdo anterior do arquivo é sobrescrito)
            fluxo = new PrintWriter(caminhoArquivo);
            // escrita de caracteres em arquivo invocando-se, a partir de referência do objeto, método toString sobrescrito na classe Funcionario
            fluxo.println(func);
            System.out.println("Funcionário gravado em arquivo!");
            fluxo.close();                              // fechamento de fluxo de escrita
            scanner.close();                            // fechamento de fluxo de entrada usado pelo scanner
        } catch (FileNotFoundException e) {             // captura de exceção por inexistência de arquivo
            System.out.println("Arquivo inexistente no caminho indicado!");
        } catch (IOException e) {                       // captura de exceção por erro de entrada/saída
            System.out.println("Erro em operação de saída!");
        }
    }

    // Leitura de dados de funcionário e, após isso, retorno de objeto Funcionário instanciado com tais dados
    public static Funcionario lerFuncionario(Scanner scanner) {
        System.out.println("Digite os dados do funcionario:");
        System.out.print("Nome...: ");
        String nome = scanner.nextLine();                                   // leitura de linha de texto correspondente ao nome
        System.out.print("Cargo..: ");
        String cargo = scanner.nextLine();                                  // leitura de linha de texto correspondete ao cargo
        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());            // leitura de salário considerando-se conversão de linha de texto em número

        Funcionario funcionario = new Funcionario(nome, cargo, salario);    // instanciação de objeto com dados lidos

        return funcionario;                                                 // retorno de objeto
    }

}
