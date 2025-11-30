package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguro c = new Canguro();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();


        m.locomover();
        c.locomover();
        ca.locomover();

        m.emitirSom();
        ca.emitirSom();

    }
}
