package colletions;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Size: "+conjunto.size());

        conjunto.add("Teste");
        conjunto.add("X");
        System.out.println("Tamanho 'e"+ conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("X"));

        System.out.println("Tamanho 'e"+ conjunto.size());
        System.out.println(conjunto.contains('X'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // Uniao entre dois conjuntos.
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
