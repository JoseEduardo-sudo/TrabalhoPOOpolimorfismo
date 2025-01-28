package Questao3;

public abstract class Festa {
	protected String data; 

    
    public Festa(String data) {
        this.data = data;
    }

 
    public abstract void celebrar();

    public String getData() {
        return data;
    }

    
    public void mostrarInformacoes() {
        System.out.println("Festa celebrada na data: " + data);
    }

}
