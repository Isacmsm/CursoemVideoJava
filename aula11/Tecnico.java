package aula11;

public class Tecnico extends Aluno{
    private String registroProfissional;

    public void praticar(){
        System.out.println("Estou Praticando!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
