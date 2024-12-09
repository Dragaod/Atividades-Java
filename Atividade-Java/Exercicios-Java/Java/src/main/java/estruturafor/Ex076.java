package estruturafor;
import java.util.Scanner;

public class Ex076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt(), soma = 0;

        for (int cont = 1; cont <= n; cont++) {
            if (cont % 2 == 0) {
                soma += cont;
            }

        }
        System.out.println(soma);
    }
}
