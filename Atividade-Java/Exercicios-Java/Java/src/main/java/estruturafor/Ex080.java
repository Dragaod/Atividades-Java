package estruturafor;
import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int cont = 0;

        for (;;) {
            System.out.print("Escreva seu nome: ");
            String nome = sc.nextLine().toLowerCase();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Agora escreva sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
            cont++;

        }
        System.out.printf("A media das idades são: %.2f", soma / cont);
    }

}
