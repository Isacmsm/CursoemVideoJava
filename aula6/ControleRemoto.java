package aula6;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Contrutor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Getters e Setters

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------|x|----------");
        System.out.println("-----Abrindo menu------");
        System.out.println("Esta Ligado ? " + this.isLigado());
        System.out.println("Está tocando ? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        System.out.print(" ");
        for (int i = 0; i<= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println();
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("-----Fechando Menu-----");
        System.out.println("----------|x|----------");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 1);
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() != 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }



    

    
}
