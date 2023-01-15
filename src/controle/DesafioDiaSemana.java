package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um dia da semana: ");
        String valueEntry = entrada.next();

        // comparar string usar  documentacao do equals


        if(valueEntry.equalsIgnoreCase("domingo")){
            System.out.println(1);
        } else if (valueEntry.equalsIgnoreCase("quarta")){
            System.out.println(4);
        }else if (valueEntry.equalsIgnoreCase("terca")){
            System.out.println(3);
        }


        entrada.close();
    }
}
