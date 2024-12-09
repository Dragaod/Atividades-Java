package atividades;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu salário: ");
        double a = sc.nextDouble();

        double soma = a + (a * 0.5);

        System.out.printf("Seu salário é: %.2f", soma);

    }
}
