package Questao4;

public class MainCelular {
    public static void main(String[] args) {
       
        Celular celular = new Celular("40028922");

        celular.ligar("9875342");
        celular.receberLigacao();

        celular.tirarFoto();
        celular.gravarVideo();

      
        celular.exibirNumero();
    }
}

