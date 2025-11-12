package Objetos;
public class Celular {
    String Cor;
    String Marca;
    String Modelo;
    boolean ligado;
    boolean TelaLigada;
    boolean Arranhado;

    void status(){
        System.out.println("A marca do celular é: " + this.Marca);
        System.out.println("A cor do celular é: " + this.Cor);
        System.out.println("O modelo do celular é um " + this.Modelo);
        System.out.println("O celular está ligado: " + this.ligado);
        System.out.println("A tela do celular está ligada?: " + this.TelaLigada);
        System.out.println("Existem arranhões na tela ou traseira do celular?: " + this.Arranhado);

    }

    void ligartela(){
        if (TelaLigada == true){
            System.out.println("A tela ja está ligada!");
        }else{
            TelaLigada = true;
            System.out.println("Liguei a tela do celular");
        }
    }
}
