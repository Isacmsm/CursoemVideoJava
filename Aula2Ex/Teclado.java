public class Teclado {
    String Cor;
    String Modelo;
    String Tamanho;
    String Marca;
    boolean RGB;
    boolean Ligado;
    boolean RGBligado;


    void Status(){
        System.out.println("A cor desse teclado é " + this.Cor);
        System.out.println("A marca do teclado é " + this.Marca);
        System.out.println("O modelo desse teclado é " + this.Modelo);
        System.out.println("O tamanho dele é " + this.Tamanho);
        System.out.println("O teclado é RGB? " + this.RGB);
    }

    void LigarDesligarTeclado(){
        if (Ligado == true){
            Ligado = false;
            System.out.println("Desliguei o teclado");
        }else{
            Ligado = true;
            System.out.println("Liguei o teclado");
        }
    }

    void Ligar_e_DesligarRGB(){
        if (Ligado == false){
            System.out.println("O teclado tem que estár ligado para Ligar/Desligar o RGB");
        }else{
            if(RGB == false){
            System.out.println("O teclado não possui RGB! (Menos FPS kkkk)");
            } else{
                if(RGBligado == true){
                    RGBligado = false;
                    System.out.println("Desliguei o RGB, menos 20 de FPS =(");
                }else{
                    RGBligado = true;
                    System.out.println("liguei o RGB (+20 de FPS)");
                }
            }
        }
    }

    void Digitar(){
        if (Ligado == true){
            System.out.println("Estou digitando");
        }else{
            System.out.println("O teclado tem que está ligado para digitar nele!");
        }
    }

}
