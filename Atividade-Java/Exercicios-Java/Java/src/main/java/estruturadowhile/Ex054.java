package estruturadowhile;
import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1, soma = 0;

        do {
            System.out.print("Escreva o " + cont +" número");
            int num = sc.nextInt();
            soma += num;
            cont++;
        } while (cont <= 5);
        System.out.println("A média aritmética é: " + soma / 5);
        sc.close();
    }

}
