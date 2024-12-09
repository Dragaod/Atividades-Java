package atividades;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escreva sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Escreva seu genero: ");
        char sexo = sc.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            if (idade >= 65) {
                System.out.print("Pode se aposentar já");
            }else{
                System.out.print("Ainda não pode se aposentar.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60) {
                System.out.println("Pode se aponsentar já.");
            }else {
                System.out.print("Ainda não pode se aposentar.");
            }

        }


    }
}
