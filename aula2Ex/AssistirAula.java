package aula2Ex;

public class AssistirAula {
    String materia;
    String professor;
    String topico;
    String modalidade;
    String local;
    boolean entrou = false;
    boolean saiu = false;
    boolean intervalo = false;
    boolean começou = false;
    boolean finalizado = false;

    void Status() {
        System.out.println("Matéria: " + this.materia);
        System.out.println("Professor: " + this.professor);
        System.out.println("Tópico: " + this.topico);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Local: " + this.local);
        System.out.println("Entrou na aula?: " + (this.entrou ? "Sim" : "Não"));
        System.out.println("Saiu da aula?: " + (this.saiu ? "Sim" : "Não"));
        System.out.println("Está em intervalo?: " + (this.intervalo ? "Sim" : "Não"));
        System.out.println("A aula começou?: " + (this.começou ? "Sim" : "Não"));
        System.out.println("A aula foi finalizada?: " + (this.finalizado ? "Sim" : "Não"));
    }

    void Entrar() {
        if (this.entrou) {
            System.out.println("Você já entrou na aula.");
        } else {
            this.entrou = true;
            this.saiu = false;
            System.out.println("Você entrou na aula.");
        }
    }

    void Sair() {
        if (!this.entrou) {
            System.out.println("Você ainda não entrou na aula.");
        } else if (this.saiu) {
            System.out.println("Você já saiu da aula.");
        } else {
            this.saiu = true;
            this.entrou = false;
            System.out.println("Você saiu da aula.");
        }
    }

    void ComeçarAula() {
        if (!this.entrou) {
            System.out.println("Você precisa entrar na aula para começar.");
        } else if (this.começou) {
            System.out.println("A aula já começou.");
        } else {
            this.começou = true;
            this.finalizado = false;
            System.out.println("A aula começou.");
        }
    }

    void IniciarIntervalo() {
        if (!this.começou) {
            System.out.println("A aula ainda não começou para entrar em intervalo.");
        } else if (this.intervalo) {
            System.out.println("Você já está em intervalo.");
        } else if (this.finalizado) {
            System.out.println("A aula já foi finalizada.");
        } else {
            this.intervalo = true;
            System.out.println("Você entrou em intervalo.");
        }
    }

    void TerminarIntervalo() {
        if (!this.intervalo) {
            System.out.println("Você não está em intervalo.");
        } else {
            this.intervalo = false;
            System.out.println("Intervalo terminado, aula continua.");
        }
    }

    void FinalizarAula() {
        if (!this.começou) {
            System.out.println("A aula ainda não começou para ser finalizada.");
        } else if (this.finalizado) {
            System.out.println("A aula já foi finalizada.");
        } else {
            this.finalizado = true;
            this.intervalo = false;
            System.out.println("A aula foi finalizada.");
        }
    }
}