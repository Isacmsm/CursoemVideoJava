package aula5;
public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Construtor: Saldo = 0 e Conta criada ainda fechada.
    public ContaBanco() {
        this.setSaldo(0.0);
        this.setStatus(false);  
    }


    //Getters e Setters:
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Metodos:
    public void abrirConta(String d, String t){
        this.setDono(d);
        this.setTipo(t);
        String a = "";

        if (t.equals("CC")){
            this.setStatus(true);
            this.setSaldo(50);
            a = "Corrente";
            System.out.println("Conta " + a + " de " + d + " aberta!");
        }else if (t.equals("CP")){
            this.setStatus(true);
            this.setSaldo(150);
            a = "Poupança";
            System.out.println("Conta " + a + " de " + d + " aberta!");
        }else{
            System.out.println("Erro! Tipo de conta invalida! A conta não foi aberta!");
            System.out.println("Por Favor, use 'CC' ou 'CP'.");
            this.setDono("");
            this.setTipo("");
        }
    }
    
    public void fecharConta(){
        if (this.isStatus()){
            if(this.getSaldo() > 0){
                System.out.println("Erro! Impossivel fechar um conta que possui saldo maior que 0.");
            }else if (this.getSaldo() < 0){
                System.out.println("Erro! Impossivel fechar um conta que possui saldo menor que 0.");
            }else {
                System.out.println("Sua conta foi fechada!");
                this.setStatus(false);
            }
        }else{
            System.out.println("Esta conta ja esta fechada");
        }

    }
 
    public void depositar(double valorDeposito){
        if(valorDeposito < 0){
            System.out.println("Erro! Valor inválido para deposito.");
        }else if (this.isStatus()){
                double saldo = this.getSaldo();
                this.setSaldo(saldo + valorDeposito);
                System.out.println("Você acabou de depositar R$" + valorDeposito + " totalizando um saldo de R$" + this.getSaldo());

            }else {
                System.out.println("Erro! Não é possivel depositar em uma conta fechada.");
            }
    }
        
    public void sacar(double valorSaque){
        if(valorSaque < 0){
            System.out.println("Erro! Valor inválido para saque.");
        }else if (this.isStatus()){
                if (valorSaque > this.getSaldo()){
                    System.out.println("Valor insuficiente!");
                }else {
                    this.setSaldo(this.getSaldo() - valorSaque);
                    System.out.println("Voce sacou R$" + valorSaque + ", seu saldo atual é de R$" + this.getSaldo());
                }
            }else {
                System.out.println("Erro! Impossivel sacar de uma conta fechada");
            }
    }

    public void pagarMensal(){
        double valorMensalCC = 12.00;
        double valorMensalCP = 20.00;
        if(this.isStatus()){
            if(this.getTipo().equals("CC")){
                if(this.getSaldo() >= valorMensalCC){
                    this.setSaldo(this.getSaldo() - valorMensalCC);
                    System.out.println("Mensalidade de valor de R$" + valorMensalCC + " da conta corrente foi paga! Saldo atual de: R$" + this.getSaldo());
                }else{
                    System.out.println("Saldo insuficiente para completar a operação!");
                }
            }else if(this.getTipo().equals("CP")){
                if(this.getSaldo() >= valorMensalCP){
                    this.setSaldo(this.getSaldo() - valorMensalCP);
                    System.out.println("Mensalidade de valor de R$" + valorMensalCP + " da conta poupança foi paga! Saldo atual de: R$" + this.getSaldo());
                }else{
                    System.out.println("Saldo insuficiente para completar a operação!");
                }
            }

        }else {
            System.out.println("Não há mensalidade para um conta fechada");
        }
    }

    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("-----------------------------");
    }

}
