package Questao2;

public class MainInstrumento {
    public static void main(String[] args) {
       
        InstrumentoMusical i1 = new Sanfona();
        InstrumentoMusical i2 = new Melodica();

       
        System.out.println("Sanfona");
        i1.TocarInstrumento(); 
        i1.AjustarAfinacao();   
        i1.PararDeTocar();    

       
        if (i1 instanceof Sanfona) {
           

        System.out.println("Melodica");
        i2.TocarInstrumento();  
        i2.AjustarAfinacao(); 
        i2.PararDeTocar();     

      
        if (i2 instanceof Melodica) {
           
        }
    }
    }
}