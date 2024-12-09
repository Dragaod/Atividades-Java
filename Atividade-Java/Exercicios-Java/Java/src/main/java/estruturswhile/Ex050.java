package estruturswhile;
import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int cont = 0;

        while (true) {
            System.out.print("Escreva seu nome: ");
            String nome = sc.nextLine().toLowerCase();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Escreva sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
            cont++;

        }
        System.out.printf("A media das idades são: %.2f", soma / cont);
    }
}
