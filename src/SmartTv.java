public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("--Aumentou para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("--Diminuiu para: " + volume);
    }

    public void subirCanal() {
        canal++;
        System.out.println("--Canal alterada para: " + canal);
    }

    public void descerCanal() {
        canal--;
        System.out.println("--Canal alterada para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }










}
