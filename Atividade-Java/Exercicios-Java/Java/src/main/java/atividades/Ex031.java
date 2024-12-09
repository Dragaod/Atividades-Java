package atividades;
import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double salMinimo = 1420;

        System.out.print("Escreva seu salario: ");
        double sal = sc.nextDouble();

        double media = sal / salMinimo;

        System.out.printf("O funcionário recebe %.2f salários-mínimos.", media);

    }
}
