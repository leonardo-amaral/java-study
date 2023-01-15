package colletions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> Livros = new ArrayDeque<String>();

        Livros.add("Ben 10");
        Livros.push("Batman");
        Livros.push("Hobbit");

        // Retorna o ultimo item a ser adicionado!
        System.out.println(Livros.peek());

        System.out.println(Livros.poll());
        System.out.println(Livros.poll());
        System.out.println(Livros.poll());
//        System.out.println(Livros.pop());

        Livros.size();
        Livros.contains("");
        Livros.isEmpty();

        for(String Livro: Livros){
            System.out.println(Livro);
        }

    }
}
