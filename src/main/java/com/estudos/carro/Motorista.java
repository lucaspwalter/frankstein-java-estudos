package main.java.com.estudos.carro;

public class Motorista {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println("Ligado?: " + carro.ligado);
        System.out.println("Marcha Inicial: " + carro.marcha);
        System.out.println("Velocidade Inicial: " + carro.velocidade);
        System.out.println("Combustivel Inicial: " + carro.combustivel);

        carro.ligar();
        System.out.println("Ligando carro...");
        System.out.println("Ligado?: " + carro.ligado);

        carro.aumentarMarcha();
        carro.aumentarVelocidade();
        carro.gastarCombustivel();
        System.out.println("Aumentando marcha...");
        System.out.println("Marcha Atual: " + carro.marcha);
        System.out.println("Aumentando velocidade...");
        System.out.println("Velocidade atual: " + carro.velocidade);
        System.out.println("Combustivel gasto...");
        System.out.println("Combustivel atual: " + carro.combustivel);

        carro.aumentarMarcha();
        carro.aumentarVelocidade();
        carro.gastarCombustivel();
        System.out.println("Aumentando marcha 2x...");
        System.out.println("Marcha Atual: " + carro.marcha);
        System.out.println("Aumentando velocidade 2x...");
        System.out.println("Velocidade atual: " + carro.velocidade);
        System.out.println("Combustivel gasto 2x...");
        System.out.println("Combustivel atual: " + carro.combustivel);

        carro.diminuirMarcha();
        carro.diminuirVelocidade();
        carro.adicionarCombustivel();
        System.out.println("Diminuindo marcha...");
        System.out.println("Marcha Atual: " + carro.marcha);
        System.out.println("Diminuindo velocidade...");
        System.out.println("Velocidade atual: " + carro.velocidade);
        System.out.println("Combustivel adicionado...");
        System.out.println("Combustivel atual: " + carro.combustivel);

        carro.diminuirMarcha();
        carro.diminuirVelocidade();
        carro.adicionarCombustivel();
        System.out.println("Diminuindo marcha 2x...");
        System.out.println("Marcha Atual: " + carro.marcha);
        System.out.println("Diminuindo velocidade 2x...");
        System.out.println("Velocidade atual: " + carro.velocidade);
        System.out.println("Combustivel adicionado. 2x..");
        System.out.println("Combustivel atual: " + carro.combustivel);

        carro.desligar();
        System.out.println("Desligando carro...");
        System.out.println("Ligado?: " + carro.ligado);
    }
}
