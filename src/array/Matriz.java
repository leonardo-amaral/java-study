package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por alunos? ");
        int qntdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qntdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length ; i++) {
            for (int n = 0; n < notasDaTurma[n].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i + 1 , n + 1);
                notasDaTurma[i][n] = entrada.nextDouble();
                total += notasDaTurma[i][n];
            }
        }

        double media = total / (qtdeAlunos * qntdNotas);
        System.out.println("Media da turma e" + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
