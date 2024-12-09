package estruturswhile;

public class Ex037 {
    public static void main(String[] args) {

        int soma = 0, cont = 1;

        while (cont <= 100) {
            soma += cont;
            cont++;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
