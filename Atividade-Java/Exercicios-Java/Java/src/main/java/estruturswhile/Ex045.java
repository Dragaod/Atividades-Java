package estruturswhile;

public class Ex045 {
    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        while (a <= 20) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
