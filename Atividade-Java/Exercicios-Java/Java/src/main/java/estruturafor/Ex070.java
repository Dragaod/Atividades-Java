package estruturafor;
import java.util.Scanner;

public class Ex070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número para descobrir a tabuada do mesmo: ");
        int n = sc.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(n + " X " + c + " = " + (n * c));
        }
    }
}
