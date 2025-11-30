package aula11;

public class Aluno extends Pessoa{ //posso colocar final class, e ai essa classe nao pode ser herdada e bolsista daria erro
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade(){ //posso colocar final void e ai a sobreposição da classe pagarMensalidade do bolsista seria invalida
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

}
