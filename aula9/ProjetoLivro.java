package aula9;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("João",12, "Masculino");
        p[1] = new Pessoa("Maria",16, "Feminino");

        Livro[] l = new Livro[2];
        l[0] = new Livro("Aprendendo Java", "Guanabara", 400, p[0]);
        l[1] = new Livro("Aprendendo Python", "Guanabara", 350, p[1]);

        p[0].fazerAniver();
        l[0].abrir();
        l[1].abrir();
        l[1].folhear(50);
        l[0].avancarPag();

        l[0].detalhes();
        l[1].detalhes();
    }

}
