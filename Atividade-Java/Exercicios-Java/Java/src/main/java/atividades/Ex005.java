package atividades;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escreva o valor do produto:");
        double precoProduto = sc.nextDouble();

        System.out.println("Escreva a quantidade do produto:");
        int quantidade = sc.nextInt();

        double precoTotal = precoProduto * quantidade;
        if (quantidade >= 10) {
            double soma = precoTotal - (precoTotal * 0.10);
            System.out.printf("Valor total a ser pago com desconto: %.2f%n", soma);
        }else {
            System.out.printf("Valor total a ser pago: %.2f%n", precoTotal);
        }




    }
}
