package main.java.com.estudos.banco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldoInicial = 500.00;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua agencia: ");
            String agencia = scanner.nextLine();

            System.out.println("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seu saldo atual e de " + saldoInicial + "R$, quanto voce deseja sacar?");
            double saque = scanner.nextDouble();
            scanner.nextLine();

            double saldoFinal = saldoInicial - saque;

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +
                    " e seu saque de: " + saque + "RS$ já foi realizado. Saldo final: " + saldoFinal + ".");

            scanner.close();
        }
    }

