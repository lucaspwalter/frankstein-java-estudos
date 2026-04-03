package main.java.com.estudos.Repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o Numero que voce deseja ver a tabuada");
            int tabuada = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

            }

        }
        catch (InputMismatchException e) {
            System.err.println("O campo deve ser numerico");
        }
    }
}