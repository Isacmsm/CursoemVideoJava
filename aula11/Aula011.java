package aula11;

public class Aula011 {
    public static void main(String[] args) {
       Visitante v1 = new Visitante();
        v1.setNome("Isac");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString()); 

        Aluno a1 = new Aluno();
        a1.setNome("Georgio");
        a1.setMatricula(1805461);
        a1.setCurso("Analise e desenvolvimento de sistemas");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Ykaro");
        b1.setMatricula(1826099);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        
        Professor p1 = new Professor();
        p1.setNome("Guanabara");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.setEspecialidade("Java");
        p1.setSalario(2500.00);

        p1.receberAumento(550.20);
    }
}
