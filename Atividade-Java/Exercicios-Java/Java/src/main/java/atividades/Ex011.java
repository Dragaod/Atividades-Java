package atividades;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float media = 0;
        for (float num = 1; num <= 3; num++) {
            System.out.printf("\n" + "Escreva a %.0fª nota: ", num);
            float nota = sc.nextFloat();
            media = nota / 3;
        }
        System.out.printf("Media dos alunos: %.2f", media);
    }
}
