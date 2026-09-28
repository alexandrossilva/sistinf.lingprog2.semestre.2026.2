package temp.listas.lista03.questao01;

public class Util {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(50, 60, 70);
        Triangulo t2 = new Triangulo(75, t1.getMediaAngulos(), 45);
        Triangulo t3 = new Triangulo(t2.getAngulo2() + 45, 70, 5);
        Triangulo t4 = new Triangulo(60, 45, t3.getAngulo3() + 20);
        Triangulo t5 = new Triangulo(120, 110, 135);
    }

}
