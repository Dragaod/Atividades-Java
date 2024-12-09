package vetores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> list = new ArrayList<Integer>();
        int maior = 0, menor = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Escreva o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero > maior) {
                maior = numero;
            }else {
                menor = numero;
            }
        }
        System.out.println("O número maior é: " + maior);
        System.out.println("O número menor é: " + menor);
    }
}
