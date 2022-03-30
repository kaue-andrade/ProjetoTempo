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
        if (validarTime(h, m, 0)) { //Validação de tempo utilizando h, m, 0 em um if (em português, se)
            this.hora = h; //this.hora recebe h (está representando a hora)
            this.minuto = m; //this.minuto recebe m (está representando o minuto)
            this.segundo = 0; //this.segundo recebe 0
        }
    }

    public Tempo(int h, int m, int s) { //Quarto método construtor
        if (validarTime(h, m, s)) { //Validação de tempo utilizando h, m, s em um if (em português, se)
            this.hora = h; //this.hora recebe h (está representando a hora)
            this.minuto = m; //this.minuto recebe m (está representando o minuto)
            this.segundo = s; //this.segundo recebe s (está representando o segundo)
        }
    }

    public boolean validarTime(int h, int m, int s) { //Cria um método para validar o tempo
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) { //Estabelece as condições de hora, minuto e segundo determinando o intervalo que eles precisam apresentar
            return true; //Retorna true (em português, verdadeiro)
        } else { //Se a condição do if não for atendida, ele entra no else (em português, senão)
            return false; //Retorna false (em português, falso)
        }
    }

    public String toString() { //Cria o método toString

        String modelo = ""; //O modelo do relógio recebe ""

        if (hora < 9) { //Estebelece a condição de hora < 9
            modelo += "0" + hora + ":"; //Se hora menor que 9, ela entra nesse modelo do relógio, com um 0 e o valor da hora que possui um dígito
        } else { //Estabelece a condição de "senão", caso a do "se" não seja atendida
            modelo += hora + ":"; //Se a condição for atendida, o modelo será com o valor > 9, sem o número 0 como primeiro dígito
        }
        if (minuto < 9) { //Estabele a condição de minuto < 9
            modelo += "0" + minuto + ":"; //Se o minuto for menor que 9, ela entra nesse modelo do relógio, com um 0 e o valor do minuto que possui um dígito
        } else { //Estabelece a condição de "senão", caso a do "se" não seja atendida
            modelo += minuto + ":"; //Se a condição for atendida, o modelo será com o valor > 9, sem o número 0 como primeiro dígito
        }
        if (segundo < 9 ) { //Estabelece a condição de segundo < 9
            modelo += "0"+ segundo; //Se o segundo for menor que 9, ele entra nesse modelo do relógio, com um 0 e o valor do segundo que possui um dígito
        } else { //Estabelece a condição de "senão", caso a do "se" não seja atendida
            modelo += segundo; //Se a condição for atendida, o modelo será com o valor > 9, sem o número 0 como primeiro dígito
        }

        return modelo; //Retorna o modelo do relógio
    }

    public long tempoSegundos(){ //Método para transformar o tempo informado em segundos
        long segundos = segundo; //A variável segundos recebe segundo
        long conversao = hora * 60; //A variável conversao recebe a conversão de hora para segundo
        conversao = conversao + minuto; //A variável conversao recebe conversao mais minuto
        segundos = segundos + (conversao * 60); //A variável segundos recebe segundos a conversao multiplicado por 60
        return segundos; //retorna segundos
    }

    public boolean setHora(int hora) { //Criação do método para alterar a hora

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

    public boolean setMinutos(int minuto) { //Criação do método para alterar os minutos

        if ((minuto >= 0) && (minuto <= 59)) { //Estabelece a condição "se" de minuto >= 0 e hora <= 59
            this.minuto = minuto; //this.minuto recebe minuto
            return true; //Se a condição for atendida, retorna "true" (verdadeiro em português)
        } else { //Estabelece a condição de "senão", caso a condição do "se" não seja atendida
            this.minuto = 0; //this.hora recebe o valor 0
            return false; //Se a condição for atendida, retorna "false" (falso em português)
        }
    }

    //Um certo segundo, para ser válido, necessita ser maior ou igual a 0 e menor ou igual a 59

    public boolean setSegundos(int segundo){
        if((segundo >= 0) && (segundo <= 59)){ //Estabelece a condição "se" de segundo >= 0 e segundo <= 59
            this.segundo = segundo; //this.segundo recebe segundo
            return true; //Se a condição for atendida,
        } else { //Estabelece a condição de "senão", caso a condição do "se" não seja atendida
            this.segundo = 0; //this.segundo recebe o valor 0
            return false; //Se a condição for atendida, retorna "false" (falso em português)
        }
    }

    public long diferencaTempo(Tempo tempo2){ //Método que recebe o objeto Tempo como parâmetro
        long temposeg2 = tempo2.tempoSegundos(); //Armazena a conversão de t2 em segundos na variável temposeg2
        long temposeg1 = tempoSegundos(); //Armazena a conversão de t1 em segundos na variável temposeg1
        long diferenca = temposeg2 - temposeg1; //Armazena a diferença entre temposeg2 e temposeg1
        return diferenca; //Retorna a diferença entre os dois
    }

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
}
