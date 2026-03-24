package main.java.com.estudos.carro;

public class Carro {
    boolean ligado = false;
    int marcha = 1;
    double velocidade = 20;
    int combustivel = 100;

    public void ligar (){
        ligado = true;
    }

    public void desligar () {
        ligado = false;
    }

    public void aumentarMarcha() {
        marcha++;
    }

    public void diminuirMarcha() {
        marcha--;
    }

    public void aumentarVelocidade () {
        velocidade = velocidade + 20;
    }

    public void diminuirVelocidade() {
        velocidade = velocidade -20;
    }

    public void adicionarCombustivel() {
        combustivel = combustivel + 10;
    }

    public void gastarCombustivel() {
        combustivel = combustivel - 20;
    }

}

