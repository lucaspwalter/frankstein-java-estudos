package main.java.com.estudos.Contador;
import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = num2 - num1;
            int c = 0;
            do {
                c++;
                System.out.println(c);
            } while (c < contagem);
        }
    }
}
