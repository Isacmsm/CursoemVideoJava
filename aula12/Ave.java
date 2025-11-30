package aula12;

public class Ave extends Animal{
    private String corPena;

    
    
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
       System.out.println("comer frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("piando");
    }

    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
