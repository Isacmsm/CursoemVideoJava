package aula3;

public class Caneta1 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar, a caneta esta tampada!");
        } else{
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
