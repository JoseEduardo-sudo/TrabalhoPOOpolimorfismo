package Questao4;

public class Celular implements Telefone, Camera {
	protected String numero;

    
    public Celular(String numero) {
        this.numero = numero;
    }

    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

   
    @Override
    public void receberLigacao() {
        System.out.println("Atende: " + numero);
    }

   
    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto.");
    }

   
    @Override
    public void gravarVideo() {
        System.out.println("Gravando vídeo.");
    }

    
    public void exibirNumero() {
        System.out.println("Número do celular: " + numero);
    }
}

