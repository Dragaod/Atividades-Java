package estruturafor;
import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escreva um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (;n > 0;) {
            fatorial *= n;
            n--;
        }
        System.out.println(fatorial);
    }
}
