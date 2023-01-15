package fundamentos;

public class Inferencia {
    public static void main(String[] args){
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Text";
        System.out.println(c);
        c = "Outro Texto";
        System.out.println(c);

//        c = 4.5;  ----------- Error pois a variavel 'e de um tipo
        double d; // variavel foi declarada
        d = 123.65; // variavel foi inicializada
        System.out.println(d); // usada!

//        var e;
//        e = 123.45
//        --- Error pois, var nao pode ser declarada, e depois incializada
    }
}
