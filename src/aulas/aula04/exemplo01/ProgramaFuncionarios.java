package aulas.aula04.exemplo01;

public class ProgramaFuncionarios {

    static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Alexandro dos Santos Silva");
        f1.setCargo("Professor");
        f1.setSalario(-5000);
        System.out.println("Salário: " + f1.getSalario());
    }

}
