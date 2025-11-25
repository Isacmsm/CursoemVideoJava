package aula3;

public class Aula03 {
    public static void main(String[] args) {
        Caneta1 c1 = new Caneta1();
        c1.modelo = "BIC cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }   

}
