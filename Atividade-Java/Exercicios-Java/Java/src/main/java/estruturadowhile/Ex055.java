package estruturadowhile;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número para descobrir a tabuada do mesmo: ");
        int n = sc.nextInt();
        int cont = 1;

        do {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }while (cont <= 10);

    }
}
