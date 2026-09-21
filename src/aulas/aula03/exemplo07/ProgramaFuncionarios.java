package aulas.aula03.exemplo07;

public class ProgramaFuncionarios {

    static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Alexandro dos Santos Silva");
        f1.setCargo("Professor");
        f1.setSalario(-5000);
        System.out.println("Salário: " + f1.getSalario());
    }

}
