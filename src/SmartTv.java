public class SmartTv {
    // --DECLARAÇÃO DAS VARIAVEIS E TIPOS--
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
     // --DECLARAÇÃO DAS VARIAVEIS E TIPOS--

    // ----ON / OFF----ON / OFF----
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    // ----ON / OFF----ON / OFF----

    // ----CONTROLE DE VOLUME----CONTROLE DE VOLUME----
    public void aumentarVolume() {
        volume ++;
        System.out.println("--Aumentou para: " + volume);
    }
    public void diminuirVolume() {
        volume --;
        System.out.println("--Diminuiu para: " + volume);
    }
    // ----CONTROLE DE VOLUME----CONTROLE DE VOLUME----

    // ----CONTROLE DE CANAL----CONTROLE DE CANAL----
    public void subirCanal() {
        canal ++;
        System.out.println("--Canal alterada para: " + canal);
    }
    public void descerCanal() {
        canal --;
        System.out.println("--Canal alterada para: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
     // ----CONTROLE DE CANAL----CONTROLE DE CANAL----










}
