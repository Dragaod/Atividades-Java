package atividades;
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Escreva a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Ele está aprovado!");

        }else {
            System.out.println("Ele esta reprovado reprovado :(");
        }
    }
}
