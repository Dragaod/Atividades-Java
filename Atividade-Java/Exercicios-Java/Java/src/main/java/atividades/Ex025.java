package atividades;
import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escreva seu número de faltas: ");
        int faltas = sc.nextInt();

        if (faltas > 15) {
            System.out.println("Está reprovado por faltas.");
        }else {
            System.out.println("Cuidado para nao reprovar em faltas.");
        }
    }
}
