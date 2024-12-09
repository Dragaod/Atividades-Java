package estruturafor;
import java.util.Scanner;

public class Ex072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número inteiro: ");
        int n = sc.nextInt();

        boolean ehPrimo = true;
        int divisor = 2;

        int mul = divisor * divisor;

        for (mul = 1; mul <= divisor; mul++) {
            if (n % divisor == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        sc.close();

    }
}

