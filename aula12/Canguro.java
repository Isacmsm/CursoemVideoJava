package aula12;

public class Canguro extends Mamifero{

    public void usarBolsa(){
        System.out.println("usuando a bolsa");
    }


    @Override
    public void locomover(){
        System.out.println("Saltando");
    }

}
