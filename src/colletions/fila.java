package colletions;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();


        // OFFER e ADD -> adiocionam item a fila
        fila.add("Leo"); // retorna falso
        fila.offer("Bia"); // retorna uma excecao
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //A Diferenca eo comportamento quando a fila esta cheia!
        System.out.println(fila.peek());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
