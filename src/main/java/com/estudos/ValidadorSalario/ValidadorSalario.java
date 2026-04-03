package main.java.com.estudos.ValidadorSalario;
import java.util.Scanner;

public class ValidadorSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        try {
            verificar(salarioMinimo, salarioFuncionario);
        } catch (SalarioInvalidoException e) {
            System.out.println("Seu salário está abaixo do esperado.");
        }
    }

    static void verificar(double salarioMinimo, double salarioFuncionario) throws SalarioInvalidoException {
        if (salarioFuncionario >= salarioMinimo) {
            double diferencaSalario = salarioFuncionario - salarioMinimo;
            for (int f = 1; f <= 5; f++) {
                System.out.println("A diferenca entre o salário mínimo e o salário do funcionário " + f + " é de: " + diferencaSalario);
            }
        } else {
            throw new SalarioInvalidoException();
        }
    }
}
