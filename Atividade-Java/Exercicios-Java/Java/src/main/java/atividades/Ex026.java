package atividades;
import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Tabela de Preços:");
        System.out.println("1 - R$ 20.50");
        System.out.println("2 - R$ 26.00");
        System.out.println("3 - R$ 22.13");
        System.out.println("4 - R$ 78.05");

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double preco;
        switch (codigo) {
            case 1 -> preco = 20.50;
            case 2 -> preco = 26.00;
            case 3 -> preco = 22.13;
            case 4 -> preco = 78.05;
            default -> {
                System.out.println("Código inválido!");
                return;
            }
        }
        double total = preco * quantidade;
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", total);

        sc.close();
    }
}
