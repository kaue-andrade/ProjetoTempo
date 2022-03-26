public class TempoMain {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(12, 32, 12);
        System.out.println(t1.getHora());
        System.out.println(t1.getMinuto());
        System.out.println(t1.getSegundo());

        //5ª questão
        //Tempo t2 = new Tempo(15, 23, 32);
        //t2.compare(t1);
    }
}