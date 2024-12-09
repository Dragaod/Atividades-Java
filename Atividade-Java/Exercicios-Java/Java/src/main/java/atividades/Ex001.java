package atividades;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escreva o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("A soma desses numeros são: " + (num1 + num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A divisão é: " + (num2 / num1));
        System.out.println("A multiplicação é: " + (num1 * num2));

    }
}
