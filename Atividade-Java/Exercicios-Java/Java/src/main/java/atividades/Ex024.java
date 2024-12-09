package atividades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> numeros = new ArrayList<>();

        for (int num = 1; num <= 3; num++) {
            System.out.print("Escreva o " + num + " número: ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        System.out.println("Números na ordem original: " + numeros);
        Collections.sort(numeros);
        System.out.print("Números na ordem crescente: " );
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
