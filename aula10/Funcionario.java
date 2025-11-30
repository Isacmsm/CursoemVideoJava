package aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(String trabalho){
        if(this.getSetor() == null){
            System.out.println("Voce começou a trabalhar no setor " + trabalho);
        }else{
            System.out.println("Você mudou do setor " + this.getSetor() + "para o setor " + trabalho);
        }
        this.setSetor(trabalho);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

  
}
