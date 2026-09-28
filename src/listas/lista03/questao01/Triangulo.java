package temp.listas.lista03.questao01;

public class Triangulo {

    // ângulos internos de um triângulo
    private double angulo1;
    private double angulo2;
    private double angulo3;

    // construtor
    public Triangulo(double ang1, double ang2, double ang3) throws IllegalArgumentException {
        if (ang1 + ang2 + ang3 != 180) {
            throw new IllegalArgumentException("Soma de ângulos (" + (ang1 + ang2 + ang3) +
                    ") não é igual a 180 graus!");
        }
        this.angulo1 = ang1;
        this.angulo2 = ang2;
        this.angulo3 = ang3;
    }

    // métodos getter
    public double getAngulo1() {
        return angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public double getAngulo3() {
        return angulo3;
    }

    // retorno de média dos ângulos do triângulo encapsulado
    public double getMediaAngulos() {
        return (angulo1 + angulo2 + angulo3) / 3;
    }

    // retorno de descrição do triângulo encapsulado indicando-se valores de respectivos ângulos
    public String toString() {
        return angulo1 + ", " + angulo2 + ", " + angulo3;
    }

}
