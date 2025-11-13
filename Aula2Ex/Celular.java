public class Celular {
    String Cor;
    String Marca;
    String Modelo;
    boolean ligado;
    boolean TelaLigada;
    boolean Arranhado;

    void status(){
        System.out.println("A marca do celular é: " + this.Marca);
        System.out.println("A cor do celular é: " + this.Cor);
        System.out.println("O modelo do celular é um " + this.Modelo);
        System.out.println("O celular está ligado: " + this.ligado);
        System.out.println("A tela do celular está ligada?: " + this.TelaLigada);
        System.out.println("Existem arranhões na tela ou traseira do celular?: " + this.Arranhado);

    }

    void LigarCelular(){
        if (ligado == true){
            System.out.println("O celular ja está ligada!");
        }else{
            ligado = true;
            System.out.println("Liguei o celular");
        }
    }

    void DesligarCelular(){
        if (ligado == false){
            System.out.println("O celular ja está desligado!");
        }else{
            ligado = false; 
            System.out.println("Desliguei o celular");
        }
    }

    void Ligartela(){
        if (TelaLigada == true){
            System.out.println("A tela ja está ligada!");
        }else{
            TelaLigada = true;
            System.out.println("Liguei a tela do celular");
        }
    }

    void DesligarTela(){
        if (TelaLigada == false){
            System.out.println("A tela ja está apagada!");
        }else{
            TelaLigada = false;
            System.out.println("desliguei a tela do celular!");
        }
    }

    void TirarFoto(){
        if (ligado == false){
            System.out.println("Não posso tirar foto com o celular desligado");
        }else{
            if (TelaLigada == false){
                System.out.println("Tenho que está com tela ligada para tirar foto!");
            }else{
                System.out.println("Diga xs! Foto tirada!");
            }
        }
    }

    void MandarMensagens(){
        if (ligado == false){
            System.out.println("Não posso mandar mensagens com o celular desligado");
        }else{
            if (TelaLigada == false){
                System.out.println("Tenho que está com tela ligada para mandar mensagens!");
            }else{
                System.out.println("Mandei mensagem para Georgio");
            }
        }
    }

    void FazerLigação(){
        if (ligado == false){
            System.out.println("Não posso fazer ligações com o celular desligado");
        }else{
            if (TelaLigada == false){
                System.out.println("Tenho que está com tela ligada para fazer ligações!");
            }else{
                System.out.println("Fazendo ligação para Georgio!");
            }
        }
    }
}
