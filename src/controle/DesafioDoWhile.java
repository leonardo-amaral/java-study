package controle;

import java.util.Scanner;

public class DesafioDoWhile {
//    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        double notasInvalidas = 0;
//        double total = 0;
//        double count = 0;
//        double firstValue = 0;
//
//        do {
//            System.out.print("Insira um valor: ");
//            firstValue = entrada.nextDouble();
//            if(total < 0 || total > 10){
//                System.out.println("Valor invalido" + total);
//            }
//        } while (total != -1);
//
//        entrada.close();
//    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.println("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                quantidadeDeNotas++;
            } else {
                System.out.println("Nota invalida!!!!");
            }
        }

        // Calcular a media

        double media = total / quantidadeDeNotas;
        System.out.println("Media = " + media);



    }

}
