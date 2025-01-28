package Questao3;

public class MainAlojamento {
    public static void main(String[] args) {
       
        Alojamento bodega = new Bodega("Bodega do Sr.Zé", 20);
        Alojamento pousada = new Pousada("Pousada IF noturno", 50);

       
        System.out.println("Bodega");
        bodega.exibirInformacoes();  
        bodega.realizarChegada();    
        bodega.realizarSaida();  
      
        if (bodega instanceof Bodega) {
            ((Bodega) bodega).oferecerComida();  
        }

        System.out.println("Pousada");
        pousada.exibirInformacoes(); 
        pousada.realizarChegada();    
        pousada.realizarSaida();   
        
        if (pousada instanceof Pousada) {
            ((Pousada) pousada).oferecerCaféDaManha();  
        }
    }
}
