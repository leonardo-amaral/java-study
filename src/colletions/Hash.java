package colletions;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> Usuarios = new HashSet<Usuario>();
        Usuarios.add(new Usuario("Leo"));
        Usuarios.add(new Usuario("Ana"));
        Usuarios.add(new Usuario("Gui"));

        boolean resultado = (Usuarios.contains(new Usuario("Guilherme")));
        System.out.println(resultado);
    }
}
