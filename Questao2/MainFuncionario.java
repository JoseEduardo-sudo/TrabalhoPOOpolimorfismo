package Questao2;

public class MainFuncionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Advogado("Leandro", 5000);
        Funcionario f2 = new Policial("Fabrycio", 3500);

       
        System.out.println("Advogado");
        f1.mostrarInformacoes();
        f1.trabalho();
        
        if (f1 instanceof Advogado) {
            ((Advogado) f1).defenderCliente();
        }

        System.out.println("Policial");
        f2.mostrarInformacoes();
        f2.trabalho();
        
        if (f2 instanceof Policial) {
            ((Policial) f2).prenderSuspeito();
        }

     
        System.out.println("Aumentando no salário pra da aquela motivação: ");
        f1.aumentarSalario(10); 
        f2.aumentarSalario(5);
    }
}
