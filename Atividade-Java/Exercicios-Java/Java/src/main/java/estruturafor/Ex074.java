package estruturafor;
import java.util.Scanner;

public class Ex074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Escreva o nome da " + c + " pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Escreva a idade da " + c + " pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
        }
        System.out.printf("A media das idades é: %.2f", soma / 5);
    }

}
