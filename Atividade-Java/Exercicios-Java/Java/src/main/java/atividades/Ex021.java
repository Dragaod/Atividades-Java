package atividades;
import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0, menor = 0;


        for (int num = 1; num <= 4; num++) {
            System.out.print("Escreva um numero: ");
            int nu = sc.nextInt();
            if (nu >= 18) {
                maior++;
            }else {
                menor++;
            }

        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maior);
        System.out.println("Quantidade de pessoas menores de idade: " + menor);

    }
}
