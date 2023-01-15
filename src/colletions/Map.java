package colletions;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> Usuarios = new HashMap<>();
        Usuarios.put(1, "Roberto");
        Usuarios.put(1, "Leonardo");
        Usuarios.put(2, "Regiane");
        Usuarios.put(3, "Bia");
        Usuarios.put(50, "Mike");

        System.out.println(Usuarios.size());
        System.out.println(Usuarios.keySet());
        System.out.println(Usuarios.values());
        System.out.println(Usuarios.entrySet());
        System.out.println(Usuarios.containsKey(50));
        System.out.println(Usuarios.containsValue("Leonardo"));
        System.out.println(Usuarios.get(50));

        for (int chave :Usuarios.keySet()){
            System.out.println(chave);
        }

        for(String Values: Usuarios.values()){
            System.out.println(Values);
        }

        for(java.util.Map.Entry<Integer, String>Registro: Usuarios.entrySet()){
            System.out.println(Registro.getKey()+"-"+Registro.getValue());
        }

    }
}
