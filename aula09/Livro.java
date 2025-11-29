package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("O nome do livro é: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Numero de Paginas: " + this.getTotalPag());
        System.out.println("A ultima pagina lida foi: " + this.getPagAtual());
        System.out.println("A pessoa que está lendo isso nomento é: " + this.getLeitor().getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(this.isAberto()){
            if(pagina <= this.getTotalPag()){
                this.setPagAtual(pagina);
                System.out.println("Voce folheou ate a pagina " + this.getPagAtual());
            }
        }else{
            System.out.println("Você não tem como folhear um livro fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            if(this.getPagAtual() + 1 <= this.getTotalPag()){
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Você avançou uma pagina, voce esta atualmenta na pagina: " + this.getPagAtual());
            }
        }else{
            System.out.println("Não tem como avançar de pagina com o livro fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            if(this.getPagAtual() > 1 && this.getPagAtual() <= this.getTotalPag()){
               this.setPagAtual(this.getPagAtual() - 1); 
               System.out.println("Você voltou uma pagina. Pagina atual: " + this.getPagAtual());
            }

        }else{
            System.out.println("O livro esta fechado, logo não tem como voltar uma pagina");
        }
    }
    
}
