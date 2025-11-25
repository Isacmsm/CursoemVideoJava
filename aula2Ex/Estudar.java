package aula2Ex;

public class Estudar {
    String disciplina;
    String assunto;
    String metodo;
    String objetivo;
    String local;
    int duração;
    boolean começou = false;
    boolean terminado = false;
    boolean pausado = false;

    void Status() {
        System.out.println("Disciplinas: " + this.disciplina);
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Método: " + this.metodo);
        System.out.println("Objetivo: " + this.objetivo);
        System.out.println("Local de estudo: " + this.local);
        System.out.println("Duração prevista: " + this.duração + " horarios");
        System.out.println("Começado?: " + this.começou);
        System.out.println("Terminado?: " + this.terminado);
        System.out.println("Pausado?: " + this.pausado);
    }

    void Começar(){
        if (começou == false){
            começou = true;
            System.out.println("Você começou a estudar!");
        }else{
            System.out.println("O estudo ja tinha começado!");
        }
    }

    void Terminar(){
        if (começou == false){
            System.out.println("Erro! Não é possivel terminar de estudar se você não começou!");
        }else{
            terminado = true;
            pausado = false;
            System.out.println("Você terminou de estudar!");
        }
    }

    void Pausar(){
        if(começou == false){
            System.out.println("Você não começou a estudar para fazer pausas!");
        }else{
            if(terminado == true){
                System.out.println("Erro, não é possivel pausar. Vocẽ ja terminou de estudar!");
            }else{
                pausado = true;
                System.out.println("Estudo pausado!");
            }
        }
    }

    void Retomar(){
        if(pausado == true){
            pausado = false;
            System.out.println("Estudo retomado");
        }else{
            System.out.println("O estudo não está pausado!");
        }
    }

    void FazerAnotações(){
        if (começou == true && pausado == false && terminado == false){
            System.out.println("Estou fazendo anotações do assunto: " + assunto);
        }else{
            System.out.println("Para fazer anotações, você tem que ter começado a estudar e o estudo não pode estaŕ pausado ou terminado.");
        }
    }

}
