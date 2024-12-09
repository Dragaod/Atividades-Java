package atividades;
import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escreva o nome do mês: ");
        String mes = sc.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês " + mes + " tem 31 dias.");
                break;
            case "fevereiro":
            case "abril":
            case "junho":
            case "setembro":
                System.out.println("O mês " + mes + " tem 29 dias.");
                break;
            default:
                System.out.println("Esse mês não é valído.");

        }


    }
}
