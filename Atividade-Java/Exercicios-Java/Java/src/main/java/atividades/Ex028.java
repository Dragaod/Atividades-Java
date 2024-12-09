package atividades;
import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {

        Scanner imc = new Scanner(System.in);

        float altura, peso, resultado;

        System.out.print("Escreva seu altura: ");
        altura = imc.nextFloat();

        System.out.print("Escreva seu peso: ");
        peso = imc.nextFloat();

        resultado = peso / (altura * altura);

        if (resultado <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (resultado >= 18.5 && resultado <= 24.9) {
            System.out.println("Peso Ideal ");
        }
        else if (resultado >= 25 && resultado <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (resultado >= 30 && resultado <= 34.9) {
            System.out.println("Obesidade grau 1 ");
        }
        else if (resultado >= 35 && resultado <= 39.9) {
            System.out.println("Obesidade grau 2 ");
        }
        else {
            System.out.println("Obesidade grau 3 ");
        }
        imc.close();
    }
}
