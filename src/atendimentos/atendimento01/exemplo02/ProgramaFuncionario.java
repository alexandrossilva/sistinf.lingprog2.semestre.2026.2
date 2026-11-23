package atendimentos.atendimento01.exemplo02;

public class ProgramaFuncionario {

    static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        System.out.println("Salário: " + f1.getSalario());
        f1.setSalario(7000);
        System.out.println("Salário: " + f1.getSalario());
        f1.setSalario(-500);
        System.out.println("Salário: " + f1.getSalario());
    }

}
