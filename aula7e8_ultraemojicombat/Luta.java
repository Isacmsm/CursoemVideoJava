package aula7e8_ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar(){
        if(this.isAprovada()){
            System.out.println("Senhoras e senhores, aqui temos o desafiado: ");
            this.desafiado.apresentar();
            System.out.println("e aqui temos o desafiante:");
            this.desafiante.apresentar();

            // vou fazer um sistema para deixar um lutador com mais chances de ganhar que o outro baseado nos Atributos dele ainda considerando uma chance de empate.
           double forcaDesafiado = (this.desafiado.getAltura() * 200 + this.desafiado.getPeso() * 10 + this.desafiado.getVitorias() * 10 + this.desafiado.getEmpates() * 10 - (this.desafiado.getDerrotas() * 13));
           double forcaDesafiante = (this.desafiante.getAltura() * 200 + this.desafiante.getPeso() * 10 + this.desafiante.getVitorias() * 10 + this.desafiante.getEmpates() * 10 - (this.desafiante.getDerrotas() * 13));

           Random aleatorio = new Random();
           //vou criar uma chance de 1 a 10% de empate, poderia ter feito de 0% a 10% deixando lutas sem possibilidades de empate, mas decidir não fazer.
           double chanceEmpate = aleatorio.nextInt(10) + 1;

           double totalForca = forcaDesafiado + forcaDesafiante;

           double proporcaoDesafiado = forcaDesafiado / totalForca;

           double fatiaDesafiado = (100.0 - chanceEmpate) * proporcaoDesafiado;

           double limiteVitoriaDesafiado = chanceEmpate + fatiaDesafiado;

           double sorteio = aleatorio.nextDouble() * 100;

           if(sorteio <= chanceEmpate){
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            System.out.println("A luta empatou");
           }else if (sorteio <= limiteVitoriaDesafiado){
            this.desafiado.ganharLuta();
            this.desafiante.perderLuta();
            System.out.println("Vitoria do " + this.desafiado.getNome());
           }else{
            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();
            System.out.println("Vitoria do " + this.desafiante.getNome());
           }


        }else{
            System.out.println("Esta luta não pode acontecer!");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
