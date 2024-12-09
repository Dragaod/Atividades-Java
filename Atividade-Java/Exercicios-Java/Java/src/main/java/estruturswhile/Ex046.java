package estruturswhile;
import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int n = sc.nextInt(), cont = 1, soma = 0;

        while (cont <= n) {
            if (cont % 2 == 0) {
                soma += cont;
            }
            cont++;

        }
        System.out.println(soma);
    }
}
