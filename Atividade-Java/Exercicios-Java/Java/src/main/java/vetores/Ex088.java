package vetores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> list = new ArrayList<Integer>();
        int par = 0, impar = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Escreva o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Par: " + par + " Impar: " + impar);
    }
}
