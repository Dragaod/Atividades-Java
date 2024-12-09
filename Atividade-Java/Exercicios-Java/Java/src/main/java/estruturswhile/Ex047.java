package estruturswhile;

public class Ex047 {
    public static void main(String[] args) {
        int cont = 1;

        System.out.print("Números ímpares: ");
        while (cont <= 50) {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}
