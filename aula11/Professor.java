package aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento(double aumento){
        this.salario += aumento; //mesma coisa que this.salario = this.salario + aumento;
        System.out.println(this.getNome() + " acabou de receber um aumento de R$" + aumento + ". Salario atual depois do aumento: R$" + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
