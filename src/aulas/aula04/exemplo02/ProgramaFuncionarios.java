package aulas.aula04.exemplo02;

public class ProgramaFuncionarios {

    static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Alexandro dos Santos Silva");
        f1.setCargo("Professor");
        try {
            f1.setSalario(5000);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Salário: " + f1.getSalario());
    }

}
