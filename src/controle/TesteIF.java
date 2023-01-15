package controle;

import java.util.Scanner;

public class TesteIF {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = entry.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }

        if(media < 7 && media >= 4.5){
            System.out.println("Recuperacao!");
        }

        boolean criteirioDeReprovacao = media < 4.5 && media >=0;
        if(criteirioDeReprovacao){
            System.out.println("Reprovado!");
        }
            entry.close();
    }
}
