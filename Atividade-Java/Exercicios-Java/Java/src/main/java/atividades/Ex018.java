package atividades;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escreva outro numero: ");
        int num2 = sc.nextInt(), maior;

        if (num1 > num2) {
            maior = num1;
        }else {
            maior = num2;
        }
        System.out.println("O maior numero é: " + maior);
    }
}
