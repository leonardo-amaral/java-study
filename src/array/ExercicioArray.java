package array;

import java.util.Arrays;

public class ExercicioArray {
    public static void main(String[] args) {
        double[] notasAluno =   new double[3];
        System.out.println(Arrays.toString(notasAluno));

        notasAluno[0] = 7.9;
        notasAluno[1] = 8;
        notasAluno[2] = 6.7;

        System.out.println(Arrays.toString(notasAluno));

        double total = 0;
        for(int i = 0; notasAluno.length < 3; i++){
            total += notasAluno[i];
        }

        System.out.println(total/ notasAluno.length);


        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;

        for(int i = 0; i < notasAlunoB.length; i++){
        totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
