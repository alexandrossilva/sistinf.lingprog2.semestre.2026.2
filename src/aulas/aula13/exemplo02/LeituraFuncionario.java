package aulas.aula13.exemplo02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraFuncionario {

    public static String caminhoArquivo = "funcionarios.txt";

    public static void main(String[] args) {
        Funcionario f = recuperarFuncionario();
        System.out.println("DADOS DO FUNCIONÁRIO RECUPERADO");
        System.out.println("Nome...: " + f.getNome());
        System.out.println("Cargo..: " + f.getCargo());
        System.out.println("Salário: " + f.getSalario());
    }

    public static Funcionario recuperarFuncionario() {
        FileReader fr = null;
        BufferedReader br = null;
        Funcionario func = null;

        try {
            fr = new FileReader(caminhoArquivo);
            br  = new BufferedReader(fr);

            String linha = br.readLine();

            br.close();
            fr.close();

            String[] dados = linha.split(",");

            String nome = dados[0];
            String cargo = dados[1];
            double salario = Double.parseDouble(dados[2]);

            func = new Funcionario(nome, cargo, salario);
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou não acessível!");
        }
        catch(IOException e) {
            System.out.println("Erro de entrada/saída");
        }

        return func;
    }

}
