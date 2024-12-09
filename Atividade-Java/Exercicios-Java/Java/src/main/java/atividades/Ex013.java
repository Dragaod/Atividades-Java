package atividades;
import java.util.Scanner;


public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um numero inteiro: ");
        int num = sc.nextInt();
        System.out.print("Escreva outro numero inteiro: ");
        int num2 = sc.nextInt();

        if (num % num2 == 0) {
            System.out.println("é multiplo");

        }else {
            System.out.println("não é multiplo");
        }
    }
}
