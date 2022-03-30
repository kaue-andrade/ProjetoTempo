//Algoritmo continuado por Kauê Andrade dos Santos.

public class TempoMain { //Cria a classe pública denominada TempoMain
    public static void main(String[] args) { //public: modificador de acesso do método público; static: estático; void: sem retorno; main (principal): nome do método; (String[] args): receber como parâmetro um array de String (denominado args).

        Tempo t1 = new Tempo(01, 47, 07); //Criação do t2 e estabelecimento dos valores
        System.out.println("\n#Tempo 1"); //Exibe na tela #TEMPO 1
        System.out.println("\nHORA(S): " + t1.getHora() + " hora(s)"); //Exibe a hora de t1
        System.out.println("MINUTO(S): " + t1.getMinuto() + " minuto(s)"); //Exibe o(s) minuto(s) de t1
        System.out.println("SEGUNDOS: " + t1.getSegundo() + " segundo(s)"); //Exibe o(s) segundo(s) de t1

        System.out.println("\nHORÁRIO EM STRING: " + t1.toString()); //Exibe o horário de t1 em string

        System.out.println("\nCONVERSÃO PARA SEGUNDOS: " + t1.tempoSegundos() + " segundo(s)\n"); //Exibe a conversão do tempo em segundos de t1

        if (t1.setHora(00)){ //Define a nova hora de t1 (é possível vermos o valor escolhido entre parênteses)
            System.out.println("Você definiu a(s) hora(s) com o valor um valor válido"); //Exibe a mensagem se a condição for atendida
        } else{
            System.out.println("Ops! Você definiu uma hora inválida! O valor recebe 0. Lembre-se: a hora precisa estar entre 0 e 24"); //Exibe a mensagem se a condição for atendida
        }

        if (t1.setMinutos(010)){ //Define o(s) novo(s) minutos de t1 (é possível vermos o valor escolhido entre parênteses)
            System.out.println("Você definiu os minutos com um valor válido"); //Exibe a mensagem se a condição for atendida
        } else{
            System.out.println("Ops! Você definiu os minutos com um valor inválido! O valor recebe 0. Lembre-se: os minutos precisam estar entre 0 e 59"); //Exibe a mensagem se a condição for atendida
        }

        if (t1.setSegundos(00)) { //Define o(s) novo(s) segundo(s) de 1 (é possível vermos o valor escolhido entre parênteses)
            System.out.println("Você definiu os segundos com um valor válido"); //Exibe a mensagem se a condição for atendida
        } else {
            System.out.println("Ops! Você definiu os segundos com um valor inválido! O valor recebe 0. Lembre-se: os segundos precisam estar entre 0 e 59"); //Exibe a mensagem se a condição for atendida
        }

        System.out.println("\nNOVO HORÁRIO DE TEMPO 1 FOI DEFINIDO COMO: " + t1.toString()); //Exibe o novo horário de t1
        System.out.println("NOVO HORÁRIO EM SEGUNDOS: " + t1.tempoSegundos() + " segundo(s)"); //Exibe o tempo de t1 em segundos

        Tempo t2 = new Tempo(02, 00, 00); //Criação do t2 e estabelecimento dos valores

        System.out.println("\n#TEMPO 2"); //Exibe na tela "#TEMPO 2"
        System.out.println("\nSEGUNDO HORÁRIO: " + t2.toString()); //Exibe o horário de t2 em string
        System.out.println("\nCONVERSÃO DO SEGUNDO HORÁRIO PARA SEGUNDOS: " + t2.tempoSegundos() + " segundo(s)"); //Exibe a conversão do segundo horário para string

        System.out.println("\nDIFERENÇA ENTRE OS DOIS HORÁRIOS: " + t1.diferencaTempo(t2) + " segundo(s) | Lembre-se: t1 foi definido com um novo horário (" + t1.toString() + " ou " + t1.tempoSegundos() + " segundos)"); //Exibe a diferença entre os dois tempo (t1 e t2) em segundos
    }
}