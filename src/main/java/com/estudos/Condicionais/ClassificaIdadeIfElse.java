package main.java.com.estudos.Condicionais;
import java.util.Scanner;

public class ClassificaIdadeIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

        if (idade >= 1 && idade <= 12)
            System.out.println("Crianca");
        else if (idade <= 17)
            System.out.println("Adolescente");
        else if (idade <= 21)
            System.out.println("Jovem");
        else if (idade <= 59)
            System.out.println("Adulto");
        else if (idade <= 129)
            System.out.println("Idoso");
        else
            System.out.println("Digite um numero valido");

        scanner.close();
    }
}
