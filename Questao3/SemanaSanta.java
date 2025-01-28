package Questao3;

public class SemanaSanta extends Festa {
	protected boolean jejum;

	 
	    public SemanaSanta(String data, boolean jejum) {
	        super(data);
	        this.jejum = jejum;
	    }

	    @Override
	    public void celebrar() {
	        System.out.println("Momento de paz.");
	    }

	    public void participarProcissao() {
	        System.out.println("Participando da procissão da Semana Santa.");
	    }

	    public void praticarJejum() {
	        if (jejum) {
	            System.out.println("Praticando jejum durante a Semana Santa.");
	        } else {
	            System.out.println("Sem prática de jejum nesta Semana Santa.");
	        }
	    }

}
