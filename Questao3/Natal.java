package Questao3;

public class Natal extends Festa{
	protected String corPrincipal;

	  
	    public Natal(String data, String corPrincipal) {
	        super(data);
	        this.corPrincipal = corPrincipal;
	    }

	    @Override
	    public void celebrar() {
	        System.out.println("Feliz Natal! Se liga no Papai Noel!");
	    }

	  
	    public void decorarArvore() {
	        System.out.println("Decorando árvore: " + corPrincipal);
	    }

}
