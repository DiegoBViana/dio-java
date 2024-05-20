public class App {
    public static void main(String[] args) throws Exception {
        // Instanciando classe
        SmartTv smartTv = new SmartTv();

        // Chamada do metodo reescrito toString da classe para impressão
        System.out.println(smartTv.toString());

        // Alterando status da tv
        smartTv.setStatus();

        System.out.println(smartTv.toString());

        // Alterando volume
        smartTv.setChannelUp();
        smartTv.setChannelDown();

        // Alterando canal
        smartTv.setChannelUp();
        smartTv.setChannelDown();

        // Alterando canal passando o valor
        smartTv.setChannel(17);

    }
}
