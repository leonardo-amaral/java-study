package array;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        double[] notas  = {9.9, 8.8, 7.2, 9.4};
        String[] names = {"Joao", "Leo", "Vitor", "Renan"};
        double[] lenghtFixed = new double[4];
        List<Double> nome = new ArrayList<Double>();


        for (double nota: notas){
            AlunoClass aluno = new AlunoClass("", nota);
            System.out.println(aluno.nota);
        }

        for(int i = 0; i < lenghtFixed.length; i++){
            nome.add((double)i);
        }

        System.out.println(nome);
    }
}
