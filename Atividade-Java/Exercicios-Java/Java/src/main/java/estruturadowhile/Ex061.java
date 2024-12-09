package estruturadowhile;
import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int n = sc.nextInt(), cont = 1, soma = 0;

        do {
            if (cont % 2 == 0) {
                soma += cont;
            }
            cont++;

        } while (cont <= n);
        System.out.println(soma);
    }

}
