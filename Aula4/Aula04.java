package Aula4;
public class Aula04 {
    public static void main(String[] args) {
    Caneta0 c1 = new Caneta0("NIC", "AMARELA", 0.4f);
    c1.status();
    Caneta0 c2 = new Caneta0("BIC", "LARANJA", 1.5f);
    c2.status();



    // Antes de ter construct:
    //c1.setModelo("BIC"); // Aqui quando se está privado.
    //c1.modelo ="BIC"; para quando está publico.
    //c1.setPonta(0.5f); 
    //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }

}
