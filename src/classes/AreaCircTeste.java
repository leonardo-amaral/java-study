package classes;

import java.awt.geom.Area;

public class AreaCircTeste  {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        a1.pi = 10;
        System.out.println(a1.Area());

        AreaCirc a2 = new AreaCirc(15);
        a2.pi = 3;
        System.out.println(a2.Area());

    }

}
