//Algoritmo continuado por Kauê Andrade dos Santos.

public class Tempo { //Cria a classe pública denominada Tempo

    private int hora; //Cria a variável hora como tipo int e private
    private int minuto; //Cria a variável minuto como tipo int e private
    private long segundo; //Cria a variável segundo como tipo int e private
    private long converterhoras; //Cria a variável converterhoras como tipo long e private
    private long converterminutos; //Cria a variável converterminutos como tipo long e private

    public Tempo() { //Primeiro método construtor
        this.hora = 0; //this.minuto recebe 0
        this.minuto = 0; //this.minuto recebe 0
        this.segundo = 0; //this.segundo recebe 0
    }

    public Tempo(int h) { //Segundo método construtor
        if (validarTime(h, 0, 0)) {
            this.hora = h; //this.hora recebe h (variável que está representando a hora)
            this.minuto = 0; //this.minuto recebe 0
            this.segundo = 0; //this.segundo recebe 0
        }
    }

    public Tempo(int h, int m) { //Terceiro método construtor
        if (validarTime(h, m, 0)) {
            this.hora = h; //this.hora recebe h (está representando a hora)
            this.minuto = m; //this.minuto recebe m (está representando o minuto)
            this.segundo = 0; //this.segundo recebe 0
        }
    }

    public Tempo(int h, int m, int s) { //Terceito método construtor
        if (validarTime(h, m, s)) { //Validação de tempo utilizando if (em português, se)
            this.hora = h; //this.hora recebe h (está representando a hora)
            this.minuto = m; //this.minuto recebe m (está representando o minuto)
            this.segundo = s; //this.segundo recebe s (está representando o segundo)
        }
    }

    public boolean validarTime(int h, int m, int s) { //Cria um método para validar o tempo
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() { //Cria o método toString

        String modelo = ""; //O modelo do relógio recebe ""

        if (hora < 9) { //Estebelece a condição de hora < 9
            modelo += "0" + hora + ":"; //Se hora menor que 9,
        } else {
            modelo += hora + ":";
        }
        if (minuto < 9){
            modelo += "0" + minuto + ":";
        } else {
            modelo += minuto + ":";
        }
        if (segundo < 9 ){
            modelo += "0"+ segundo;
        } else {
            modelo += segundo;
        }

        return modelo; //Retorna o modelo do relógio
    }

    public long tempoSegundos(){ //Método para transformar o tempo informado em segundos
        converterhoras = hora*60; //Converte as horas em minutos multiplicando por 60
        converterminutos = minuto*60; //Converte as minutos em segundo multiplicando por 60
        segundo = segundo + (converterhoras * 60) + converterminutos; //Armazena a soma entre segundo, a conversão de horas em segundos e a conversão de minutos em segundos na variável segundo
        return segundo; //Retorna a variável segundo
    }

    public boolean setHora(int hora) {

        //Uma certa hora, para ser válida, necessita ser maior ou igual a 0 e menor ou igual a 24

        if ((hora >= 0) && (hora <= 24)) { //Estabelece a condição "se" de hora >= 0 e hora <= 24
            this.hora = hora; //this.hora recebe hora
            return true; //Se a condição for atendida, returna "true" (verdadeiro em português)
        } else { //Estabelece a condição de "senão", caso a do "se" não seja atendida
            this.hora = 0; //this.hora recebe o valor 0
            return false; //Se a condição for atendida, retorna "false" (falso em português)
        }
    }

    //Um certo minuto, para ser válido, necessita ser maior ou igual a 0 e menor ou igual a 59

    public boolean setMinutos(int minuto) { //Estabelece a condição "se" de minuto >= 0 e minuto <= 24

        if ((minuto >= 0) && (minuto <= 59)) { //
            this.minuto = minuto; //this.minuto recebe minuto
            return true; //Se a condição for atendida, retorna "true" (verdadeiro em português)
        } else { //Estabelece a condição de "senão", caso a condição do "se" não seja atendida
            this.minuto = 0; //this.hora recebe o valor 0
            return false; //Se a condição for atendida, retorna "false" (falso em português)
        }
    }

    public boolean setSegundos(int segundo){
        if((segundo >= 0) && (segundo <= 59)){
            this.segundo = segundo; //this.segundo recebe segundo
            return true; //Se a condição for atendida,
        } else { //Estabelece a condição de "senão", caso a condição do "se" não seja atendida
            this.segundo = 0; //this.segundo recebe o valor 0
            return false; //Se a condição for atendida, retorna "false" (falso em português)
        }
    }





    /*public long diferencaTempo(Tempo t2){
        /*long tempo1 = t2;
        System.out.println("\ntempo1" + tempo1);
        System.out.println("\nTEMPO: " + tempo);
        long temponovo = tempoSegundos();
        System.out.println("TEMPO NOVO: " + tempo);
        long tempo1 = t1.tempoSegundos();
        long tempo2 = t2.tempoSegundos();
        System.out.println("\ntempo2" + tempo2);
        long diferenca = tempo1-tempo2;
        return diferenca;
    }*/


    //public void alterarHora(int h, int m, int s){



    //Geração dos getters e setters

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public long getSegundo() {
        return segundo;
    }

    public long getConverterhoras() {
        return converterhoras;
    }

    public void setConverterhoras(long converterhoras) {
        this.converterhoras = converterhoras;
    }

    public long getConverterminutos() {
        return converterminutos;
    }

    public void setConverterminutos(long converterminutos) {
        this.converterminutos = converterminutos;
    }

    //Métodos que serão criados...

    //5ª questão
    //public long compare(Tempo t){
    //}

}
