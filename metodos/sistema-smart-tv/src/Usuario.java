public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.descerCanal();
        smartTV.subirCanal();
        smartTV.subirCanal();
        smartTV.descerCanal();

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV.volume);

        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.mudarCanal(25);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();

    }
}
