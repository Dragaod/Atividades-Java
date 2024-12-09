package atividades;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura = sc.nextFloat(), peso = sc.nextFloat(), imc;

        imc = peso / (altura * altura);

        System.out.printf("Indice de massa corporal: %.2f", imc);
    }
}
