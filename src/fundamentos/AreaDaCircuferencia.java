package fundamentos;

public class AreaDaCircuferencia {
    public static void main(String[] args){
        // Quando se adiciona final antes do tipo da variavel, passa a ser uma constante!
        //Constantes por costumes, deve sempre ter nome em letra maiscula!
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = "+area);
    }
}
