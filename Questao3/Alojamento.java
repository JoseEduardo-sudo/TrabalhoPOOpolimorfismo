package Questao3;

public abstract class Alojamento {
	protected String nome;
	protected int capacidade;

    public Alojamento(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

   
    public abstract void realizarChegada();

    
    public abstract void realizarSaida();

  
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
