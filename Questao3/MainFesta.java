package Questao3;

public class MainFesta {
    public static void main(String[] args) {
        
        Festa natal = new Natal("25/12/2025", "Preto");
        Festa semanaSanta = new SemanaSanta("29/03/2025", true);

       
        System.out.println("Natal");
        natal.mostrarInformacoes();
        natal.celebrar();
     
        if (natal instanceof Natal) {
            ((Natal) natal).decorarArvore();
        }

        System.out.println("Semana Santa");
        semanaSanta.mostrarInformacoes();
        semanaSanta.celebrar();
       
        if (semanaSanta instanceof SemanaSanta) {
            SemanaSanta semanaSantaObj = (SemanaSanta) semanaSanta;
            semanaSantaObj.participarProcissao();
            semanaSantaObj.praticarJejum();
        }
    }
}
