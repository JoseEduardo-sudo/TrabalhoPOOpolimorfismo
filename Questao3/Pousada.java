package Questao3;

public class Pousada extends Alojamento {

  
    public Pousada(String nome, int capacidade) {
        super(nome, capacidade);
    }

    
    @Override
    public void realizarChegada() {
        System.out.println("Chegou na Pousada: " + getNome());
    }

    
    @Override
    public void realizarSaida() {
        System.out.println("Meteu pé da Pousada: " + getNome());
    }

  
    public void oferecerCaféDaManha() {
        System.out.println("Oferecendo café da manhã!");
    }
}
