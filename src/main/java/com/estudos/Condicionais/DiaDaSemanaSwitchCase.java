package main.java.com.estudos.Condicionais;
import java.util.Scanner;

// Objetivo: Ler um numero de 1 a 7 via terminal e exibir o nome do dia da semana correspondente,
// utilizando switch case. Tratar entradas fora do intervalo valido.
public class DiaDaSemanaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero correspondente ao dia da semama atual (1 a 7)");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Segunda");
            break;
            case 2: System.out.println("Terca");
                break;
            case 3: System.out.println("Quarta");
                break;
            case 4: System.out.println("Quinta");
                break;
            case 5: System.out.println("Sexta");
                break;
            case 6: System.out.println("Sabado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default: System.out.println("Digite um numero valido");
        }
        scanner.close();
    }
}
