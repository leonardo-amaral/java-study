package controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
    Scanner value = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int newValue = value.nextInt();

        if(newValue % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }
    }
}
