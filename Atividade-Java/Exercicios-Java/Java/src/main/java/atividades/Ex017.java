package atividades;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escreva sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16 && idade <= 24) {
            System.out.println("Você é adolescente");
        }else if (idade < 16) {
            System.out.println("Você é ciança");
        }else if (idade <= 49) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }
    }
}
