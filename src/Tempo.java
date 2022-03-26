public class Tempo {
    private int hora;
    private int minuto;
    private long segundo;
    //private int soma;
    private long converterhoras;
    private long converterminutos;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int h) {
        if (validarTime(h, 0, 0)) {
            this.hora = h;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Tempo(int h, int m) {
        if (validarTime(h, m, 0)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = 0;
        }
    }

    public Tempo(int h, int m, int s) {
        if (validarTime(h, m, s)) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
    }

    public boolean validarTime(int h, int m, int s) {
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String modelo = "";

        if (hora < 9) {
            modelo += "0" + hora + ":";
        } else modelo += hora + ":";
        if(minuto < 9){
            modelo += "0" + minuto + ":";
        } else modelo += minuto + ":";
        if (segundo < 9 ){
            modelo += "0"+segundo;
        }else modelo += segundo;

        return modelo;
    }

    public long tempoSegundos(){
        converterhoras = hora*60;
        converterminutos = minuto*60;
        //soma = converterhoras + segundo + minuto;
        segundo = segundo + (converterhoras * 60) + converterminutos;
        return segundo;
    }
    //public void alterarHora(int h, int m, int s){


    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public long getSegundo() {
        return segundo;
    }
    //Métodos que serão criados...


    //5ª questão
    //public long compare(Tempo t){
    //}

}