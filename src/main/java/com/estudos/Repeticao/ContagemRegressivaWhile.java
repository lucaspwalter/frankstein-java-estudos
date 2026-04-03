package main.java.com.estudos.Repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContagemRegressivaWhile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o numero que voce deseja fazer a contagem (1 a 100)");
            int numeroContagem = scanner.nextInt();
            System.out.println("Contando...");
            while (numeroContagem > 0) {
                System.out.println(numeroContagem);
                numeroContagem--;
            }
            System.out.println("Fim da contagem.");
        } catch (InputMismatchException e) {
            System.err.println("O campo deve ser numerico");
        }
    }
}
