package main.java.com.estudos.conta;

public class Cliente {
     static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo inicial: " + contaBancaria.saldo);
        System.out.println("Conta ativa?: " + contaBancaria.contaAtiva);

        System.out.println("Logando...");

        contaBancaria.definirTitular();
        contaBancaria.ativar();
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Conta ativa?: " + contaBancaria.contaAtiva);

        System.out.println("Depositando 500R$...");
        contaBancaria.depositar();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Sacando 200R$...");
        contaBancaria.sacar();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Aplicando Rendimento 1x...");
        contaBancaria.aplicarRendimento();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Aplicando Rendimento 2x...");
        contaBancaria.aplicarRendimento();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Aplicando Rendimento 3x...");
        contaBancaria.aplicarRendimento();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Cobrando taxa 1x...");
        contaBancaria.cobrarTaxa();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Cobrando taxa 2x...");
        contaBancaria.cobrarTaxa();
        System.out.println("Saldo atual: " + contaBancaria.saldo);

        System.out.println("Desativando conta...");
        contaBancaria.desativar();
        System.out.println("Conta ativa?: " + contaBancaria.contaAtiva);

    }
}
