package atividades;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int auxiliar;


        System.out.print("Escreva o primeiro numero: ");
        int num = sc.nextInt();
        System.out.print("Escreva outro numero: ");
        int num2 = sc.nextInt();

        auxiliar = num;
        num = num2;
        num2 = auxiliar;
        System.out.println("Versão inversa dos numeros: ");
        System.out.println(num);
        System.out.println(num2);
    }
}
