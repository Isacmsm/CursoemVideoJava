package ProjetoYoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de Python");
        v[2] = new Video("Aula 1 de HTML");

        Gafanhoto g[] = new Gafanhoto[3];

        g[0] = new Gafanhoto("Isac", 23, "M", "Isacmsm");
        g[1] = new Gafanhoto("Georgio", 19, "M", "gregorio");
        g[2] = new Gafanhoto("Ykaro", 20, "M", "ykinpcd");


        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Vizualizacao(g[0], v[1]);
        vis[1].avaliar(85.2f);
        System.out.println(vis[1].toString());

        /* 
        System.out.println(v[0].toString());
        System.out.println(g[1].toString()); */
    }
}
