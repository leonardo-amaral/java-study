package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Ip: ");
        String ip = entrada.nextLine();

        System.out.print("Port: ");
        String port = entrada.nextLine();

        System.out.print("Quantitdade de pacotes: ");
        int pacotes = entrada.nextInt();

        System.out.printf("Atacando %s na porta %s com %d pacotes!",
                ip, port, pacotes);
        entrada.close();
    }
}
