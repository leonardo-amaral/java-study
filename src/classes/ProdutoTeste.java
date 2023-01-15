package classes;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.80, 0.25);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        double mediaCarrinho = (precoFinal1 - precoFinal2) /2;

        System.out.println("Valor do notebook com desconto: "+precoFinal1);
        System.out.println("Valor da caneta com desconto: "+ precoFinal2);

        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
    }
}
