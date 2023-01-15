package fundamentos;

public class TipoString {
    public static void main(String[] args ){
        System.out.println("Ola pessoal".charAt(0));

        var nome ="Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
    }
}
