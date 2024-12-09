package atividades;
import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Número de bananas? ");
        double n = sc.nextInt();

        if (n < 12){
            n = n * 0.50;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        } else {
            n = n * 0.40;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        }

    }
}
