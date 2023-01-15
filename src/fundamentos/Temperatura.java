package fundamentos;

public class Temperatura {
    public static void main(String[] args){
        //(F - 32) X 5/9 = C
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsiu = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado e: " + celsiu);

        fahrenheit = 0;
        celsiu = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado e: " + celsiu);
    }
}
