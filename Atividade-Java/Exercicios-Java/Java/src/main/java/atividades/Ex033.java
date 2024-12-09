package atividades;
import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escreva o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Escreva o turno do aluno: ");
        char turno = sc.nextLine().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " +aluno );
        }else {
            System.out.println("Boa tarde, " +aluno );
        }
    }
}
