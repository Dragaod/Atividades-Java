package atividades;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Escreva um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Seu número é par");
        }else {
            System.out.println("Seu número é impar");
        }
    }
}
