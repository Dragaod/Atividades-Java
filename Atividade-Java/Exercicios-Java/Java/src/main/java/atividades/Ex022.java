package atividades;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o valor de seu salário: ");
        double valor = sc.nextDouble(), sal = 0;

        if (valor > 2000) {
            sal = valor + (valor * 0.10);
            System.out.print("Salário com o aumento de 10%: " + sal);
        }else {
            sal = valor + (valor * 0.05);
            System.out.print("Salário com o aumento de 5%: " + sal);
        }
    }
}
