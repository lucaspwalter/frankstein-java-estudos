package main.java.com.estudos.conta;

public class ContaBancaria {

    String titular = "Sem Login";
    double saldo = 0.0;
    boolean contaAtiva = false;

    public void ativar() {
        contaAtiva = true;
    }

    public void desativar(){
        contaAtiva = false;
    }

    public void depositar() {
        saldo = saldo + 500;
    }

    public void sacar() {
        saldo = saldo - 200;
    }

    public void aplicarRendimento() {
        saldo++;
    }

    public void cobrarTaxa() {
        saldo--;
    }

    public void definirTitular(){
        titular = "Lucas";
    }

}
