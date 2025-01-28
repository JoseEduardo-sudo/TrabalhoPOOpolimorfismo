package Questao4;

public abstract class Documento {
	protected String titulo;

    
    public Documento(String titulo) {
        this.titulo = titulo;
    }

    
    public abstract void exibirDetalhes();

   
    public String getTitulo() {
        return titulo;
    }
}
