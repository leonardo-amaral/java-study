package colletions;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Leo");
        lista.add(u1);
        lista.add(new Usuario("Renan"));
        lista.add(new Usuario("Raquel"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Joelma"));


        //Chama o constructor ToString() implicitamente
        for(Usuario u: lista){
            System.out.println(u);
        }

        System.out.println("----------------");

        lista.remove(1);
        lista.remove(new Usuario("Bia"));

        //Nao chama o constructor ToString()
        for(Usuario u: lista){
            System.out.println(u.nome);
        }

        System.out.println("----------------");

        System.out.println(lista.get(3).nome);
    }
}
