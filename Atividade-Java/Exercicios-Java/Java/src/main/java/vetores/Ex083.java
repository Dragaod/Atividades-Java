package vetores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex083 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        int soma = 0;

        for (int c = 1; c <= 3; c++) {
            System.out.print("Escreva um numero: ");
            int numero = entrada.nextInt();
            soma += numero;
            lista.add(numero);
        }
        System.out.println("Media: " + soma/7);
    }
}
