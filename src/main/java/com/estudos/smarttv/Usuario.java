package main.java.com.estudos.smarttv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status: Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status: Volume atual? " + smartTv.volume);
    }
}
