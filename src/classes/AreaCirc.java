package classes;

public class AreaCirc {
    double raio;
    double pi;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double Area(){
        return raio * Math.pow(raio, 2);
    }
}
