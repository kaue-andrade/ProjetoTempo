public class TempoMain {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(14, 21, 39);
        System.out.println("\nHORA(S): " + t1.getHora() + " hora(s)");
        System.out.println("MINUTO(S): " + t1.getMinuto() + " minuto(s)");
        System.out.println("SEGUNDOS: " + t1.getSegundo() + " segundo(s)");

        System.out.println("\nHORÁRIO EM STRING: " + t1.toString());

        System.out.println("\nCONVERSÃO PARA SEGUNDOS: " + t1.tempoSegundos() + " segundo(s)");

        //5ª questão
        //Tempo t2 = new Tempo(15, 23, 32);
        //t2.compare(t1);
    }
}