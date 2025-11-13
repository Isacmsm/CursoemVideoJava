public class Aula2Ex {
 public static void main(String[] args) {
    Teclado t1 = new Teclado();
    t1.Cor = "Azul";
    t1.Marca = "Husky";
    t1.Modelo = "Blizzard";
    t1.Tamanho = "60%";
    t1.RGB = true;
    t1.RGBligado = false;
    t1.Ligado = false;
    
    t1.LigarDesligarTeclado();
    t1.Ligar_e_DesligarRGB();
    t1.Status();

    System.out.println("-----------x-----------");

    Celular c1 = new Celular();
    c1.Cor = "Preto";
    c1.Marca = "Apple";
    c1.Modelo = "Iphone 13 pro max";
    c1.ligado = true;
    c1.Arranhado = true;
    c1.TelaLigada = false;

    c1.LigarCelular();
    c1.status();
    c1.TirarFoto();
    c1.Ligartela();
    c1.MandarMensagens();
    c1.FazerLigação();

    System.out.println("-----------x-----------");

    Estudar estudaMatematica = new Estudar();
    estudaMatematica.disciplina = "Matemática";
    estudaMatematica.assunto = "Geometria";
    estudaMatematica.metodo = "Resolução de exercícios";
    estudaMatematica.objetivo = "Aprender fórmulas";
    estudaMatematica.local = "Quarto";
        
    estudaMatematica.Começar();
    estudaMatematica.Status();   
    estudaMatematica.FazerAnotações();
    estudaMatematica.Pausar();
    estudaMatematica.Retomar();
    estudaMatematica.Terminar();

   System.out.println("-----------x-----------");
   
    AssistirAula aulaHistoria = new AssistirAula();
    aulaHistoria.materia = "História";
    aulaHistoria.professor = "Dr. Silva";
    aulaHistoria.topico = "Revolução Francesa";
    aulaHistoria.modalidade = "Online";
    aulaHistoria.local = "Sala de aula virtual";

    aulaHistoria.Entrar();
    aulaHistoria.ComeçarAula();
    aulaHistoria.IniciarIntervalo();
    aulaHistoria.TerminarIntervalo();
    aulaHistoria.FinalizarAula();
    aulaHistoria.Sair();
    aulaHistoria.Status();

    
 }  
}
