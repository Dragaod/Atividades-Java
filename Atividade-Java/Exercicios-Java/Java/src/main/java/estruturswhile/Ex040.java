package estruturswhile;
import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada: ");
        int n = sc.nextInt();
        int cont = 1;

        while (cont <= 10) {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }
    }
}
