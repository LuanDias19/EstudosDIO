public class SmartTV{
    boolean ligada = false;
    int canal=1, volume=25;


    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " + volume);
    }

    public void subirCanal(){
        canal++;
        System.out.println("Subindo o canal para: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Descendo o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O novo canal é: " + canal);
    }

}