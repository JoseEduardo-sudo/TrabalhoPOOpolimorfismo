package Questao3;

public class Bodega extends Alojamento {

    
    public Bodega(String nome, int capacidade) {
        super(nome, capacidade);
    }

    
    @Override
    public void realizarChegada() {
        System.out.println("Chegou na Bodega: " + getNome());
    }

   
    @Override
    public void realizarSaida() {
        System.out.println("Vazou da Bodega: " + getNome());
    }

   
    public void oferecerComida() {
        System.out.println("Oferecendo Alimento!");
    }
}

